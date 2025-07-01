package pt.up.feup.ses.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "FileDTO", description = "File representation")
public class FileDTO {
    @Schema(description = "File's ID", example = "1")
    private String id;

    @Schema(description = "File's name", example = "document.txt")
    @NotBlank(message = "File name cannot be blank")
    private String name;

    @Schema(description = "File's storage name", example = "123e4567-e89b-12d3-a456-426614174000")
    @NotBlank(message = "File storage name cannot be blank")
    private UUID storageName;

    @Schema(description = "File's MIME type", example = "text/plain")
    @NotBlank(message = "File MIME type cannot be blank")
    private String mimeType;

    @Schema(description = "File's size in bytes", example = "1024")
    private Long size;

    @Schema(description = "File's directory id", example = "1")
    @NotBlank(message = "File directory id cannot be blank")
    private String directoryId;

    @Schema(description = "File's owner id", example = "1")
    @NotBlank(message = "File owner id cannot be blank")
    private String ownerId;
}
