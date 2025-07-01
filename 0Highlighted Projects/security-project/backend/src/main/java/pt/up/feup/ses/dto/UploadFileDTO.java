package pt.up.feup.ses.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.jboss.resteasy.reactive.PartType;
import org.jboss.resteasy.reactive.RestForm;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "FileDTO", description = "File representation")
public class UploadFileDTO {

    @RestForm("name")
    @PartType(MediaType.TEXT_PLAIN)
    @Schema(description = "File's name", example = "document.txt")
    @NotBlank(message = "File name cannot be blank")
    private String name;

    @RestForm("mimeType")
    @PartType(MediaType.TEXT_PLAIN)
    @Schema(description = "File's MIME type", example = "text/plain")
    @NotBlank(message = "File MIME type cannot be blank")
    private String mimeType;

    @RestForm("size")
    @PartType(MediaType.TEXT_PLAIN)
    @Schema(description = "File's size", example = "text/plain")
    @NotBlank(message = "File size cannot be blank")
    private String size;

    @RestForm("directoryId")
    @PartType(MediaType.TEXT_PLAIN)
    @Schema(description = "File's directory id", example = "user-1-dir-0")
    @NotBlank(message = "File directory id cannot be blank")
    private String directoryId;

    @RestForm("fileData")
    @PartType(MediaType.APPLICATION_OCTET_STREAM)
    @Schema(implementation = UploadItemSchema[].class)
    @NotBlank(message = "File data cannot be blank")
    private byte[] fileData;
}