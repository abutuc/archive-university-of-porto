package pt.up.feup.ses.utils;

import io.jsonwebtoken.*;

import java.security.PublicKey;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class JwtUtils {
    private static PublicKey publicKey = null;

    static {
        try {
            String key = new String(Files.readAllBytes(Paths.get("src/main/resources/META-INF/jwt/publicVerificationKey.pem")));
            key = key.replaceAll("-----BEGIN (.*)-----", "");
            key = key.replaceAll("-----END (.*)-----", "");
            key = key.replaceAll("\\s", "");
            byte[] encoded = Base64.getDecoder().decode(key);
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(encoded);
            KeyFactory kf = KeyFactory.getInstance("RSA");
            publicKey = kf.generatePublic(keySpec);
        } catch (Exception e) {
            // handle error
        }
    }

    public static Jws<Claims> parseJwt(String jwtString) throws JwtException {
        return Jwts.parser()
            .verifyWith(publicKey)
            .build()
            .parseSignedClaims(jwtString);
    }

    public static String getUserIdFromToken(String jwtString) throws JwtException {
        Claims claims = parseJwt(jwtString).getPayload();
        return claims.getSubject();
    }
}
