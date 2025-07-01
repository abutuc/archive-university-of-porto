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
@Schema(name = "UserDTO", description = "User representation to create") // OpenAPI Schema
public class UserDTO {
    @Schema(description = "User's ID", example = "1")
    private String id;

    @Schema(description = "User's username", example = "johndoe123")
    @NotBlank(message = "Username cannot be blank")
    private String username;

    @Schema(description = "User's email", example = "johndoe123@example.com")
    @NotBlank(message = "Email cannot be blank")
    private String email;
}
