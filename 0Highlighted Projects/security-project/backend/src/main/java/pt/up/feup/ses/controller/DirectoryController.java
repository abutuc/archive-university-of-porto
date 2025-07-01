package pt.up.feup.ses.controller;

import io.jsonwebtoken.JwtException;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.inject.Inject;
import pt.up.feup.ses.dto.DirectoryDTO;
import pt.up.feup.ses.dto.FilePermissionsDTO;
import pt.up.feup.ses.dto.PermissionDTO;
import pt.up.feup.ses.dto.PermissionsDTO;
import pt.up.feup.ses.dto.UserDTO;
import pt.up.feup.ses.entity.Directory;
import pt.up.feup.ses.entity.File;
import pt.up.feup.ses.exception.DirectoryNotFoundException;
import pt.up.feup.ses.exception.FileNotFoundException;
import pt.up.feup.ses.exception.OperationInvalidOnPublicHTMLDirectoryException;
import pt.up.feup.ses.exception.PermissionNotFoundException;
import pt.up.feup.ses.exception.UserNotFoundException;
import pt.up.feup.ses.exceptionhandler.ExceptionHandler;
import pt.up.feup.ses.service.impl.AccessControlService;
import pt.up.feup.ses.service.impl.DirectoryService;
import pt.up.feup.ses.service.impl.PermissionService;
import pt.up.feup.ses.service.impl.UserService;
import pt.up.feup.ses.types.PermissionType;
import pt.up.feup.ses.types.ResourceType;
import pt.up.feup.ses.utils.JwtUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.jboss.resteasy.reactive.RestCookie;


