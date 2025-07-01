package pt.up.feup.ses.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pt.up.feup.ses.types.PermissionType;

import java.util.List;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "FilePermissionsDTO", description = "File permissions representation")
public class FilePermissionsDTO {
    @Schema(description = "User's ID", example = "1")
    private String id;

    @Schema(description = "User's name", example = "John Doe")
    @NotBlank(message = "File name cannot be blank")
    private String name;

    @Schema(description = "User's email", example = "johndoe1234@example.com")
    @NotBlank(message = "File email cannot be blank")
    private String email;

    @Schema(description = "Permissions", example = "[\"VIEW\", \"EDIT\"]")
    @NotBlank(message = "File permissions cannot be blank")
    private List<PermissionType> permissions;
}
