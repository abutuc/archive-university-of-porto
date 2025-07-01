package pt.up.feup.ses.config;

import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@OpenAPIDefinition(
    tags = {
      @Tag(name = "user", description = "User operations."),
    },
    info =
        @Info(
            title =
                "REST API built with Quarkus for the Gr04 project of the Security in Software Engineering course - MESW FEUP 2024/2025",
            version = "0.0.1",
            contact = @Contact(name = "Gr04 Team", url = "", email = ""),
            license = @License(name = "MIT", url = "https://opensource.org/licenses/MIT")))
public class SwaggerConfig extends Application {}