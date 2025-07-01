package pt.up.feup.ses.service.impl;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import pt.up.feup.ses.dto.DirectoryDTO;
import pt.up.feup.ses.entity.Directory;
import pt.up.feup.ses.entity.File;
import pt.up.feup.ses.entity.Permission;
import pt.up.feup.ses.exception.DirectoryNotFoundException;
import pt.up.feup.ses.exception.OperationInvalidOnPublicHTMLDirectoryException;
import pt.up.feup.ses.repository.DirectoryRepository;
import pt.up.feup.ses.repository.FileRepository;
import pt.up.feup.ses.repository.PermissionRepository;
import pt.up.feup.ses.repository.UserRepository;
import pt.up.feup.ses.service.IDirectoryService;

@ApplicationScoped
public class DirectoryService implements IDirectoryService {
    
    private final DirectoryRepository directoryRepository;
    private final UserRepository userRepository;
    private final FileRepository fileRepository;
    private final PermissionRepository permissionRepository;

    @Inject
    public DirectoryService(DirectoryRepository directoryRepository, UserRepository userRepository, FileRepository fileRepository, PermissionRepository permissionRepository) {
        this.directoryRepository = directoryRepository;
        this.userRepository = userRepository;
        this.fileRepository = fileRepository;
        this.permissionRepository = permissionRepository;
    }

    @Override
    public DirectoryDTO getDirectoryById(String id) throws DirectoryNotFoundException {
        Directory directory = directoryRepository.findById(id)
                .orElseThrow(() -> new DirectoryNotFoundException("Directory not found with id: " + id));

        return convertToDTO(directory);
    }

    @Override
    public DirectoryDTO getDirectoryByName(String name) throws DirectoryNotFoundException {
        Directory directory = directoryRepository.findByName(name)
                .orElseThrow(() -> new DirectoryNotFoundException("Directory not found with name: " + name));

        return convertToDTO(directory);
    }

    @Override
    public List<DirectoryDTO> getDirectoryByPath(String path) throws DirectoryNotFoundException {
        List<Directory> directories = directoryRepository.findByPath(path);
        if (directories.isEmpty()) {
            throw new DirectoryNotFoundException("No directories found with path: " + path);
        }

        return directories.stream()
                .map(this::convertToDTO)
                .toList();
    }

    @Override
    public List<DirectoryDTO> getDirectoryByParentDirectoryId(String parentDirectoryId)
            throws DirectoryNotFoundException {
        List<Directory> directories = directoryRepository.findByParentDirectoryId(parentDirectoryId);
        return directories.stream()
                .map(this::convertToDTO)
                .toList();
    }

    @Override
    public List<DirectoryDTO> getDirectoryByOwnerId(String ownerId) throws DirectoryNotFoundException {
        List<Directory> directories = directoryRepository.findByOwnerId(ownerId);
        if (directories.isEmpty()) {
            throw new DirectoryNotFoundException("No directories found with owner id: " + ownerId);
        }
        return directories.stream()
                .map(this::convertToDTO)
                .toList();
    }

    @Override
    public List<DirectoryDTO> getDirectoryByOwnerIdAndParentDirectoryId(String ownerId, String parentDirectoryId)
            throws DirectoryNotFoundException {
        List<Directory> directories = directoryRepository.findByOwnerIdAndParentDirectoryId(ownerId, parentDirectoryId);
        if (directories.isEmpty()) {
            throw new DirectoryNotFoundException("No directories found with owner id: " + ownerId
                    + " and parent directory id: " + parentDirectoryId);
        }
        return directories.stream()
                .map(this::convertToDTO)
                .toList();
    }

