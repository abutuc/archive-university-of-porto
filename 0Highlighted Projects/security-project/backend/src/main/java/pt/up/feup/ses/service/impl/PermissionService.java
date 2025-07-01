package pt.up.feup.ses.service.impl;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import pt.up.feup.ses.dto.PermissionDTO;
import pt.up.feup.ses.entity.Permission;
import pt.up.feup.ses.entity.User;
import pt.up.feup.ses.exception.PermissionNotFoundException;
import pt.up.feup.ses.repository.PermissionRepository;
import pt.up.feup.ses.repository.UserRepository;
import pt.up.feup.ses.service.IPermissionService;
import pt.up.feup.ses.types.ResourceType;

@ApplicationScoped
public class PermissionService implements IPermissionService {
    
    private final PermissionRepository permissionRepository;
    private final UserRepository userRepository;

    @Inject
    public PermissionService(PermissionRepository permissionRepository, UserRepository userRepository) {
        this.permissionRepository = permissionRepository;
        this.userRepository = userRepository;
    }

    @Override
    public PermissionDTO getPermissionById(Long id) throws PermissionNotFoundException {
        Permission permission = permissionRepository.findByIdOptional(id)
                .orElseThrow(() -> new PermissionNotFoundException("Permission not found with id: " + id));

        return convertToDTO(permission);
    }

    @Override
    public List<PermissionDTO> getPermissionByUserId(String userId) throws PermissionNotFoundException {
        List<Permission> permissions = permissionRepository.findByUserId(userId);
        if (permissions.isEmpty()) {
            throw new PermissionNotFoundException("No permissions found for user with id: " + userId);
        }

        return permissions.stream()
                .map(this::convertToDTO)
                .toList();
    }

    @Override
    public List<PermissionDTO> getPermissionByResourceType(ResourceType resourceType)
            throws PermissionNotFoundException {
        
        List<Permission> permissions = permissionRepository.findByResourceType(resourceType.toString());
        if (permissions.isEmpty()) {
            throw new PermissionNotFoundException("No permissions found for resource type: " + resourceType);
        }
        return permissions.stream()
                .map(this::convertToDTO)
                .toList();
    }

    @Override
    public List<PermissionDTO> getPermissionByUserIdAndByResourceType (String userId, ResourceType resourceType) throws PermissionNotFoundException {
        List<Permission> permissions = permissionRepository.findByUserIdAndResourceType(userId, resourceType);
        if (permissions.isEmpty()) {
            throw new PermissionNotFoundException("No permissions found for resource type: " + resourceType);
        }
        return permissions.stream()
                .map(this::convertToDTO)
                .toList();
    }

    @Override
    public List<PermissionDTO> getAllPermissions() throws PermissionNotFoundException {
        List<Permission> permissions = permissionRepository.listAll();
        if (permissions.isEmpty()) {
            throw new PermissionNotFoundException("No permissions found");
        }

        return permissions.stream()
                .map(this::convertToDTO)
                .toList();
    }

    @Override
    @Transactional
    public PermissionDTO createPermission(PermissionDTO permissionDTO) throws PermissionNotFoundException {
        Permission permission = convertToEntity(permissionDTO);
        permissionRepository.persistAndFlush(permission);
        return convertToDTO(permission);
    }

    @Override
    @Transactional
    public PermissionDTO updatePermission(Long id, PermissionDTO permissionDTO) throws PermissionNotFoundException {
        Permission existingPermission = permissionRepository.findByIdOptional(id)
                .orElseThrow(() -> new PermissionNotFoundException("Permission not found with id: " + id));

        User user = userRepository.findByIdOptional(permissionDTO.getUserId())
                .orElseThrow(() -> new PermissionNotFoundException("User not found with id: " + permissionDTO.getUserId()));

        existingPermission.setUser(user);
        existingPermission.setResourceId(permissionDTO.getResourceId());
        existingPermission.setResourceType(permissionDTO.getResourceType());

        permissionRepository.persistAndFlush(existingPermission);
        return convertToDTO(existingPermission);
    }

    @Override
    @Transactional
    public void deletePermission(Long id) throws PermissionNotFoundException {
        Permission permission = permissionRepository.findByIdOptional(id)
                .orElseThrow(() -> new PermissionNotFoundException("Permission not found with id: " + id));

        permissionRepository.delete(permission);
    }

    @Override
    public List<PermissionDTO> getPermissionByResourceId (String resourceId) throws PermissionNotFoundException {
        List<Permission> permissions = permissionRepository.findByResourceId(resourceId);
        if (permissions.isEmpty()) {
            throw new PermissionNotFoundException("No permissions found for resource id: " + resourceId);
        }

        return permissions.stream()
                .map(this::convertToDTO)
                .toList();
    }

    private PermissionDTO convertToDTO(Permission permission) {
        PermissionDTO permissionDTO = new PermissionDTO();
        permissionDTO.setId(permission.id);
        permissionDTO.setUserId(permission.getUser().getId());
        permissionDTO.setResourceId(permission.getResourceId());
        permissionDTO.setResourceType(permission.getResourceType());
        return permissionDTO;
    }

    private Permission convertToEntity(PermissionDTO permissionDTO) {
        Permission permission = new Permission();
        permission.id = permissionDTO.getId();
        permission.setUser(permission.getUser());
        permission.setResourceId(permission.getResourceId());
        permission.setResourceType(permission.getResourceType());
        return permission;
    }
}
