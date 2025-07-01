package pt.up.feup.ses.utils;

import io.smallrye.jwt.build.Jwt;
import io.smallrye.jwt.build.JwtClaimsBuilder;
import jakarta.enterprise.context.ApplicationScoped;
import pt.up.feup.ses.dto.UserDTO;

@ApplicationScoped
public class TokenUtils {
    public String generateToken(UserDTO user) {

    JwtClaimsBuilder claimsBuilder = Jwt.claims();
    claimsBuilder.issuer("ses-gr04");
    claimsBuilder.upn(user.getUsername());
    claimsBuilder.subject(user.getUsername());
    claimsBuilder.issuedAt(System.currentTimeMillis() / 1000);
    claimsBuilder.expiresAt(System.currentTimeMillis() / 1000 + 3600); // 1 hour expiration
    // Add the users id to the token
    claimsBuilder.claim("user_id", user.getId());
    claimsBuilder.claim("email", user.getEmail());

    return claimsBuilder.sign();
  }
}
