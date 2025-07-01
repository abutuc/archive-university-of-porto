package pt.up.feup.ses.controller;


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
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import pt.up.feup.ses.dto.UserDTO;
import pt.up.feup.ses.dto.UserInfoDTO;
import pt.up.feup.ses.entity.User;
import pt.up.feup.ses.exception.UserNotFoundException;
import pt.up.feup.ses.exceptionhandler.ExceptionHandler;
import pt.up.feup.ses.service.impl.UserService;
import pt.up.feup.ses.utils.JwtUtils;


@RequestScoped
@Path("/api/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {
    private final UserService userService;

    @Inject
    public UserController(UserService userService) {
      this.userService = userService;
    }


  @DELETE
  @Operation(summary = "Deletes a user", description = "Deletes a user by id")
  @APIResponses(
      value = {
        @APIResponse(responseCode = "204", description = "Success"),
        @APIResponse(
            responseCode = "404",
            description = "User not found",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
      })
  public Response deleteUser(@RestCookie("access_token") String cookie) throws UserNotFoundException {
    if (cookie == null || cookie.isEmpty()) {
        return Response.status(Response.Status.UNAUTHORIZED).build();
    }
    try {
      String userId = JwtUtils.getUserIdFromToken(cookie);
      userService.deleteUser(userId);
      return Response.noContent().build();
    } catch (JwtException e) {
        return Response.status(Response.Status.UNAUTHORIZED).build();
    } catch (UserNotFoundException e) {
      return Response.status(Response.Status.NOT_FOUND)
          .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
          .build();
    }
  }

  @GET
  @Path("/{id}")
  @Operation(summary = "Gets a user name and email", description = "Gets a user by id")
  @APIResponses(
      value = {
        @APIResponse(
            responseCode = "200",
            description = "Success",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = User.class))),
        @APIResponse(
            responseCode = "404",
            description = "User not found",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
      })
  public Response getUser(@PathParam("id") String id, @RestCookie("access_token") String cookie) throws UserNotFoundException {
    if (cookie == null || cookie.isEmpty()) {
        return Response.status(Response.Status.UNAUTHORIZED).build();
    }
    try {
      UserDTO user = userService.getUserById(id);
      UserInfoDTO userInfo = new UserInfoDTO(user.getUsername(), user.getEmail());
      return Response.ok(userInfo).build();
    } catch (UserNotFoundException e) {
      return Response.status(Response.Status.NOT_FOUND)
          .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
          .build();
    }
  }

  @GET
  @Path("/me")
  @Operation(summary = "Gets the current user", description = "Gets the current logged user")
  @APIResponses(
      value = {
        @APIResponse(
            responseCode = "200",
            description = "Success",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = User.class))),
        @APIResponse(
            responseCode = "404",
            description = "User not found",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
      })
  public Response getCurrentUser(@RestCookie("access_token") String cookie) throws UserNotFoundException {
    if (cookie == null || cookie.isEmpty()) {
        return Response.status(Response.Status.UNAUTHORIZED).build();
    }
    try {
      String userId = JwtUtils.getUserIdFromToken(cookie);
      UserDTO user = userService.getUserById(userId);
      return Response.ok(user).build();
    } catch (JwtException e) {
      return Response.status(Response.Status.UNAUTHORIZED).build();
    }catch (UserNotFoundException e) {
      return Response.status(Response.Status.NOT_FOUND)
          .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
          .build();
    }
  }
}