    @Override
    @Transactional
    public DirectoryDTO createDirectory(DirectoryDTO directoryDTO) throws DirectoryNotFoundException {
        Directory directory = convertToEntity(directoryDTO);
        String ownerId = directory.getOwner().getId();

        List<String> dirIds = directoryRepository.findDirectoryIdsByOwnerId(ownerId);

        int maxNum = dirIds.stream()
                .map(id -> {
                    String[] parts = id.split("-dir-");
                    try {
                        return Integer.parseInt(parts[1]);
                    } catch (Exception e) {
                        return -1; // In case the format is wrong, ignore
                    }
                })
                .max(Integer::compareTo)
                .orElse(-1);

        int nextNum = maxNum + 1;
        directory.setId("user-" + ownerId + "-dir-" + nextNum);

        Directory parentDirectory = directory.getParentDirectory();
        directory.setPath(parentDirectory.getPath() + directory.getName() + "/");

        directoryRepository.persistAndFlush(directory);
        return convertToDTO(directory);
    }


    @Override
    @Transactional
    public DirectoryDTO updateDirectory(String id, DirectoryDTO directoryDTO) throws DirectoryNotFoundException, OperationInvalidOnPublicHTMLDirectoryException {
        if (isPublicHtmlDirectory(id)) throw new OperationInvalidOnPublicHTMLDirectoryException("Delete operation is invalid for public html directory.");
        
        Directory existingDirectory = directoryRepository.findById(id)
                .orElseThrow(() -> new DirectoryNotFoundException("Directory not found with id: " + id));

        existingDirectory.setName(directoryDTO.getName());
        existingDirectory.setPath(directoryDTO.getPath());
        existingDirectory.setOwner(userRepository.findByIdOptional(directoryDTO.getOwnerId()).orElse(null));
        if (directoryDTO.getParentId() != null) {
            existingDirectory.setParentDirectory(directoryRepository.findById(directoryDTO.getParentId()).orElse(null));
        }

        directoryRepository.persistAndFlush(existingDirectory);
        return convertToDTO(existingDirectory);
    }

    @Override
    @Transactional
    public void deleteDirectory(String id) throws DirectoryNotFoundException, OperationInvalidOnPublicHTMLDirectoryException {
        if (isPublicHtmlDirectory(id)) throw new OperationInvalidOnPublicHTMLDirectoryException("Delete operation is invalid for public html directory.");

        Directory directory = directoryRepository.findById(id)
                .orElseThrow(() -> new DirectoryNotFoundException("Directory not found with id: " + id));

       // Delete all files in this directory
        List<File> files = fileRepository.findByDirectoryId(id);
        for (File file : files) {
            // Delete permissions for this file
            List<Permission> filePerms = permissionRepository.findByResourceId(file.getId());
            for (Permission perm : filePerms) {
                permissionRepository.delete(perm);
            }
            fileRepository.delete(file);
        }

        // Recursively delete all subdirectories
        List<Directory> subDirs = directoryRepository.findByParentDirectoryId(id);
        for (Directory subDir : subDirs) {
            deleteDirectory(subDir.getId());
        }

        // Delete permissions for this directory
        List<Permission> dirPerms = permissionRepository.findByResourceId(id);
        for (Permission perm : dirPerms) {
            permissionRepository.delete(perm);
        }


        directoryRepository.delete(directory);
    }

    private DirectoryDTO convertToDTO(Directory directory) {
        DirectoryDTO directoryDTO = new DirectoryDTO();
        directoryDTO.setId(directory.getId());
        directoryDTO.setName(directory.getName());
        directoryDTO.setPath(directory.getPath());
        directoryDTO.setOwnerId(directory.getOwner().getId());
        directoryDTO.setParentId(directory.getParentDirectory() != null ? directory.getParentDirectory().getId() : null);
        return directoryDTO;
    }

    private Directory convertToEntity(DirectoryDTO directoryDTO) {
        Directory directory = new Directory();
        directory.setName(directoryDTO.getName());
        directory.setPath(directoryDTO.getPath());
        directory.setOwner(userRepository.findByIdOptional(directoryDTO.getOwnerId()).orElse(null));
        if (directoryDTO.getParentId() != null) {
            directory.setParentDirectory(directoryRepository.findById(directoryDTO.getParentId()).orElse(null));
        }
        return directory;
    }

    private boolean isPublicHtmlDirectory(String id) {
        return id.contains("public-html-");
    }
}
