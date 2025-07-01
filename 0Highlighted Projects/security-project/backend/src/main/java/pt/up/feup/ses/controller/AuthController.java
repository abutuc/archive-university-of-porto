package pt.up.feup.ses.controller;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;

import io.jsonwebtoken.Jwts;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import pt.up.feup.ses.service.impl.UserService;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.*;

import java.nio.file.Files;
import java.nio.file.Paths;

@RequestScoped
@Path("/api/auth")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AuthController {

    @Inject
    UserService userService;

    @POST
    @Path("/login")
    public Response login(Map<String, String> body) throws Exception {
        String googleToken = body.get("credential");

        GoogleIdToken.Payload payload = verifyGoogleToken(googleToken);
        if (payload == null) {
            return Response.status(401).build();
        }

        String userId = payload.getSubject();
        String email = payload.getEmail();
        String name = (String) payload.get("name");

        if (userId != null && email != null) {
            userService.createIfNotExists(userId, email, name);
        }

        String jwt = createYourJwt(userId, email, name);

        NewCookie cookie = new NewCookie.Builder("access_token")
            .value(jwt)
            .path("/")
            .domain("ses-drive.io")
            .httpOnly(true)
            .secure(true)
            .maxAge(3600)
            .sameSite(NewCookie.SameSite.STRICT)
            .build();

        return Response.ok().cookie(cookie).build();
    }

    @POST
    @Path("/logout")
    public Response logout() {
        NewCookie expiredCookie = new NewCookie.Builder("access_token")
            .value("")
            .path("/")
            .domain("ses-drive.io")
            .httpOnly(true)
            .secure(true)
            .maxAge(0)
            .sameSite(NewCookie.SameSite.STRICT)
            .build();

        return Response.noContent().cookie(expiredCookie).build();
    }


    private GoogleIdToken.Payload verifyGoogleToken(String tokenString) {
        try {
            GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(
                    GoogleNetHttpTransport.newTrustedTransport(),
                    GsonFactory.getDefaultInstance())
                .setAudience(Collections.singletonList("600658539746-k08bunm4hmi6amnhkmhnmm3ujp4mnij2.apps.googleusercontent.com"))
                .build();

            GoogleIdToken idToken = verifier.verify(tokenString);
            if (idToken != null) {
                return idToken.getPayload();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private String createYourJwt(String userId, String email, String name) throws Exception {
        try {
            PrivateKey privateKey = loadPrivateKey("src/main/resources/META-INF/jwt/privateSigningKey.pem");
            return Jwts.builder()
                .subject(userId)
                .claim("email", email)
                .claim("name", name)
                .issuer("ses-gr04")
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 7 * 24 * 3600 * 1000))
                .signWith(privateKey, Jwts.SIG.RS256)
                .compact();
        } catch (Exception e) {
            throw new RuntimeException("Error creating JWT", e);
        }
    }

    private PrivateKey loadPrivateKey(String filename) throws Exception {
        String key = new String(Files.readAllBytes(Paths.get(filename)));
        key = key.replaceAll("-----BEGIN (.*)-----", "");
        key = key.replaceAll("-----END (.*)----", "");
        key = key.replaceAll("\\s", "");
        byte[] encoded = Base64.getDecoder().decode(key);
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(encoded);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(keySpec);
    }
}
