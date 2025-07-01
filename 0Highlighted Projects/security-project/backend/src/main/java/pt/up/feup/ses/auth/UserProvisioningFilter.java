package pt.up.feup.ses.auth;

import io.quarkus.security.identity.SecurityIdentity;
import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.ws.rs.Priorities;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.ext.Provider;
import pt.up.feup.ses.service.impl.UserService;

import org.eclipse.microprofile.jwt.JsonWebToken;

import java.io.IOException;

@Provider
@Priority(Priorities.AUTHENTICATION + 1)
public class UserProvisioningFilter implements ContainerRequestFilter {

    @Inject
    SecurityIdentity securityIdentity;

    @Inject
    UserService userService;

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        if (!securityIdentity.isAnonymous()) {
            JsonWebToken jwt = (JsonWebToken) securityIdentity.getPrincipal();

            String sub = jwt.getSubject();
            String email = jwt.getClaim("email");
            String name = jwt.getClaim("name");
            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            if (sub != null && email != null) {
                userService.createIfNotExists(sub, email, name);
            }
        }
    }
}
