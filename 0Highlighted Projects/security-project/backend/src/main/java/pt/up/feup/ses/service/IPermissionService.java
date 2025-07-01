package pt.up.feup.ses.service;

import java.util.List;

import pt.up.feup.ses.dto.PermissionDTO;
import pt.up.feup.ses.exception.PermissionNotFoundException;
import pt.up.feup.ses.types.ResourceType;

public interface IPermissionService {
    PermissionDTO getPermissionById(Long id) throws PermissionNotFoundException;

    List<PermissionDTO> getPermissionByResourceType(ResourceType resourceType) throws PermissionNotFoundException;

    List<PermissionDTO> getPermissionByUserId(String userId) throws PermissionNotFoundException;

    List<PermissionDTO> getPermissionByUserIdAndByResourceType (String userId, ResourceType resourceType) throws PermissionNotFoundException;

    List<PermissionDTO> getPermissionByResourceId (String resourceId) throws PermissionNotFoundException;

    List<PermissionDTO> getAllPermissions() throws PermissionNotFoundException;

    PermissionDTO createPermission(PermissionDTO permissionDTO) throws PermissionNotFoundException;

    PermissionDTO updatePermission(Long id, PermissionDTO permissionDTO) throws PermissionNotFoundException;

    void deletePermission(Long id) throws PermissionNotFoundException;
}
