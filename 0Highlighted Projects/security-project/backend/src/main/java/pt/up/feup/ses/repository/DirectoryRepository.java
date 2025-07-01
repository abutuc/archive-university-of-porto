package pt.up.feup.ses.repository;

import java.util.List;
import java.util.Optional;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import pt.up.feup.ses.entity.Directory;

@ApplicationScoped
public class DirectoryRepository implements PanacheRepository<Directory> {
    public Directory save(Directory directory) {
        persist(directory);
        return directory;
    }

    public Optional<Directory> findById(String id) {
        return find("id", id).firstResultOptional();
    }

    public Optional<Directory> findByName(String name) {
        return find("name", name).firstResultOptional();
    }

    public List<Directory> findByParentDirectoryId(String parentDirectoryId) {
        return find("parentDirectory.id", parentDirectoryId).list();
    }

    public List<Directory> findByPath(String path) {
        return find("path", path).list();
    }

    public List<Directory> findByOwnerId(String ownerId) {
        return find("owner.id", ownerId).list();
    }

    public List<Directory> findByOwnerIdAndParentDirectoryId(String ownerId, String parentDirectoryId) {
        return find("owner.id = ?1 and parentDirectory.id = ?2", ownerId, parentDirectoryId).list();
    }

    public List<String> findDirectoryIdsByOwnerId(String ownerId) {
        return getEntityManager()
                .createQuery("SELECT d.id FROM Directory d WHERE d.owner.id = :ownerId", String.class)
                .setParameter("ownerId", ownerId)
                .getResultList();
    }
}
