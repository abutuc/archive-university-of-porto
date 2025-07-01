package pt.up.feup.ses.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pt.up.feup.ses.types.PermissionType;
import pt.up.feup.ses.types.ResourceType;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "PermissionDTO", description = "Permission representation")
public class PermissionDTO {
    @Schema(description = "Permission's ID", example = "1")
    private Long id;

    @Schema(description = "Permission's User ID", example = "1")
    @NotBlank(message = "User ID cannot be blank")
    private String userId;

    @Schema(description = "Permission's Resource Type", example = "file")
    @NotBlank(message = "Resource Type cannot be blank")
    private ResourceType resourceType;

    @Schema(description = "Permission's Resource ID", example = "1")
    @NotBlank(message = "Resource ID cannot be blank")
    private String resourceId;

    @Schema(description = "Permission's Type", example = "view")
    @NotBlank(message = "Permission Type cannot be blank")
    private PermissionType permissionType;
}
