package pt.up.feup.ses.config;

import io.agroal.api.AgroalDataSource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Path;
import java.sql.Connection;
import java.sql.SQLException;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

@ApplicationScoped
@Path("/health/db")
public class DatabaseHealthCheck implements HealthCheck {

  @Inject AgroalDataSource dataSource;

  @Override
  public HealthCheckResponse call() {
    try (Connection connection = dataSource.getConnection()) {
      boolean valid = connection.isValid(2); // Check with a 2-second timeout
      return valid
          ? HealthCheckResponse.up("Database connection is healthy")
          : HealthCheckResponse.down("Database connection failed");
    } catch (SQLException e) {
      return HealthCheckResponse.down("Database connection exception: " + e.getMessage());
    }
  }
}