@RequestScoped
@Path("/api/directories")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DirectoryController {
    private final DirectoryService directoryService;
    private final AccessControlService accessControlService;
    private final PermissionService permissionService;
    private final UserService userService;

    @Inject
    public DirectoryController(DirectoryService directoryService, AccessControlService accessControlService, PermissionService permissionService, UserService userService) {
        this.directoryService = directoryService;
        this.accessControlService = accessControlService;
        this.permissionService = permissionService;
        this.userService = userService;
    }

    @POST
    @Operation(summary = "Creates a new directory", description = "Creates a new directory") // OpenAPI Operation
    @APIResponses(
        value = {
          @APIResponse(
              responseCode = "200",
                description = "Success",
                content =
                    @Content(
                        mediaType = "application/json",
                        schema = @Schema(implementation = Directory.class))),
            @APIResponse(
                responseCode = "403",
                description = "User does not have permission to create the directory",
                content =
                    @Content(
                        mediaType = "application/json",
                        schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
            @APIResponse(
                responseCode = "404",
                description = "Directory not found",
                content =
                    @Content(
                        mediaType = "application/json",
                        schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        })
    public Response createDirectory(DirectoryDTO directoryDTO, @RestCookie("access_token") String cookie) throws DirectoryNotFoundException, FileNotFoundException, PermissionNotFoundException, UserNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            String userId = JwtUtils.getUserIdFromToken(cookie);

            if ( directoryDTO.getParentId() != null && !accessControlService.isDirectoryOwner(userId, directoryDTO.getParentId())) {
                return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to create the directory"))
                .build();
            }

            directoryDTO.setOwnerId(userId);
            DirectoryDTO createdDirectory = directoryService.createDirectory(directoryDTO);
            return Response.ok(createdDirectory).build();
        } catch (JwtException e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        } catch (DirectoryNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @PUT
    @Path("/{id}")
    @Operation(summary = "Updates a directory", description = "Updates a directory") // OpenAPI Operation
    @APIResponses(
        value = {
          @APIResponse(
              responseCode = "200",
              description = "Success",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = Directory.class))),
          @APIResponse(
              responseCode = "403",
              description = "User does not have permission to update the directory",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "Directory not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        })
    public Response updateDirectory(@PathParam("id") String id, DirectoryDTO directoryDTO, @RestCookie("access_token") String cookie) throws DirectoryNotFoundException, FileNotFoundException, PermissionNotFoundException, UserNotFoundException, OperationInvalidOnPublicHTMLDirectoryException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            if (!isDirectoryFromUser(id, cookie)) {
                return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to update the directory"))
                .build();
            }

            DirectoryDTO updatedDirectory = directoryService.updateDirectory(id, directoryDTO);
            return Response.ok(updatedDirectory).build();
        } catch (DirectoryNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @DELETE
    @Path("/{id}")
    @Operation(summary = "Deletes a directory", description = "Deletes a directory") // OpenAPI Operation
    @APIResponses(
        value = {
          @APIResponse(
              responseCode = "200",
              description = "Success",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = Directory.class))),
          @APIResponse(
              responseCode = "403",
              description = "User does not have permission to delete the directory",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "Directory not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        })
    public Response deleteDirectory(@PathParam("id") String id, @RestCookie("access_token") String cookie) throws DirectoryNotFoundException, FileNotFoundException, PermissionNotFoundException, UserNotFoundException, OperationInvalidOnPublicHTMLDirectoryException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            if (!isDirectoryFromUser(id, cookie)) {
                return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to delete the directory"))
                .build();
            }

            directoryService.deleteDirectory(id);
            return Response.ok().build();
        } catch (DirectoryNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @GET
    @Path("/{id}")
    @Operation(summary = "Gets a directory", description = "Retrieves a directory by id") // OpenAPI Operation
    @APIResponses(
        value = {
          @APIResponse(
              responseCode = "200",
              description = "Success",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = Directory.class))),
          @APIResponse(
              responseCode = "403",
              description = "User does not have permission to access the directory",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "Directory not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        })
    public Response getDirectory(@PathParam("id") String id, @RestCookie("access_token") String cookie) throws DirectoryNotFoundException, FileNotFoundException, PermissionNotFoundException, UserNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            if (!isDirectoryFromUser(id, cookie)) {
                return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to grant file permissions"))
                .build();
            }

            DirectoryDTO directory = directoryService.getDirectoryById(id);
            return Response.ok(directory).build();
        } catch (DirectoryNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @GET
    @Path("/parent/{id}")
    @Operation(summary = "Gets directories by parent id", description = "Retrieves directories by parent id") // OpenAPI Operation
    @APIResponses(
        value = {
          @APIResponse(
              responseCode = "200",
              description = "Success",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = Directory.class))),
          @APIResponse(
              responseCode = "403",
              description = "User does not have permission to access the directory",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "Directory not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        })
    public Response getDirectoriesByParentId(@PathParam("id") String id, @RestCookie("access_token") String cookie) throws DirectoryNotFoundException, FileNotFoundException, PermissionNotFoundException, UserNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            if (!doesUserHaveAccess(id, cookie)) {
                return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to access shared files"))
                .build();
            }

            List<DirectoryDTO> directory = directoryService.getDirectoryByParentDirectoryId(id);
            return Response.ok(directory).build();
        } catch (DirectoryNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @GET
    @Path("/shared")
    @Operation(summary = "Gets shared directories", description = "Retrieves shared directories by user id") // OpenAPI Operation
    @APIResponses(
        value = {
          @APIResponse(
              responseCode = "200",
              description = "Success",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = Directory.class))),
          @APIResponse(
              responseCode = "403",
              description = "User does not have permission to access shared directories",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "Directory not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        })
    public Response getSharedDirectoriesByUserId(@RestCookie("access_token") String cookie) throws DirectoryNotFoundException, FileNotFoundException, PermissionNotFoundException, UserNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
        String userId = JwtUtils.getUserIdFromToken(cookie);
            List<PermissionDTO> permissions = permissionService.getPermissionByUserIdAndByResourceType(userId, ResourceType.DIRECTORY);
            List<DirectoryDTO> dirs = new ArrayList<>();

            for (PermissionDTO permission : permissions) {
                String dirId = permission.getResourceId();
                dirs.add(directoryService.getDirectoryById(dirId));
            }

            return Response.ok(dirs).build();
        } catch (JwtException e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        } catch (DirectoryNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @GET
    @Path("/shared/{id}")
    @Operation(summary = "Gets shared directory", description = "Retrieves shared directory by user id") // OpenAPI Operation
    @APIResponses(
        value = {
          @APIResponse(
              responseCode = "200",
              description = "Success",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = Directory.class))),
          @APIResponse(
              responseCode = "403",
              description = "User does not have permission to access shared directories",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "Directory not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        })
    public Response getSharedDirectoryByUserId(@PathParam("id") String id, @RestCookie("access_token") String cookie) throws DirectoryNotFoundException, FileNotFoundException, PermissionNotFoundException, UserNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            if (!doesUserHaveAccess(id, PermissionType.VIEW, cookie)) {
                return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to access shared directories"))
                .build();
            }

            DirectoryDTO directory = directoryService.getDirectoryById(id);
            return Response.ok(directory).build();
        } catch (DirectoryNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @GET
    @Path("/shared/parent/{id}")
    @Operation(summary = "Gets shared directories by parent id", description = "Retrieves shared directories by parent id") // OpenAPI Operation
    @APIResponses(
        value = {
          @APIResponse(
              responseCode = "200",
              description = "Success",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = Directory.class))),
          @APIResponse(
              responseCode = "403",
              description = "User does not have permission to access shared directories",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "Directory not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        })
    public Response getSharedDirectoriesByParentId(@PathParam("id") String id, @RestCookie("access_token") String cookie) throws DirectoryNotFoundException, FileNotFoundException, PermissionNotFoundException, UserNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            if (!doesUserHaveAccess(id, PermissionType.VIEW, cookie)) {
                return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to access shared directories"))
                .build();
            }

            List<DirectoryDTO> directory = directoryService.getDirectoryByParentDirectoryId(id);
            return Response.ok(directory).build();
        } catch (DirectoryNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @GET
    @Path("/{id}/permissions")
    @Operation(summary = "Gets directory permissions", description = "Retrieves directory permissions by id") // OpenAPI Operation
    @APIResponses(
        value = {
          @APIResponse(
              responseCode = "200",
              description = "Success",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = Directory.class))),
          @APIResponse(
              responseCode = "403",
              description = "User does not have permission to access the directory",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "Directory not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        })
    public Response getDirectoryPermissions(@PathParam("id") String id, @RestCookie("access_token") String cookie) throws DirectoryNotFoundException, FileNotFoundException, PermissionNotFoundException, UserNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            String userId = JwtUtils.getUserIdFromToken(cookie);
            if (!isDirectoryFromUser(id, cookie)) {
                if (!accessControlService.hasAccessToDirectory(userId, id, PermissionType.VIEW)) {
                    return Response.status(Response.Status.FORBIDDEN)
                        .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to access directory permissions"))
                        .build();
                } else {
                    if (!accessControlService.hasAccessToDirectory(userId, id, PermissionType.EDIT)) {
                    PermissionsDTO permissions = new PermissionsDTO();
                        permissions.setPermissionType(new ArrayList<>(Arrays.asList(PermissionType.VIEW)));
                        return Response.ok(permissions).build();
                    } else if (!accessControlService.hasAccessToDirectory(userId, id, PermissionType.DELETE)) {
                        PermissionsDTO permissions = new PermissionsDTO();
                        permissions.setPermissionType(new ArrayList<>(Arrays.asList(PermissionType.VIEW, PermissionType.EDIT)));
                        return Response.ok(permissions).build();
                    } else if (accessControlService.hasAccessToDirectory(userId, id, PermissionType.DELETE)) {
                        PermissionsDTO permissions = new PermissionsDTO();
                        permissions.setPermissionType(new ArrayList<>(Arrays.asList(PermissionType.VIEW, PermissionType.EDIT, PermissionType.DELETE)));
                        return Response.ok(permissions).build();
                    } else {
                        return Response.status(Response.Status.FORBIDDEN)
                            .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to access directory permissions"))
                            .build();
                    }
                }
            } 

            PermissionsDTO permissions = new PermissionsDTO();
            permissions.setPermissionType(new ArrayList<>(Arrays.asList(PermissionType.VIEW, PermissionType.EDIT, PermissionType.DELETE)));
            return Response.ok(permissions).build();
        } catch (JwtException e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        } catch (DirectoryNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @GET
    @Path("/{id}/permissions/users")
    @Operation(summary = "Gets directory permissions by user", description = "Retrieves directory permissions by user id") // OpenAPI Operation
    @APIResponses(
        value = {
          @APIResponse(
              responseCode = "200",
              description = "Success",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = Directory.class))),
          @APIResponse(
              responseCode = "403",
              description = "User does not have permission to access the directory",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "Directory not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        })
    public Response getDirectoryPermissionsByUser(@PathParam("id") String id, @RestCookie("access_token") String cookie) throws DirectoryNotFoundException, FileNotFoundException, PermissionNotFoundException, UserNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            String userId = JwtUtils.getUserIdFromToken(cookie);
            if (!isDirectoryFromUser(id, cookie)) {
                if (!accessControlService.hasAccessToDirectory(userId, id, PermissionType.VIEW)) {
                    return Response.status(Response.Status.FORBIDDEN)
                        .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to access directory permissions"))
                        .build();
                }
            }

            List<PermissionDTO> permissions = permissionService.getPermissionByResourceId(id);
            List<FilePermissionsDTO> perms = new ArrayList<>();
            for (PermissionDTO permission : permissions) {
                UserDTO user = userService.getUserById(permission.getUserId());
                FilePermissionsDTO f = new FilePermissionsDTO();
                f.setId(permission.getUserId());
                f.setName(user.getUsername());
                f.setEmail(user.getEmail());
                if (accessControlService.hasAccessToDirectory(permission.getUserId(), id, PermissionType.DELETE)) {
                    f.setPermissions(new ArrayList<>(Arrays.asList(PermissionType.VIEW, PermissionType.EDIT, PermissionType.DELETE)));
                } else if (accessControlService.hasAccessToDirectory(permission.getUserId(), id, PermissionType.EDIT)) {
                    f.setPermissions(new ArrayList<>(Arrays.asList(PermissionType.VIEW, PermissionType.EDIT)));
                } else if (accessControlService.hasAccessToDirectory(permission.getUserId(), id, PermissionType.VIEW)) {
                    f.setPermissions(new ArrayList<>(Arrays.asList(PermissionType.VIEW)));
                }

                perms.add(f);
            }

            return Response.ok(perms).build();
        } catch (JwtException e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        } catch (DirectoryNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @GET
    @Path("/root")
    @Operation(summary = "Gets root directories", description = "Retrieves directories in the / path") // OpenAPI Operation
    @APIResponses(
        value = {
          @APIResponse(
              responseCode = "200",
              description = "Success",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = File.class))),
          @APIResponse(
              responseCode = "404",
              description = "File not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        }) // OpenAPI APIResponses
      public Response getRootDirectories(@RestCookie("access_token") String cookie) throws DirectoryNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            String userId = JwtUtils.getUserIdFromToken(cookie);
            String dir = "user-" + userId + "-dir-0";

            if (!isDirectoryFromUser(dir, cookie)) {
                return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to grant file permissions"))
                .build();
            }
 
            List<DirectoryDTO> directory = directoryService.getDirectoryByParentDirectoryId(dir);
            return Response.ok(directory).build();
        } catch (JwtException e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        } catch (DirectoryNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @GET
    @Path("/base")
    @Operation(summary = "Gets the base directory", description = "Retrieves the base directory") // OpenAPI Operation
    @APIResponses(
        value = {
          @APIResponse(
              responseCode = "200",
              description = "Success",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = File.class))),
          @APIResponse(
              responseCode = "404",
              description = "File not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        }) // OpenAPI APIResponses
      public Response getBaseDirectory(@RestCookie("access_token") String cookie) throws DirectoryNotFoundException {
       if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            String userId = JwtUtils.getUserIdFromToken(cookie);
            String dir = "user-" + userId + "-dir-0";

            if (!isDirectoryFromUser(dir, cookie)) {
                return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to grant file permissions"))
                .build();
            }
 
            List<DirectoryDTO> directory = new ArrayList<>();
            directory.add(directoryService.getDirectoryById(dir));
            return Response.ok(directory).build();
        } catch (JwtException e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        } catch (DirectoryNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    private boolean isDirectoryFromUser(String id, String cookie) throws DirectoryNotFoundException {
        String userId = JwtUtils.getUserIdFromToken(cookie);

        if (!accessControlService.isDirectoryOwner(userId, id))
            return false;
        
        return true;
    }

    private boolean doesUserHaveAccess(String id, PermissionType type, String cookie) throws FileNotFoundException, PermissionNotFoundException, UserNotFoundException, DirectoryNotFoundException {
        String userId = JwtUtils.getUserIdFromToken(cookie);

            if (!accessControlService.hasAccessToDirectory(userId, id, type))
                return false;
            
            return true;
    }

    
    private boolean doesUserHaveAccess(String id, String cookie) throws FileNotFoundException, PermissionNotFoundException, UserNotFoundException, DirectoryNotFoundException {
        String userId = JwtUtils.getUserIdFromToken(cookie);

            if (!accessControlService.hasAccessToDirectory(userId, id))
                return false;
            
            return true;
    }
}