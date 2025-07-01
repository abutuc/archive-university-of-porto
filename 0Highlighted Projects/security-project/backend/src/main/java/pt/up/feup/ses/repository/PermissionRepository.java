package pt.up.feup.ses.repository;

import java.util.List;
import java.util.Optional;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import pt.up.feup.ses.entity.Permission;
import pt.up.feup.ses.types.ResourceType;

@ApplicationScoped
public class PermissionRepository implements PanacheRepository<Permission> {
    public Permission save(Permission permission) {
        persist(permission);
        return permission;
    }

    public List<Permission> findByUserId(String userId) {
        return find("user.id", userId).list();
    }

    public List<Permission> findByResourceType(String resourceType) {
        return find("resourceType", resourceType).list();
    }

    public List<Permission> findByResourceId(String resourceId) {
        return find("resourceId", resourceId).list();
    }

    public List<Permission> findByUserIdAndResourceId(String userId, String resourceId) {
        return find("user.id = ?1 and resourceId = ?2", userId, resourceId).list();
    }
    
    public List<Permission> findByUserIdAndResourceType(String userId, ResourceType resourceType) {
        return find("user.id = ?1 and resourceType = ?2", userId, resourceType).list();
    }

    public Optional<Permission> findByUserAndResource(String userId, ResourceType resourceType, String resourceId) {
        return find("user.id = ?1 and resourceType = ?2 and resourceId = ?3", userId, resourceType, resourceId).firstResultOptional();
    }
}
