package pt.up.feup.ses.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Getter
@Setter
@NoArgsConstructor
public class FileNameDTO {
    @Schema(description = "File's name", example = "document.txt")
    @NotBlank(message = "File name cannot be blank")
    private String name;
}
