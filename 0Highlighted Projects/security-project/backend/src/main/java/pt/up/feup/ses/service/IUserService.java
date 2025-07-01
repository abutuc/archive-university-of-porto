package pt.up.feup.ses.service;

import java.util.List;

import pt.up.feup.ses.dto.UserDTO;
import pt.up.feup.ses.exception.UserNotFoundException;
import pt.up.feup.ses.types.PermissionType;

public interface IUserService {
    UserDTO getUserById(String id) throws UserNotFoundException;

    UserDTO getUserByUsername(String username) throws UserNotFoundException;

    UserDTO getUserByEmail(String email) throws UserNotFoundException;

    List<UserDTO> getAllUsers() throws UserNotFoundException;

    void createIfNotExists(String sub, String email, String name);

    void deleteUser(String id) throws UserNotFoundException;

    void grantFilePermission(String userEmail, String fileId, PermissionType type) throws UserNotFoundException;
    void grantDirectoryPermission(String userEmail, String directoryId, PermissionType type) throws UserNotFoundException;

    void revokeFilePermission(String userEmail, String fileId) throws UserNotFoundException;
    void revokeDirectoryPermission(String userEmail, String directoryId) throws UserNotFoundException;
}
