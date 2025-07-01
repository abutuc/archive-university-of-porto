package pt.up.feup.ses.controller;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.jboss.resteasy.reactive.RestCookie;

import io.jsonwebtoken.JwtException;
import io.minio.errors.ErrorResponseException;
import io.minio.errors.InsufficientDataException;
import io.minio.errors.InternalException;
import io.minio.errors.InvalidResponseException;
import io.minio.errors.ServerException;
import io.minio.errors.XmlParserException;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
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
import pt.up.feup.ses.dto.FileDTO;
import pt.up.feup.ses.dto.FileNameDTO;
import pt.up.feup.ses.dto.FilePermissionsDTO;
import pt.up.feup.ses.dto.FileWithPermissionDTO;
import pt.up.feup.ses.dto.PermissionDTO;
import pt.up.feup.ses.dto.PermissionsDTO;
import pt.up.feup.ses.dto.UploadFileDTO;
import pt.up.feup.ses.dto.UserDTO;
import pt.up.feup.ses.entity.File;
import pt.up.feup.ses.exception.DirectoryNotFoundException;
import pt.up.feup.ses.exception.FileNotFoundException;
import pt.up.feup.ses.exception.PermissionNotFoundException;
import pt.up.feup.ses.exception.UserNotFoundException;
import pt.up.feup.ses.exceptionhandler.ExceptionHandler;
import pt.up.feup.ses.service.impl.AccessControlService;
import pt.up.feup.ses.service.impl.FileService;
import pt.up.feup.ses.service.impl.PermissionService;
import pt.up.feup.ses.service.impl.UserService;
import pt.up.feup.ses.types.PermissionType;
import pt.up.feup.ses.types.ResourceType;
import pt.up.feup.ses.utils.JwtUtils;


