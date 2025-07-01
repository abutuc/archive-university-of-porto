package pt.up.feup.ses.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(name = "TokenDTO", description = "Token representation to create")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TokenResponseDTO {
  public String token;
}