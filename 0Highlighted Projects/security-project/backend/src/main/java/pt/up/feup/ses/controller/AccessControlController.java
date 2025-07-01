package pt.up.feup.ses.controller;

import java.util.List;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.jboss.resteasy.reactive.RestCookie;

import io.jsonwebtoken.JwtException;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import pt.up.feup.ses.dto.EmailDTO;
import pt.up.feup.ses.dto.PermissionDTO;
import pt.up.feup.ses.dto.UserDTO;
import pt.up.feup.ses.exception.DirectoryNotFoundException;
import pt.up.feup.ses.exception.FileNotFoundException;
import pt.up.feup.ses.exception.PermissionNotFoundException;
import pt.up.feup.ses.exception.UserNotFoundException;
import pt.up.feup.ses.exceptionhandler.ExceptionHandler;
import pt.up.feup.ses.service.impl.AccessControlService;
import pt.up.feup.ses.service.impl.PermissionService;
import pt.up.feup.ses.service.impl.UserService;
import pt.up.feup.ses.types.PermissionType;
import pt.up.feup.ses.utils.JwtUtils;

@RequestScoped
@Path("/api/access")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AccessControlController {
    private final UserService userService;
    private final AccessControlService accessControlService;
    private final PermissionService permissionService;

    @Inject
    public AccessControlController(UserService userService, AccessControlService accessControlService, PermissionService permissionService) {
        this.userService = userService;
        this.accessControlService = accessControlService;
        this.permissionService = permissionService;
    }

  @POST
  @Path("/{type}/file/{id}")
  @Operation(summary = "Grants file permission", description = "Grants file permission to a user")
  @APIResponses(
    value = {
      @APIResponse(
        responseCode = "204",
        description = "Success"
      ),
      @APIResponse(
            responseCode = "403",
            description = "User does not have permission to grant file permissions",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
      @APIResponse(
            responseCode = "404",
            description = "User not found",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
      })
  public Response grantFilePermission(@PathParam("id") String id, @PathParam("type") String type, EmailDTO emailDTO, @RestCookie("access_token") String cookie) throws UserNotFoundException, FileNotFoundException, PermissionNotFoundException {
    if (cookie == null || cookie.isEmpty()) {
        return Response.status(Response.Status.UNAUTHORIZED).build();
    }
    try {
        String userId = JwtUtils.getUserIdFromToken(cookie);

        if (!accessControlService.isFileOwner(userId, id)) {
            return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to grant file permissions"))
                .build();
        }

        // if a permission already exists, do not create a new one
        UserDTO user = userService.getUserByEmail(emailDTO.getEmail());
        if (accessControlService.hasAccessToFile(user.getId(), id, PermissionType.valueOf(type))) {
          return Response.status(Response.Status.FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody("User already has permission to the given file permissions"))
                .build();
        }

        try {
          List<PermissionDTO> perms = permissionService.getPermissionByUserId(user.getId());
            for (PermissionDTO perm : perms) {
              if (perm.getResourceId().equals(id)) {
                if (perm.getPermissionType() == PermissionType.DELETE) {
                  return Response.status(Response.Status.FOUND)
                    .entity(new ExceptionHandler.ErrorResponseBody("User already has permission to the given file permissions"))
                    .build();
                } else if (perm.getPermissionType() == PermissionType.EDIT) {
                  if (PermissionType.valueOf(type) == PermissionType.VIEW) {
                    return Response.status(Response.Status.FOUND)
                      .entity(new ExceptionHandler.ErrorResponseBody("User already has permission to the given file permissions"))
                      .build();
                  } else {
                    permissionService.deletePermission(perm.getId());
                    break;
                  }
                } else {
                  permissionService.deletePermission(perm.getId());
                  break;
                }
              }
            }
        } catch (PermissionNotFoundException e) {
          System.out.println("No Permissions for File were Found: " + e);
        }

        userService.grantFilePermission(emailDTO.getEmail(), id, PermissionType.valueOf(type));
        return Response.ok().build();
    } catch (JwtException e) {
        return Response.status(Response.Status.UNAUTHORIZED).build();
    } catch (UserNotFoundException e) {
        return Response.status(Response.Status.NOT_FOUND)
          .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
          .build();
    }
  }

  @DELETE
  @Path("/file/{id}")
  @Operation(summary = "Revokes file permission", description = "Revokes file permission to a user")
  @APIResponses(
    value = {
      @APIResponse(
        responseCode = "204",
        description = "Success"
      ),
      @APIResponse(
            responseCode = "403",
            description = "User does not have permission to revoke file permissions",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
      @APIResponse(
            responseCode = "404",
            description = "User not found",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
      })
  public Response revokeFilePermission(@PathParam("id") String id, EmailDTO emailDTO, @RestCookie("access_token") String cookie) throws UserNotFoundException, FileNotFoundException {
    if (cookie == null || cookie.isEmpty()) {
        return Response.status(Response.Status.UNAUTHORIZED).build();
    }
    try {
      String userId = JwtUtils.getUserIdFromToken(cookie);
        
        if (!accessControlService.isFileOwner(userId, id)) {
            return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to revoke file permissions"))
                .build();
        }

        userService.revokeFilePermission(emailDTO.getEmail(), id);
        return Response.noContent().build();
    } catch (JwtException e) {
        return Response.status(Response.Status.UNAUTHORIZED).build();
    } catch (UserNotFoundException e) {
        return Response.status(Response.Status.NOT_FOUND)
          .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
          .build();
    }
  }

  @POST
  @Path("/{type}/directory/{id}")
  @Operation(summary = "Grants directory permission", description = "Grants directory permission to a user")
  @APIResponses(
      value = {
        @APIResponse(
          responseCode = "204",
          description = "Success"
        ),
        @APIResponse(
              responseCode = "403",
              description = "User does not have permission to grant directory permissions",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
        @APIResponse(
              responseCode = "404",
              description = "User not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        })
  public Response grantDirectoryPermission(@PathParam("id") String id, @PathParam("type") String type, EmailDTO emailDTO, @RestCookie("access_token") String cookie) throws UserNotFoundException, DirectoryNotFoundException, PermissionNotFoundException {
      if (cookie == null || cookie.isEmpty()) {
        return Response.status(Response.Status.UNAUTHORIZED).build();
      }
      try {
          String userId = JwtUtils.getUserIdFromToken(cookie);

          if (!accessControlService.isDirectoryOwner(userId, id)) {
              return Response.status(Response.Status.FORBIDDEN)
                  .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to grant directory permissions"))
                  .build();
          }

          // if a permission already exists, do not create a new one
          UserDTO user = userService.getUserByEmail(emailDTO.getEmail());
          if (accessControlService.hasAccessToDirectory(user.getId(), id, PermissionType.valueOf(type))) {
              return Response.status(Response.Status.FOUND)
                    .entity(new ExceptionHandler.ErrorResponseBody("User already has permission to the given directory permissions"))
                    .build();
          }

          try {
            List<PermissionDTO> perms = permissionService.getPermissionByUserId(user.getId());
            for (PermissionDTO perm : perms) {
                if (perm.getResourceId().equals(id)) {
                    if (perm.getPermissionType() == PermissionType.DELETE) {
                        return Response.status(Response.Status.FOUND)
                          .entity(new ExceptionHandler.ErrorResponseBody("User already has permission to the given directory permissions"))
                          .build();
                    } else if (perm.getPermissionType() == PermissionType.EDIT) {
                        if (PermissionType.valueOf(type) == PermissionType.VIEW) {
                            return Response.status(Response.Status.FOUND)
                              .entity(new ExceptionHandler.ErrorResponseBody("User already has permission to the given directory permissions"))
                              .build();
                        } else {
                            permissionService.deletePermission(perm.getId());
                            break;
                        }
                    } else {
                        permissionService.deletePermission(perm.getId());
                        break;
                    }
                }
            }
          } catch (PermissionNotFoundException e) {
          System.out.println("No Permissions for Directory were Found: " + e);
        }

          userService.grantDirectoryPermission(emailDTO.getEmail(), id, PermissionType.valueOf(type));
          return Response.noContent().build();
      } catch (JwtException e) {
          return Response.status(Response.Status.UNAUTHORIZED).build();
      } catch (UserNotFoundException e) {
          return Response.status(Response.Status.NOT_FOUND)
            .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
            .build();
      }
  }


  @DELETE
  @Path("/directory/{id}")
  @Operation(summary = "Revokes directory permission", description = "Revokes directory permission to a user")
  @APIResponses(
    value = {
      @APIResponse(
        responseCode = "204",
        description = "Success"
      ),
      @APIResponse(
            responseCode = "403",
            description = "User does not have permission to revoke directory permissions",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
      @APIResponse(
            responseCode = "404",
            description = "User not found",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
      })
  public Response revokeDirectoryPermission(@PathParam("id") String id, EmailDTO emailDTO, @RestCookie("access_token") String cookie) throws UserNotFoundException, DirectoryNotFoundException {
    if (cookie == null || cookie.isEmpty()) {
        return Response.status(Response.Status.UNAUTHORIZED).build();
    }
    try {
      String userId = JwtUtils.getUserIdFromToken(cookie);
          
        if (!accessControlService.isDirectoryOwner(userId, id)) {
            return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to grant directory permissions"))
                .build();
        }

        userService.revokeDirectoryPermission(emailDTO.getEmail(), id);
        return Response.noContent().build();
    } catch (JwtException e) {
        return Response.status(Response.Status.UNAUTHORIZED).build();
    } catch (UserNotFoundException e) {
        return Response.status(Response.Status.NOT_FOUND)
          .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
          .build();
    }
  }
}
