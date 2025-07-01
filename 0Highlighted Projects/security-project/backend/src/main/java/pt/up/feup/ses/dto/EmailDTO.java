package pt.up.feup.ses.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Schema(
    name = "EmailDTO",
    description = "User email representation, used to send the email in requests")
public class EmailDTO {
    @NotBlank
    @Schema(description = "User's email", example = "user@mail.com", required = true)
    private String email;
}
