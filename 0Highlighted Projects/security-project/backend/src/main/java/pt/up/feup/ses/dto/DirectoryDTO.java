package pt.up.feup.ses.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "DirectoryDTO", description = "Directory representation")
public class DirectoryDTO {
    @Schema(description = "Directory's ID", example = "1")
    private String id;

    @Schema(description = "Directory's name", example = "documents")
    @NotBlank(message = "Directory name cannot be blank")
    private String name;

    @Schema(description = "Directory's path", example = "/home/user/documents")
    @NotBlank(message = "Directory path cannot be blank")
    private String path;

    @Schema(description = "Directory's directory id", example = "1")
    @NotBlank(message = "Directory parent id cannot be blank")
    private String parentId;

    @Schema(description = "Directory's owner id", example = "1")
    @NotBlank(message = "Directory owner id cannot be blank")
    private String ownerId;
}
