package pt.up.feup.ses.service;

import java.util.List;

import pt.up.feup.ses.dto.FileDTO;
import pt.up.feup.ses.dto.UploadFileDTO;
import pt.up.feup.ses.exception.FileNotFoundException;

public interface IFileService {
    FileDTO getFileById(String id) throws FileNotFoundException;

    FileDTO getFileByName(String name) throws FileNotFoundException;

    List<FileDTO> getFileByMimeType(String mimeType) throws FileNotFoundException;

    List<FileDTO> getFileByDirectoryId(String directoryId) throws FileNotFoundException;

    List<FileDTO> getFileByOwnerId(String ownerId) throws FileNotFoundException;

    List<FileDTO> getFileByOwnerIdAndDirectoryId(String ownerId, String directoryId) throws FileNotFoundException;

    boolean validateFile(UploadFileDTO form);

    FileDTO createFile(FileDTO fileDTO) throws FileNotFoundException;

    FileDTO updateFile(String id, FileDTO fileDTO) throws FileNotFoundException;

    FileDTO updateFileName(String id, String name) throws FileNotFoundException;

    void deleteFile(String id) throws FileNotFoundException;
}
