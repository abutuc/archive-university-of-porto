package pt.up.feup.ses.service;

import pt.up.feup.ses.exception.DirectoryNotFoundException;
import pt.up.feup.ses.exception.FileNotFoundException;
import pt.up.feup.ses.exception.PermissionNotFoundException;
import pt.up.feup.ses.exception.UserNotFoundException;
import pt.up.feup.ses.types.PermissionType;

public interface IAccessControlService {
    public boolean isFileOwner(String userId, String fileId) throws FileNotFoundException;
    public boolean isDirectoryOwner(String userId, String directoryId) throws DirectoryNotFoundException;

    public boolean hasAccessToFile(String userId, String fileId, PermissionType type) throws PermissionNotFoundException, FileNotFoundException, UserNotFoundException, DirectoryNotFoundException;
    public boolean hasAccessToDirectory(String userId, String directoryId, PermissionType type) throws PermissionNotFoundException, DirectoryNotFoundException, UserNotFoundException;
    public boolean hasAccessToDirectory(String userId, String directoryId) throws PermissionNotFoundException, DirectoryNotFoundException, UserNotFoundException;
}
