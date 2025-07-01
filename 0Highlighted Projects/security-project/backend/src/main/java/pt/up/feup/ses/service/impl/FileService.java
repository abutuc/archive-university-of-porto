package pt.up.feup.ses.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.tika.Tika;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import fi.solita.clamav.ClamAVClient;
import io.minio.BucketExistsArgs;
import io.minio.GetObjectArgs;
import io.minio.GetPresignedObjectUrlArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import io.minio.RemoveObjectArgs;
import io.minio.errors.ErrorResponseException;
import io.minio.errors.InsufficientDataException;
import io.minio.errors.InternalException;
import io.minio.errors.InvalidResponseException;
import io.minio.errors.ServerException;
import io.minio.errors.XmlParserException;
import io.minio.http.Method;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import pt.up.feup.ses.dto.FileDTO;
import pt.up.feup.ses.dto.UploadFileDTO;
import pt.up.feup.ses.entity.File;
import pt.up.feup.ses.entity.Permission;
import pt.up.feup.ses.exception.FileNotFoundException;
import pt.up.feup.ses.repository.DirectoryRepository;
import pt.up.feup.ses.repository.FileRepository;
import pt.up.feup.ses.repository.PermissionRepository;
import pt.up.feup.ses.repository.UserRepository;
import pt.up.feup.ses.service.IFileService;

@ApplicationScoped
public class FileService implements IFileService {
    
    private final FileRepository fileRepository;
    private final UserRepository userRepository;
    private final DirectoryRepository directoryRepository;
    private final PermissionRepository permissionRepository;

    private static final List<String> ALLOWED_MIME_TYPES = List.of("application/pdf", "image/jpeg", "image/png", "text/plain", "text/html", "text/css", "application/javascript");
    private static final long MAX_FILE_SIZE = 10 * 1024 * 1024;

    @Inject
    MinioClient minioClient;

    @ConfigProperty(name = "minio.uploads")
    String bucketName;

    @Inject
    public FileService(FileRepository fileRepository, UserRepository userRepository, DirectoryRepository directoryRepository, PermissionRepository permissionRepository) throws InvalidKeyException, ErrorResponseException, InsufficientDataException, InternalException, InvalidResponseException, NoSuchAlgorithmException, ServerException, XmlParserException, IllegalArgumentException, IOException {
        this.fileRepository = fileRepository;
        this.userRepository = userRepository;
        this.directoryRepository = directoryRepository;
        this.permissionRepository = permissionRepository;
    }

    @PostConstruct
    void ensureBucketExists() {
        try {
            boolean found = minioClient.bucketExists(BucketExistsArgs.builder().bucket(bucketName).build());
            if (!found) {
                minioClient.makeBucket(MakeBucketArgs.builder().bucket(bucketName).build());
            }
        } catch (Exception e) {
            e.printStackTrace(); // or use a logger
        }
    }

    @Override
    public FileDTO getFileById(String id) throws FileNotFoundException {
        File file = fileRepository.findById(id)
                .orElseThrow(() -> new FileNotFoundException("File not found with id: " + id));

        return convertToDTO(file);
    }

    @Override
    public FileDTO getFileByName(String name) throws FileNotFoundException {
        File file = fileRepository.findByName(name)
                .orElseThrow(() -> new FileNotFoundException("File not found with storage name: " + name));

        return convertToDTO(file);
    }

    @Override
    public List<FileDTO> getFileByMimeType(String mimeType) throws FileNotFoundException {
        List<File> files = fileRepository.findByMimeType(mimeType);
        if (files.isEmpty()) {
            throw new FileNotFoundException("No files found with mime type: " + mimeType);
        }

        return files.stream()
                .map(this::convertToDTO)
                .toList();
    }

    @Override
    public List<FileDTO> getFileByDirectoryId(String directoryId) throws FileNotFoundException {
        List<File> files = fileRepository.findByDirectoryId(directoryId);
        if (files.isEmpty()) {
            throw new FileNotFoundException("No files found for directory with id: " + directoryId);
        }

        return files.stream()
                .map(this::convertToDTO)
                .toList();
    }

    @Override
    public List<FileDTO> getFileByOwnerId(String ownerId) throws FileNotFoundException {
        List<File> files = fileRepository.findByOwnerId(ownerId);
        if (files.isEmpty()) {
            throw new FileNotFoundException("No files found for owner with id: " + ownerId);
        }
        return files.stream()
                .map(this::convertToDTO)
                .toList();
    }

    @Override
    public List<FileDTO> getFileByOwnerIdAndDirectoryId(String ownerId, String directoryId) throws FileNotFoundException {
        List<File> files = fileRepository.findByOwnerIdAndDirectoryId(ownerId, directoryId);
        if (files.isEmpty()) {
            throw new FileNotFoundException("No files found for owner with id: " + ownerId + " and directory with id: " + directoryId);
        }
        return files.stream()
                .map(this::convertToDTO)
                .toList();
    }

