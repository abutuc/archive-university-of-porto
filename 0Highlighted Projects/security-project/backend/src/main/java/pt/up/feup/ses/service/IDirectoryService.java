package pt.up.feup.ses.service;

import java.util.List;

import pt.up.feup.ses.dto.DirectoryDTO;
import pt.up.feup.ses.exception.DirectoryNotFoundException;
import pt.up.feup.ses.exception.OperationInvalidOnPublicHTMLDirectoryException;

public interface IDirectoryService {
    DirectoryDTO getDirectoryById(String id) throws DirectoryNotFoundException;

    DirectoryDTO getDirectoryByName(String name) throws DirectoryNotFoundException;

    List<DirectoryDTO> getDirectoryByPath(String path) throws DirectoryNotFoundException;

    List<DirectoryDTO> getDirectoryByParentDirectoryId(String parentDirectoryId) throws DirectoryNotFoundException;

    List<DirectoryDTO> getDirectoryByOwnerId(String ownerId) throws DirectoryNotFoundException;

    List<DirectoryDTO> getDirectoryByOwnerIdAndParentDirectoryId(String ownerId, String parentDirectoryId) throws DirectoryNotFoundException;

    DirectoryDTO createDirectory(DirectoryDTO directoryDTO) throws DirectoryNotFoundException;

    DirectoryDTO updateDirectory(String id, DirectoryDTO directoryDTO) throws DirectoryNotFoundException, OperationInvalidOnPublicHTMLDirectoryException;

    void deleteDirectory(String id) throws DirectoryNotFoundException, OperationInvalidOnPublicHTMLDirectoryException;
}