@RequestScoped
@Path("/api/files")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FileController {
    private final FileService fileService;
    private final PermissionService permissionService;
    private final AccessControlService accessControlService;
    private final UserService userService;


    @Inject
    public FileController(FileService fileService, PermissionService permissionService, AccessControlService accessControlService, UserService userService) {
        this.fileService = fileService;
        this.permissionService = permissionService;
        this.accessControlService = accessControlService;
        this.userService = userService;
    }

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Creates a file", description = "Creates a new file") // OpenAPI Operation
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
              responseCode = "403",
              description = "User does not have permission to create file",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "File not found",
                content =
                    @Content(
                        mediaType = "application/json",
                        schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        }) // OpenAPI APIResponses
    public Response createFile(UploadFileDTO form, @RestCookie("access_token") String cookie) throws FileNotFoundException, PermissionNotFoundException, DirectoryNotFoundException, UserNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            String userId = JwtUtils.getUserIdFromToken(cookie);

            // Permission check
            if (form.getDirectoryId() != null && !accessControlService.isDirectoryOwner(userId, form.getDirectoryId())) {
                return Response.status(Response.Status.FORBIDDEN)
                    .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to create file"))
                    .build();
            }

            if (form.getFileData() == null || form.getFileData().length == 0) {
                return Response.status(Response.Status.BAD_REQUEST)
                    .entity(new ExceptionHandler.ErrorResponseBody("No file uploaded"))
                    .build();
            }

            if (!fileService.validateFile(form)) {
                return Response.status(Response.Status.NOT_ACCEPTABLE)
                    .entity(new ExceptionHandler.ErrorResponseBody("Invalid File"))
                    .build();
            }


            if (form.getDirectoryId() != null && form.getDirectoryId().startsWith("public-html-")) {

                String username = form.getDirectoryId().replaceFirst("public-html-", "");
            
                String directoryPath = "public_html" + java.io.File.separator + username;
                java.io.File dir = new java.io.File(directoryPath);
                if (!dir.exists()) {
                    dir.mkdirs();
                }
            
                java.io.File file = new java.io.File(dir, form.getName());
                try (FileOutputStream fos = new FileOutputStream(file)) {
                    fos.write(form.getFileData());
                } catch (IOException e) {
                    return Response.serverError()
                        .entity(new ExceptionHandler.ErrorResponseBody("Failed to save file locally: " + e.getMessage()))
                        .build();
                }
            
                FileDTO fileDTO = new FileDTO();
                fileDTO.setName(form.getName());
                fileDTO.setStorageName(UUID.randomUUID());
                fileDTO.setMimeType(form.getMimeType());
                fileDTO.setSize(Long.parseLong(form.getSize()));
                fileDTO.setOwnerId(userId);
                fileDTO.setDirectoryId(form.getDirectoryId());
            
                FileDTO createdFile = fileService.createFile(fileDTO);
            
                return Response.ok(createdFile).build();
            }


            // Generate a unique MinIO object name
            UUID objectName = UUID.randomUUID();

            // Upload to MinIO
            fileService.uploadFile(
                objectName.toString(),
                new ByteArrayInputStream(form.getFileData()), // or form.getFile().getInputStream() if using FileUpload (RestEasy)
                form.getFileData().length,
                form.getMimeType()
            );

            System.out.println(fileService.generatePresignedUrl(objectName.toString(), 1000));

            // Save metadata in DB
            FileDTO fileDTO = new FileDTO();
            fileDTO.setName(form.getName());
            fileDTO.setStorageName(objectName);
            fileDTO.setMimeType(form.getMimeType());
            fileDTO.setSize(Long.parseLong(form.getSize()));
            fileDTO.setOwnerId(userId);
            fileDTO.setDirectoryId(form.getDirectoryId());

            FileDTO createdFile = fileService.createFile(fileDTO);

            return Response.ok(createdFile).build();

        } catch (JwtException e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.serverError()
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @PUT
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    @Operation(summary = "Updates a file", description = "Updates a file by id") // OpenAPI Operation
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
              responseCode = "403",
              description = "User does not have permission to update file",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "File not found",
                content =
                    @Content(
                        mediaType = "application/json",
                        schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        }) // OpenAPI APIResponses
    public Response updateFile(@PathParam("id") String id, UploadFileDTO form, @RestCookie("access_token") String cookie) throws FileNotFoundException, InvalidKeyException, ErrorResponseException, InsufficientDataException, InternalException, InvalidResponseException, NoSuchAlgorithmException, XmlParserException, ServerException, IllegalArgumentException, IOException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            if (!isFileFromUser(id, cookie)) {
                return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to update file"))
                .build();
            }

            FileDTO previousFileDTO = fileService.getFileById(id);

            fileService.updateFile(
                previousFileDTO.getStorageName().toString(),
                new ByteArrayInputStream(form.getFileData()),
                form.getFileData().length,
                form.getMimeType()
            );

            // Save metadata in DB
            FileDTO fileDTO = new FileDTO();
            fileDTO.setName(form.getName());
            fileDTO.setStorageName(previousFileDTO.getStorageName());
            fileDTO.setMimeType(form.getMimeType());
            fileDTO.setSize(Long.parseLong(form.getSize()));
            fileDTO.setOwnerId(previousFileDTO.getOwnerId());
            fileDTO.setDirectoryId(form.getDirectoryId());

            FileDTO updatedFile = fileService.updateFile(id, fileDTO);
            return Response.ok(updatedFile).build();
        } catch (FileNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @PUT
    @Path("/{id}/name")
    @Operation(summary = "Updates a file name", description = "Updates a file name by id") // OpenAPI Operation
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
              responseCode = "403",
              description = "User does not have permission to update file name",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "File not found",
                content =
                    @Content(
                        mediaType = "application/json",
                        schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        })
    public Response updateFileName(@PathParam("id") String id, FileNameDTO fileNameDTO, @RestCookie("access_token") String cookie) throws FileNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            if (!isFileFromUser(id, cookie)) {
                return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to update file name"))
                .build();
            }

            FileDTO updatedFile = fileService.updateFileName(id, fileNameDTO.getName());
            return Response.ok(updatedFile).build();
        } catch (FileNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @DELETE
    @Path("/{id}")
    @Operation(summary = "Deletes a file", description = "Deletes a file by id") // OpenAPI Operation
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
              responseCode = "403",
              description = "User does not have permission to delete file",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "File not found",
                content =
                    @Content(
                        mediaType = "application/json",
                        schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        }) // OpenAPI APIResponses
    public Response deleteFile(@PathParam("id") String id, @RestCookie("access_token") String cookie) throws FileNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            if (!isFileFromUser(id, cookie)) {
                return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to delete file"))
                .build();
            }

            fileService.deleteFile(id);
            return Response.ok().build();
        } catch (FileNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @GET
    @Path("/{id}")
    @Operation(summary = "Gets a file", description = "Retrieves a file by id") // OpenAPI Operation
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
            responseCode = "403",
            description = "User does not have permission to grant file permissions",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "File not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        }) // OpenAPI APIResponses
      public Response getFileById(@PathParam("id") String id, @RestCookie("access_token") String cookie) throws FileNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            if (!isFileFromUser(id, cookie)) {
                return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to grant file permissions"))
                .build();
            }

            FileDTO file = fileService.getFileById(id);
            return Response.ok(file).build();
        } catch (FileNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @GET
    @Path("directory/{id}")
    @Operation(summary = "Gets files", description = "Retrieves files by directory id") // OpenAPI Operation
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
      public Response getFileByDirectoryId(@PathParam("id") String id, @RestCookie("access_token") String cookie) throws FileNotFoundException, DirectoryNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            if (!isDirectoryFromUser(id, cookie)) {
                return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to grant file permissions"))
                .build();
            }
 
            List<FileDTO> file = fileService.getFileByDirectoryId(id);
            return Response.ok(file).build();
        } catch (FileNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @GET
    @Path("/shared")
    @Operation(summary = "Gets shared files", description = "Retrieves shared files by user id") // OpenAPI Operation
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
            responseCode = "403",
            description = "User does not have permission to access shared files",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "File not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        })  
    public Response getSharedFilesByUserId(@RestCookie("access_token") String cookie) throws FileNotFoundException, PermissionNotFoundException, UserNotFoundException, DirectoryNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            String userId = JwtUtils.getUserIdFromToken(cookie);
            List<PermissionDTO> permissions = permissionService.getPermissionByUserIdAndByResourceType(userId, ResourceType.FILE); 
            List<FileDTO> files = new ArrayList<>();

            for (PermissionDTO permission : permissions) {
                String fileId = permission.getResourceId();
                files.add(fileService.getFileById(fileId));
            }

            if (files.isEmpty()) {
                return Response.status(Response.Status.FORBIDDEN)
                    .entity(new ExceptionHandler.ErrorResponseBody("No Shared Files"))
                    .build();
            }

            List<FileWithPermissionDTO> returnFiles = new ArrayList<>();

            for (FileDTO file : files) {
                FileWithPermissionDTO f = new FileWithPermissionDTO();
                f.setId(file.getId());
                f.setMimeType(file.getMimeType());
                f.setDirectoryId(file.getDirectoryId());
                f.setName(file.getName());
                f.setOwnerId(file.getOwnerId());
                f.setSize(file.getSize());
                f.setStorageName(file.getStorageName());

                if (accessControlService.hasAccessToFile(userId, file.getId(), PermissionType.DELETE)) {
                    f.setPermission(PermissionType.DELETE);
                } else if (accessControlService.hasAccessToFile(userId, file.getId(), PermissionType.EDIT)) {
                    f.setPermission(PermissionType.EDIT);
                } else if (accessControlService.hasAccessToFile(userId, file.getId(), PermissionType.VIEW)) {
                    f.setPermission(PermissionType.VIEW);
                }

                returnFiles.add(f);
            }

            return Response.ok(returnFiles).build();
        } catch (JwtException e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        } catch (FileNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @GET
    @Path("/shared/{id}")
    @Operation(summary = "Gets shared file", description = "Retrieves shared file by user id") // OpenAPI Operation
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
            responseCode = "403",
            description = "User does not have permission to access shared files",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "File not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        }) // OpenAPI APIResponses
      public Response getSharedFileByUserId(@PathParam("id") String id, @RestCookie("access_token") String cookie) throws FileNotFoundException, PermissionNotFoundException, UserNotFoundException, DirectoryNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            if (!doesUserHaveAccess(id, "file", PermissionType.VIEW, cookie)) {
                return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to access shared files"))
                .build();
            }

            FileDTO file = fileService.getFileById(id);
            return Response.ok(file).build();
        } catch (FileNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @GET
    @Path("/shared/directory/{id}")
    @Operation(summary = "Gets shared files", description = "Retrieves shared files by directory id") // OpenAPI Operation
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
            responseCode = "403",
            description = "User does not have permission to access shared files",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "File not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        }) // OpenAPI APIResponses
    public Response getSharedFilesByDirectoryId(@PathParam("id") String id, @RestCookie("access_token") String cookie) throws FileNotFoundException, PermissionNotFoundException, UserNotFoundException, DirectoryNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            String userId = JwtUtils.getUserIdFromToken(cookie);
            List<FileDTO> files = fileService.getFileByDirectoryId(id);

            List<FileWithPermissionDTO> returnFiles = new ArrayList<>();

            if (doesUserHaveAccess(id, "directory", PermissionType.VIEW, cookie)) {
                for (FileDTO file : files) {
                    FileWithPermissionDTO f = new FileWithPermissionDTO();
                    f.setId(file.getId());
                    f.setMimeType(file.getMimeType());
                    f.setDirectoryId(file.getDirectoryId());
                    f.setName(file.getName());
                    f.setOwnerId(file.getOwnerId());
                    f.setSize(file.getSize());
                    f.setStorageName(file.getStorageName());

                    if (accessControlService.hasAccessToFile(userId, file.getId(), PermissionType.DELETE)) {
                        f.setPermission(PermissionType.DELETE);
                    } else if (accessControlService.hasAccessToFile(userId, file.getId(), PermissionType.EDIT)) {
                        f.setPermission(PermissionType.EDIT);
                    } else if (accessControlService.hasAccessToFile(userId, file.getId(), PermissionType.VIEW)) {
                        f.setPermission(PermissionType.VIEW);
                    }

                    returnFiles.add(f);
                }
                return Response.ok(returnFiles).build();
            }

            // Check if there exists a permission to this file
            for (FileDTO file : files) {
                if (doesUserHaveAccess(file.getId(), "file", PermissionType.VIEW, cookie)) {
                    FileWithPermissionDTO f = new FileWithPermissionDTO();
                    f.setId(file.getId());
                    f.setMimeType(file.getMimeType());
                    f.setDirectoryId(file.getDirectoryId());
                    f.setName(file.getName());
                    f.setOwnerId(file.getOwnerId());
                    f.setSize(file.getSize());
                    f.setStorageName(file.getStorageName());

                    if (accessControlService.hasAccessToFile(userId, file.getId(), PermissionType.DELETE)) {
                        f.setPermission(PermissionType.DELETE);
                    } else if (accessControlService.hasAccessToFile(userId, file.getId(), PermissionType.EDIT)) {
                        f.setPermission(PermissionType.EDIT);
                    } else if (accessControlService.hasAccessToFile(userId, file.getId(), PermissionType.VIEW)) {
                        f.setPermission(PermissionType.VIEW);
                    }

                    returnFiles.add(f);
                }
            }

            return Response.ok(returnFiles).build();
        } catch (JwtException e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        } catch (FileNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @PUT
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/shared/{id}")
    @Operation(summary = "Updates a shared file", description = "Updates a shared file by id") // OpenAPI Operation
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
              responseCode = "403",
              description = "User does not have permission to update file",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "File not found",
                content =
                    @Content(
                        mediaType = "application/json",
                        schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        }) // OpenAPI APIResponses
    public Response updateSharedFile(@PathParam("id") String id, UploadFileDTO form, @RestCookie("access_token") String cookie) throws FileNotFoundException, InvalidKeyException, ErrorResponseException, InsufficientDataException, InternalException, InvalidResponseException, NoSuchAlgorithmException, XmlParserException, ServerException, IllegalArgumentException, IOException, PermissionNotFoundException, UserNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            String userId = JwtUtils.getUserIdFromToken(cookie);
            if (!accessControlService.hasAccessToFile(userId, id, PermissionType.EDIT)) {
                return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to update file"))
                .build();
            }

            FileDTO previousFileDTO = fileService.getFileById(id);

            fileService.updateFile(
                previousFileDTO.getStorageName().toString(),
                new ByteArrayInputStream(form.getFileData()),
                form.getFileData().length,
                form.getMimeType()
            );

            // Save metadata in DB
            FileDTO fileDTO = new FileDTO();
            fileDTO.setName(form.getName());
            fileDTO.setStorageName(previousFileDTO.getStorageName());
            fileDTO.setMimeType(form.getMimeType());
            fileDTO.setSize(Long.parseLong(form.getSize()));
            fileDTO.setOwnerId(previousFileDTO.getOwnerId());
            fileDTO.setDirectoryId(form.getDirectoryId());

            FileDTO updatedFile = fileService.updateFile(id, fileDTO);
            return Response.ok(updatedFile).build();
        } catch (JwtException e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        } catch (FileNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @PUT
    @Path("/shared/{id}/name")
    @Operation(summary = "Updates a shared file name", description = "Updates a shared file name by id")
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
              responseCode = "403",
              description = "User does not have permission to update shared file name",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "File not found",
                content =
                    @Content(
                        mediaType = "application/json",
                        schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        })
    public Response updateSharedFileName(@PathParam("id") String id, FileNameDTO fileNameDTO, @RestCookie("access_token") String cookie) throws FileNotFoundException, PermissionNotFoundException, UserNotFoundException, DirectoryNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            if (!doesUserHaveAccess(id, "file", PermissionType.EDIT, cookie)) {
                return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to update shared file name"))
                .build();
            }

            FileDTO updatedFile = fileService.updateFileName(id, fileNameDTO.getName());
            return Response.ok(updatedFile).build();
        } catch (FileNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @DELETE
    @Path("/shared/{id}")
    @Operation(summary = "Deletes a shared file", description = "Deletes a shared file by id")
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
              responseCode = "403",
              description = "User does not have permission to delete shared file",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "File not found",
                content =
                    @Content(
                        mediaType = "application/json",
                        schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        })
    public Response deleteSharedFile(@PathParam("id") String id, @RestCookie("access_token") String cookie) throws FileNotFoundException, PermissionNotFoundException, UserNotFoundException, DirectoryNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            if (!doesUserHaveAccess(id, "file", PermissionType.DELETE, cookie)) {
                return Response.status(Response.Status.FORBIDDEN)
                .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to delete shared file"))
                .build();
            }

            fileService.deleteFile(id);
            return Response.ok().build();
        } catch (FileNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @GET
    @Path("/{id}/download")
    @Operation(summary = "Downloads a file", description = "Downloads a file by id")
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
            responseCode = "403",
            description = "User does not have permission to download file",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "File not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        })
    public Response downloadFile(@PathParam("id") String id, @RestCookie("access_token") String cookie) {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            if (!doesUserHaveAccess(id, "file", PermissionType.VIEW, cookie)) {
                return Response.status(Response.Status.FORBIDDEN)
                    .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to view the file"))
                    .build();
            }
         
            FileDTO fileDTO = fileService.getFileById(id);
         
            InputStream stream;
         
            // Check if it's stored locally
            if (fileDTO.getDirectoryId() != null && fileDTO.getDirectoryId().startsWith("public-html-")) {
                // Local storage path: public_html/{username}/{fileName}
                String username = fileDTO.getDirectoryId().replaceFirst("public-html-", "");
                String filePath = "public_html" + java.io.File.separator + username + java.io.File.separator + fileDTO.getName();
                java.io.File file = new java.io.File(filePath);
            
                if (!file.exists()) {
                    return Response.status(Response.Status.NOT_FOUND)
                        .entity(new ExceptionHandler.ErrorResponseBody("Local file not found"))
                        .build();
                }
            
                stream = new FileInputStream(file);
            } else {
                // Stored in MinIO (default behavior)
                stream = fileService.downloadFile(fileDTO.getStorageName().toString());
            
                if (stream == null) {
                    return Response.status(Response.Status.NOT_FOUND)
                        .entity(new ExceptionHandler.ErrorResponseBody("File not found"))
                        .build();
                }
            }
         
            return Response.ok(stream)
                .header("Content-Disposition", "attachment; filename=\"" + fileDTO.getName() + "\"")
                .header("Content-Type", fileDTO.getMimeType())
                .build();
         
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity(new ExceptionHandler.ErrorResponseBody("File not found or error downloading"))
                .build();
        }
}

    @GET
    @Path("/{id}/permissions")
    @Operation(summary = "Gets file permissions", description = "Retrieves file permissions by id")
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
            responseCode = "403",
            description = "User does not have permission to access file permissions",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "File not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        })
      public Response getFilePermissions(@PathParam("id") String id, @RestCookie("access_token") String cookie) throws FileNotFoundException, PermissionNotFoundException, UserNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            String userId = JwtUtils.getUserIdFromToken(cookie);
            if (!isFileFromUser(id, cookie)) {
                // Check if the user is has any permission to the file
                if (!accessControlService.hasAccessToFile(userId, id, PermissionType.VIEW)) {
                    return Response.status(Response.Status.FORBIDDEN)
                        .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to access file permissions"))
                        .build();
                } else  {
                    if (!accessControlService.hasAccessToFile(userId, id, PermissionType.EDIT)) {
                        PermissionsDTO permissions = new PermissionsDTO();
                        permissions.setPermissionType(new ArrayList<>(Arrays.asList(PermissionType.VIEW)));
                        return Response.ok(permissions).build();
                    } else if (!accessControlService.hasAccessToFile(userId, id, PermissionType.DELETE)) {
                        PermissionsDTO permissions = new PermissionsDTO();
                        permissions.setPermissionType(new ArrayList<>(Arrays.asList(PermissionType.VIEW, PermissionType.EDIT)));
                        return Response.ok(permissions).build();
                    } else if (accessControlService.hasAccessToFile(userId, id, PermissionType.DELETE)) {
                        PermissionsDTO permissions = new PermissionsDTO();
                        permissions.setPermissionType(new ArrayList<>(Arrays.asList(PermissionType.VIEW, PermissionType.EDIT, PermissionType.DELETE)));
                        return Response.ok(permissions).build();
                    } else {
                        return Response.status(Response.Status.FORBIDDEN)
                            .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to access file permissions"))
                            .build();
                    }
            
                }    
            }

            PermissionsDTO permissions = new PermissionsDTO();
            permissions.setPermissionType(new ArrayList<>(Arrays.asList(PermissionType.VIEW, PermissionType.EDIT, PermissionType.DELETE)));
            return Response.ok(permissions).build();
        } catch (JwtException e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        } catch (FileNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @GET
    @Path("/{id}/permissions/users")
    @Operation(summary = "Gets file permissions", description = "Retrieves file permissions by id")
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
            responseCode = "403",
            description = "User does not have permission to access file permissions",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class))),
          @APIResponse(
              responseCode = "404",
              description = "File not found",
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = ExceptionHandler.ErrorResponseBody.class)))
        })
      public Response getFilePermissionsUsers(@PathParam("id") String id, @RestCookie("access_token") String cookie) throws FileNotFoundException, PermissionNotFoundException, UserNotFoundException {
        if (cookie == null || cookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        try {
            String userId = JwtUtils.getUserIdFromToken(cookie);
            if (!isFileFromUser(id, cookie)) {
                // Check if the user is has any permission to the file
                if (!accessControlService.hasAccessToFile(userId, id, PermissionType.VIEW)) {
                    return Response.status(Response.Status.FORBIDDEN)
                        .entity(new ExceptionHandler.ErrorResponseBody("User does not have permission to access file permissions"))
                        .build();
                }
            }

            List<PermissionDTO> permissionsDTOs = permissionService.getPermissionByResourceId(id);

            List<FilePermissionsDTO> permissions = new ArrayList<>();
            for (PermissionDTO permission : permissionsDTOs) {
                UserDTO user = userService.getUserById(permission.getUserId());
                FilePermissionsDTO f = new FilePermissionsDTO();
                f.setId(permission.getUserId());
                f.setName(user.getUsername());
                f.setEmail(user.getEmail());
                if (accessControlService.hasAccessToFile(permission.getUserId(), id, PermissionType.DELETE)) {
                    f.setPermissions(new ArrayList<>(Arrays.asList(PermissionType.VIEW, PermissionType.EDIT, PermissionType.DELETE)));
                } else if (accessControlService.hasAccessToFile(permission.getUserId(), id, PermissionType.EDIT)) {
                    f.setPermissions(new ArrayList<>(Arrays.asList(PermissionType.VIEW, PermissionType.EDIT)));
                } else if (accessControlService.hasAccessToFile(permission.getUserId(), id, PermissionType.VIEW)) {
                    f.setPermissions(new ArrayList<>(Arrays.asList(PermissionType.VIEW)));
                }

                permissions.add(f);
            }

            return Response.ok(permissions).build();
        } catch (JwtException e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        } catch (FileNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    @GET
    @Path("/root")
    @Operation(summary = "Gets root files", description = "Retrieves files in the / path") // OpenAPI Operation
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
      public Response getRootFiles(@RestCookie("access_token") String cookie) throws FileNotFoundException, DirectoryNotFoundException {
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
 
            List<FileDTO> file = fileService.getFileByDirectoryId(dir);
            return Response.ok(file).build();
        } catch (JwtException e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        } catch (FileNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(new ExceptionHandler.ErrorResponseBody(e.getMessage()))
                .build();
        }
    }

    private boolean isFileFromUser(String id, String cookie) throws FileNotFoundException {
        String userId = JwtUtils.getUserIdFromToken(cookie);

        return accessControlService.isFileOwner(userId, id);
    }

    private boolean isDirectoryFromUser(String id, String cookie) throws DirectoryNotFoundException {
        String userId = JwtUtils.getUserIdFromToken(cookie);
        if (!accessControlService.isDirectoryOwner(userId, id))
            return false;
        
        return true;
    }

    private boolean doesUserHaveAccess(String id, String type, PermissionType permissionType, String cookie) throws FileNotFoundException, PermissionNotFoundException, UserNotFoundException, DirectoryNotFoundException {
        String userId = JwtUtils.getUserIdFromToken(cookie);
        if (type.equals("file") && !accessControlService.hasAccessToFile(userId, id, permissionType))
            return false;
        else if (type.equals("directory") && !accessControlService.hasAccessToDirectory(userId, id, permissionType))
            return false;
        
        return true;
    }
}