    @Override
    public boolean validateFile(UploadFileDTO form) {
        try {
           
            boolean isMimeTypeAllowed = isMimeTypeAllowed(form.getFileData());
            boolean isSizeAllowed = isSizeAllowed(form.getFileData());
            boolean isFilenameSafe = isFilenameSafe(form.getName());
            boolean isVirusFree = isVirusFree(form);
            boolean isMaliciousCode = isMaliciousCode(form);

            System.out.println("isMimeTypeAllowed: " + String.valueOf(isMimeTypeAllowed));
            System.out.println("isSizeAllowed: " + String.valueOf(isSizeAllowed));
            System.out.println("isFilenameSafe: " + String.valueOf(isFilenameSafe));
            System.out.println("isVirusFree: " + String.valueOf(isVirusFree));
            System.out.println("isMaliciousCode: " + String.valueOf(isMaliciousCode));

            return isMimeTypeAllowed && isSizeAllowed && isFilenameSafe && isVirusFree && !isMaliciousCode;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    @Transactional
    public FileDTO createFile(FileDTO fileDTO) throws FileNotFoundException {
        File file = convertToEntity(fileDTO);
        String ownerId = file.getOwner().getId();

        List<String> fileIds = fileRepository.findFileIdsByOwnerId(ownerId);

        int maxNum = fileIds.stream()
                .map(id -> {
                    String[] parts = id.split("-file-");
                    try {
                        return Integer.parseInt(parts[1]);
                    } catch (Exception e) {
                        return -1; // In case the format is wrong, ignore
                    }
                })
                .max(Integer::compareTo)
                .orElse(-1);

        int nextNum = maxNum + 1;
        file.setId("user-" + ownerId + "-file-" + nextNum);
        fileRepository.persistAndFlush(file);
        return convertToDTO(file);
    }

    @Override
    @Transactional
    public FileDTO updateFile(String id, FileDTO fileDTO) throws FileNotFoundException {
        File existingFile = fileRepository.findById(id)
                .orElseThrow(() -> new FileNotFoundException("File not found with id: " + id));

        existingFile.setName(fileDTO.getName());
        existingFile.setStorageName(fileDTO.getStorageName());
        existingFile.setMimeType(fileDTO.getMimeType());
        existingFile.setSize(fileDTO.getSize());
        existingFile.setDirectory(directoryRepository.findById(fileDTO.getDirectoryId()).orElse(null));
        existingFile.setOwner(userRepository.findByIdOptional(fileDTO.getOwnerId()).orElse(null));

        fileRepository.persistAndFlush(existingFile);
        return convertToDTO(existingFile);
    }

    @Override
    @Transactional
    public FileDTO updateFileName(String id, String name) throws FileNotFoundException {
        File existingFile = fileRepository.findById(id)
                .orElseThrow(() -> new FileNotFoundException("File not found with id: " + id));

        existingFile.setName(name);

        fileRepository.persistAndFlush(existingFile);
        return convertToDTO(existingFile);
    }

    @Override
    @Transactional
    public void deleteFile(String id) throws FileNotFoundException {
        File file = fileRepository.findById(id)
                .orElseThrow(() -> new FileNotFoundException("File not found with id: " + id));

        // Delete all associated Permissions first
        List<Permission> permissions = permissionRepository.findByResourceId(id);
        for (Permission permission : permissions) {
            permissionRepository.delete(permission);
        }

        fileRepository.delete(file);

        if (file.getDirectory().getId().contains("public-html-")) {
            deleteLocalFile(file.getDirectory().getId(), file.getName());
        }
        else {
            try {
                deleteFileFromMinio(file.getStorageName().toString());
            } catch (Exception e) {
                throw new RuntimeException("Failed to delete file from MinIO: " + e.getMessage(), e);
            }
        }
    }

    private FileDTO convertToDTO(File file) {
        FileDTO fileDTO = new FileDTO();
        fileDTO.setId(file.getId());
        fileDTO.setName(file.getName());
        fileDTO.setStorageName(file.getStorageName());
        fileDTO.setMimeType(file.getMimeType());
        fileDTO.setSize(file.getSize());
        fileDTO.setDirectoryId(file.getDirectory().getId());
        fileDTO.setOwnerId(file.getOwner().getId());
        return fileDTO;
    }

    private File convertToEntity(FileDTO fileDTO) {
        File file = new File();
        file.setName(fileDTO.getName());
        file.setStorageName(fileDTO.getStorageName());
        file.setMimeType(fileDTO.getMimeType());
        file.setSize(fileDTO.getSize());
        file.setDirectory(directoryRepository.findById(fileDTO.getDirectoryId()).orElse(null));
        file.setOwner(userRepository.findByIdOptional(fileDTO.getOwnerId()).orElse(null));
        return file;
    }

    public void uploadFile(String objectName, InputStream data, long size, String contentType) throws InvalidKeyException, ErrorResponseException, InsufficientDataException, InternalException, InvalidResponseException, NoSuchAlgorithmException, ServerException, XmlParserException, IllegalArgumentException, IOException {
        minioClient.putObject(
            PutObjectArgs.builder()
                .bucket(bucketName)
                .object(objectName)
                .stream(data, size, -1)
                .contentType(contentType)
                .build()
        );
    }

    public void updateFile(String objectName, InputStream data, long size, String contentType) throws InvalidKeyException, ErrorResponseException, InsufficientDataException, InternalException, InvalidResponseException, NoSuchAlgorithmException, XmlParserException, ServerException, IllegalArgumentException, IOException {
        minioClient.putObject(
            PutObjectArgs.builder()
                .bucket(bucketName)
                .object(objectName)
                .stream(data, size, -1)
                .contentType(contentType)
                .build()
        );
    }

    public String generatePresignedUrl(String objectName, int expirySeconds) throws InvalidKeyException, ErrorResponseException, InsufficientDataException, InternalException, InvalidResponseException, NoSuchAlgorithmException, XmlParserException, ServerException, IllegalArgumentException, IOException {
        return minioClient.getPresignedObjectUrl(
            GetPresignedObjectUrlArgs.builder()
                .method(Method.GET)
                .bucket(bucketName)
                .object(objectName)
                .expiry(expirySeconds)
                .build()
        );
    }

    public InputStream downloadFile(String objectName) throws InvalidKeyException, ErrorResponseException, InsufficientDataException, InternalException, InvalidResponseException, NoSuchAlgorithmException, XmlParserException, ServerException, IllegalArgumentException, IOException {
        return minioClient.getObject(
            GetObjectArgs.builder()
                .bucket(bucketName)
                .object(objectName)
                .build()
        );
    }

    private void deleteFileFromMinio(String objectName) throws InvalidKeyException, ErrorResponseException, InsufficientDataException, InternalException, InvalidResponseException, NoSuchAlgorithmException, XmlParserException, ServerException, IllegalArgumentException, IOException {
        minioClient.removeObject(
            RemoveObjectArgs.builder()
                .bucket(bucketName)
                .object(objectName)
                .build()
        );
    }

    private void deleteLocalFile(String directoryId, String fileName) {
        if (directoryId != null && directoryId.startsWith("public-html-")) {
            // Extract username
            String username = directoryId.replaceFirst("public-html-", "");

            // Build path to the file
            String filePath = "public_html" + java.io.File.separator + username + java.io.File.separator + fileName;
            java.io.File file = new java.io.File(filePath);

            if (file.exists()) {
                boolean deleted = file.delete();
                if (!deleted) {
                    System.err.println("Failed to delete file: " + file.getAbsolutePath());
                }
            } else {
                System.out.println("File not found, nothing to delete: " + file.getAbsolutePath());
            }
        } else {
            System.out.println("Directory ID does not match expected pattern: " + directoryId);
        }
    }

    private boolean isMimeTypeAllowed(byte[] file) {
        Tika tika = new Tika();
        String mimeType = tika.detect(file);
        return ALLOWED_MIME_TYPES.contains(mimeType);
    }

    private boolean isSizeAllowed(byte[] file) {
        return file.length <= MAX_FILE_SIZE;
    }

    private boolean isFilenameSafe(String filename) {
        return !filename.contains("..") && !filename.contains("/") && !filename.contains("\\");
    }

    private boolean isVirusFree(UploadFileDTO form) {
        ClamAVClient cl = new ClamAVClient("clamav", 3310);
        byte[] reply;
        try {
            reply = cl.scan(form.getFileData());
        } catch (Exception e) {
            System.err.println("Virus scan failed: " + e.getClass().getName() + " - " + e.getMessage()); 
            e.printStackTrace();
            throw new RuntimeException("Could not scan the input", e);
        }
        return ClamAVClient.isCleanReply(reply);
    }

    private boolean isMaliciousCode(UploadFileDTO form) {
        if (!List.of("text/html", "text/css", "application/javascript").contains(form.getMimeType())) {
            return false;
        }

        try {

            String ext = getExtensionFromMimeType(form.getMimeType());
            Path tempFile = Files.createTempFile("upload-", ext);
            Files.write(tempFile, form.getFileData());

            ProcessBuilder pb = new ProcessBuilder(
    "semgrep", "--config=p/security-audit", "--json", "--quiet", tempFile.toAbsolutePath().toString()
            );

            pb.redirectErrorStream(true);

            Process process = pb.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String output = reader.lines().collect(Collectors.joining("\n"));

            System.out.println("Semgrep raw output:");
            System.out.println(output);
            
            if (process.waitFor() != 0) {
                System.err.println("Semgrep scan failed or had errors.");
                return true;
            }

            int idx = output.indexOf('{');
            if (idx < 0) {
                System.err.println("No JSON object found in output!");
                return true;
            }
            String json = output.substring(idx);

            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(json);
            JsonNode results = root.get("results");

            return results != null && results.size() > 0;

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return true;
        }
    }

    private String getExtensionFromMimeType(String mimeType) {
        switch (mimeType) {
            case "text/html": return ".html";
            case "text/css": return ".css";
            case "application/javascript": return ".js";
            default: return ".txt";
        }
    }


}
