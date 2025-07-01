package pt.up.feup.ses.service.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import pt.up.feup.ses.dto.UserDTO;
import pt.up.feup.ses.entity.Directory;
import pt.up.feup.ses.entity.Permission;
import pt.up.feup.ses.entity.User;
import pt.up.feup.ses.exception.UserNotFoundException;
import pt.up.feup.ses.repository.DirectoryRepository;
import pt.up.feup.ses.repository.PermissionRepository;
import pt.up.feup.ses.repository.UserRepository;
import pt.up.feup.ses.service.IUserService;
import pt.up.feup.ses.types.PermissionType;
import pt.up.feup.ses.types.ResourceType;

@ApplicationScoped
public class UserService implements  IUserService {

    private final UserRepository userRepository;
    private final PermissionRepository permissionRepository;
    private final DirectoryRepository directoryRepository;

    @Inject
    public UserService(UserRepository userRepository, PermissionRepository permissionRepository, DirectoryRepository directoryRepository) {
        this.userRepository = userRepository;
        this.permissionRepository = permissionRepository;
        this.directoryRepository = directoryRepository;
    }

    @Override
    public UserDTO getUserById(String id) throws UserNotFoundException {
        User user = userRepository.findByIdOptional(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));

        return convertToDTO(user);
    }

    @Override
    public UserDTO getUserByUsername(String username) throws UserNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UserNotFoundException("User not found with username: " + username));

        return convertToDTO(user);
    }

    @Override
    public UserDTO getUserByEmail(String email) throws UserNotFoundException {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UserNotFoundException("User not found with email: " + email));

        return convertToDTO(user);
    }

    @Override
    public List<UserDTO> getAllUsers() throws UserNotFoundException {
        List<User> users = userRepository.listAll();
        if (users.isEmpty()) {
            throw new UserNotFoundException("No users found");
        }

        return users.stream()
                .map(this::convertToDTO)
                .toList();
    }

    @Override
    @Transactional
    public void createIfNotExists(String sub, String email, String name) {
        Optional<User> existingUserOpt = userRepository.findByIdOptional(sub);

        if (existingUserOpt.isEmpty()) {
            // Create new user
            User newUser = new User();
            newUser.setId(sub);
            newUser.setEmail(email);
            newUser.setUsername(extractUsername(email, name));

            userRepository.persistAndFlush(newUser);

            // Create root directory
            Directory root = new Directory();
            root.setId("user-" + sub + "-dir-0");
            root.setName("");
            root.setOwner(newUser);
            root.setParentDirectory(null);
            root.setPath("/");
            directoryRepository.persistAndFlush(root);

            // Create public_html
            Directory pub = new Directory();
            pub.setId("public-html-" + newUser.getUsername());
            pub.setName("public_html");
            pub.setOwner(newUser);
            pub.setParentDirectory(root);
            pub.setPath("/public_html");
            directoryRepository.persistAndFlush(pub);

            createLocalDirectory(newUser.getUsername());
        }
    }

    @Override
    @Transactional
    public void deleteUser(String id) throws UserNotFoundException {
        User user = userRepository.findByIdOptional(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));

        userRepository.delete(user);
    }

    @Override
    @Transactional
    public void grantFilePermission(String userEmail, String fileId, PermissionType type) throws UserNotFoundException {
        User user = userRepository.findByEmail(userEmail)
                .orElseThrow(() -> new UserNotFoundException("User not found with email: " + userEmail));

        Permission permission = new Permission();
        permission.setUser(user);
        permission.setResourceType(ResourceType.FILE);
        permission.setResourceId(fileId);
        permission.setPermissionType(type);

        permissionRepository.persistAndFlush(permission);
    }

    @Override
    @Transactional
    public void grantDirectoryPermission(String userEmail, String directoryId, PermissionType type) throws UserNotFoundException {
        User user = userRepository.findByEmail(userEmail)
                .orElseThrow(() -> new UserNotFoundException("User not found with email: " + userEmail));

        Permission permission = new Permission();
        permission.setUser(user);
        permission.setResourceType(ResourceType.DIRECTORY);
        permission.setResourceId(directoryId);
        permission.setPermissionType(type);

        permissionRepository.persistAndFlush(permission);
    }

    @Override
    @Transactional
    public void revokeFilePermission(String userEmail, String fileId) throws UserNotFoundException {
        User user = userRepository.findByEmail(userEmail)
                .orElseThrow(() -> new UserNotFoundException("User not found with email: " + userEmail));

        Permission permission = permissionRepository.findByUserAndResource(user.getId(), ResourceType.FILE, fileId)
                .orElseThrow(() -> new UserNotFoundException("Permission not found for user: " + userEmail + " on file: " + fileId));

        permissionRepository.delete(permission);
    }

    @Override
    @Transactional
    public void revokeDirectoryPermission(String userEmail, String directoryId) throws UserNotFoundException {
        User user = userRepository.findByEmail(userEmail)
                .orElseThrow(() -> new UserNotFoundException("User not found with email: " + userEmail));

        Permission permission = permissionRepository.findByUserAndResource(user.getId(), ResourceType.DIRECTORY, directoryId)
                .orElseThrow(() -> new UserNotFoundException("Permission not found for user: " + userEmail + " on directory: " + directoryId));

        permissionRepository.delete(permission);
    }

    private UserDTO convertToDTO(User user) {
        return new UserDTO(
            user.getId(),
            user.getUsername(),
            user.getEmail()
        );
    }

    private void createLocalDirectory(String username) {
        try {
            Path targetDir = Paths.get("/app/public_html", username);
            Files.createDirectories(targetDir);
        } catch (IOException e) {
            throw new RuntimeException("Failed to create local directory", e);
        }
    }

    private String extractUsername(String email, String name) {
    if (name != null && !name.isBlank()) {
        return name.trim().replaceAll("\\s+", "_").toLowerCase();
    }
    return email.split("@")[0];
}


}
