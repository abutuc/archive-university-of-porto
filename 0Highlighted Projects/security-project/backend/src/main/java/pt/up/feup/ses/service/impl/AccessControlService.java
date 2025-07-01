package pt.up.feup.ses.service.impl;

import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import pt.up.feup.ses.entity.Directory;
import pt.up.feup.ses.entity.File;
import pt.up.feup.ses.entity.User;
import pt.up.feup.ses.entity.Permission;
import pt.up.feup.ses.exception.DirectoryNotFoundException;
import pt.up.feup.ses.exception.FileNotFoundException;
import pt.up.feup.ses.exception.PermissionNotFoundException;
import pt.up.feup.ses.exception.UserNotFoundException;
import pt.up.feup.ses.repository.DirectoryRepository;
import pt.up.feup.ses.repository.FileRepository;
import pt.up.feup.ses.repository.PermissionRepository;
import pt.up.feup.ses.repository.UserRepository;
import pt.up.feup.ses.service.IAccessControlService;
import pt.up.feup.ses.types.PermissionType;
import pt.up.feup.ses.types.ResourceType;

@ApplicationScoped
public class AccessControlService implements IAccessControlService {

    private final FileRepository fileRepository;
    private final UserRepository userRepository;
    private final DirectoryRepository directoryRepository;
    private final PermissionRepository permissionRepository;

    @Inject
    public AccessControlService(FileRepository fileRepository, UserRepository userRepository, DirectoryRepository directoryRepository, PermissionRepository permissionRepository) {
        this.fileRepository = fileRepository;
        this.userRepository = userRepository;
        this.directoryRepository = directoryRepository;
        this.permissionRepository = permissionRepository;
    }

    @Override
    public boolean isFileOwner(String userId, String fileId) throws FileNotFoundException {
        File file = fileRepository.findById(fileId)
                .orElseThrow(() -> new FileNotFoundException("File not found with id: " + fileId));

        return file.getOwner().getId().equals(userId);
    }

    @Override
    public boolean isDirectoryOwner(String userId, String directoryId) throws DirectoryNotFoundException {
        Directory directory = directoryRepository.findById(directoryId)
                .orElseThrow(() -> new DirectoryNotFoundException("Directory not found with id: " + directoryId));

        return directory.getOwner().getId().equals(userId);
    }

    @Override
    public boolean hasAccessToFile(String userId, String fileId, PermissionType type)
            throws PermissionNotFoundException, FileNotFoundException, UserNotFoundException {

        User user = userRepository.findByIdOptional(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + userId));

        File file = fileRepository.findById(fileId)
                .orElseThrow(() -> new FileNotFoundException("File not found with id: " + fileId));

        if (user.getId().equals(file.getOwner().getId())) {
            return true;
        }

        Optional<Permission> permissionOpt = permissionRepository.findByUserAndResource(userId, ResourceType.FILE, fileId);

        if (permissionOpt.isPresent()) {
            if (type == PermissionType.VIEW) {
                return true;
            } else if (type == PermissionType.EDIT) {
                if (permissionOpt.get().getPermissionType() == PermissionType.EDIT
                        || permissionOpt.get().getPermissionType() == PermissionType.DELETE) {
                    return true;
                }
            } else if (type == PermissionType.DELETE && permissionOpt.get().getPermissionType() == PermissionType.DELETE) {
                return true;
            }
        }

        return hasDirectoryPermission(userId, file.getDirectory(), type);
    }

    @Override
    public boolean hasAccessToDirectory(String userId, String directoryId, PermissionType type)
            throws PermissionNotFoundException, DirectoryNotFoundException, UserNotFoundException {

        User user = userRepository.findByIdOptional(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + userId));

        Directory directory = directoryRepository.findById(directoryId)
                .orElseThrow(() -> new DirectoryNotFoundException("Directory not found with id: " + directoryId));

        if (user.getId().equals(directory.getOwner().getId())) {
            return true;
        }

        Optional<Permission> permissionOpt = permissionRepository.findByUserAndResource(userId, ResourceType.DIRECTORY, directoryId);
        if (permissionOpt.isPresent()) {
            if (type == PermissionType.VIEW) {
                return true;
            } else if (type == PermissionType.EDIT) {
                if (permissionOpt.get().getPermissionType() == PermissionType.EDIT
                        || permissionOpt.get().getPermissionType() == PermissionType.DELETE) {
                    return true;
                }
            } else if (type == PermissionType.DELETE && permissionOpt.get().getPermissionType() == PermissionType.DELETE) {
                return true;
            }
        }

        return hasDirectoryPermission(userId, directory.getParentDirectory(), type);
    }

        @Override
        public boolean hasAccessToDirectory(String userId, String directoryId)
                throws PermissionNotFoundException, DirectoryNotFoundException, UserNotFoundException {

            User user = userRepository.findByIdOptional(userId)
                    .orElseThrow(() -> new UserNotFoundException("User not found with id: " + userId));

            Directory directory = directoryRepository.findById(directoryId)
                    .orElseThrow(() -> new DirectoryNotFoundException("Directory not found with id: " + directoryId));

            if (user.getId().equals(directory.getOwner().getId())) {
                return true;
            }

            Optional<Permission> permissionOpt = permissionRepository.findByUserAndResource(userId, ResourceType.DIRECTORY, directoryId);
            if (permissionOpt.isPresent()) {
                return true;
            }

            return hasDirectoryPermission(userId, directory.getParentDirectory());
            
        }

    private boolean hasDirectoryPermission(String userId, Directory directory, PermissionType type) {
        while (directory != null) {
            Optional<Permission> permissionOpt = permissionRepository.findByUserAndResource(
                userId, ResourceType.DIRECTORY, directory.getId());
    
            if (permissionOpt.isPresent()) {
                Permission permission = permissionOpt.get();
                if (permission.getUser().getId().equals(userId)
                    && permission.getResourceType() == ResourceType.DIRECTORY
                    && permission.getResourceId().equals(directory.getId())) {
                    if (type == PermissionType.VIEW) {
                        return true;
                    } else if (type == PermissionType.EDIT) {
                        if (permission.getPermissionType() == PermissionType.EDIT
                            || permission.getPermissionType() == PermissionType.DELETE) {
                            return true;
                        }
                    } else if (type == PermissionType.DELETE && permission.getPermissionType() == PermissionType.DELETE) {
                        return true;
                    }
                }
            }

            directory = directory.getParentDirectory();
        }
        return false;
    }

    private boolean hasDirectoryPermission(String userId, Directory directory) {
        while (directory != null) {
            Optional<Permission> permissionOpt = permissionRepository.findByUserAndResource(
                userId, ResourceType.DIRECTORY, directory.getId());
    
            if (permissionOpt.isPresent()) {
                Permission permission = permissionOpt.get();
                if (permission.getUser().getId().equals(userId)
                    && permission.getResourceType() == ResourceType.DIRECTORY
                    && permission.getResourceId().equals(directory.getId())) {
                    return true;
                }
            }
    
            directory = directory.getParentDirectory();
        }
        return false;
    }
}
