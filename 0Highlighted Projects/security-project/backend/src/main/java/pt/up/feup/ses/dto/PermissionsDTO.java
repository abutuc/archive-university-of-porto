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
@Schema(name = "PermissionsDTO", description = "All Permission representation")
public class PermissionsDTO {
    @Schema(description = "Permission's Type", example = "view")
    @NotBlank(message = "Permission Type cannot be blank")
    private List<PermissionType> permissionType;
}
