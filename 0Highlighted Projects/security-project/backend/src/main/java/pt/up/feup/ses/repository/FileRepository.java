package pt.up.feup.ses.repository;

import java.util.List;
import java.util.Optional;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import pt.up.feup.ses.entity.File;

@ApplicationScoped
public class FileRepository implements PanacheRepository<File> {
    public File save(File file) {
        persist(file);
        return file;
    }

    public Optional<File> findById(String id) {
        return find("id", id).firstResultOptional();
    }

    public Optional<File> findByName(String name) {
        return find("name", name).firstResultOptional();
    }

    public List<File> findByPath(String path) {
        return find("path", path).list();
    }
 
    public List<File> findByDirectoryId(String directoryId) {
        return find("directory.id", directoryId).list();
    }

    public List<File> findByOwnerId(String ownerId) {
        return find("owner.id", ownerId).list();
    }

    public List<File> findByMimeType(String mimeType) {
        return find("mimeType", mimeType).list();
    }

    public List<File> findByOwnerIdAndDirectoryId(String ownerId, String directoryId) {
        return find("owner.id = ?1 and directory.id = ?2", ownerId, directoryId).list();
    }

    public List<String> findFileIdsByOwnerId(String ownerId) {
        return getEntityManager()
                .createQuery("SELECT d.id FROM File d WHERE d.owner.id = :ownerId", String.class)
                .setParameter("ownerId", ownerId)
                .getResultList();
    }
}
