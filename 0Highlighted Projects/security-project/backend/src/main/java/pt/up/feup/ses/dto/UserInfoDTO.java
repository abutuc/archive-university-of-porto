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
@Schema(name = "UserInfoDTO", description = "User representation to cretrieve a users name and email")
public class UserInfoDTO {
    @Schema(description = "User's username", example = "johndoe123")
    @NotBlank(message = "Username cannot be blank")
    private String username;

    @Schema(description = "User's email", example = "johndoe123@example.com")
    @NotBlank(message = "Email cannot be blank")
    private String email;
}
