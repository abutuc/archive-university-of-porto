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
@Schema(
    name = "CredentialDTO",
    description = "Credential representation, used to authenticate a user")
public class CredentialDTO {

  @NotBlank
  @Schema(description = "User's email", example = "johndoe123@example.com", required = true)
  private String email;

  @NotBlank
  @Schema(description = "User's password", example = "1234", required = true)
  private String password;
}