package com.fitzen.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {

    private static final String SECRET =
            "fitzen_secret_key_for_jwt_authentication_2026";

    private static final long EXPIRATION =
            1000 * 60 * 60 * 24;

    public String generateToken(String username) {

        return Jwts.builder()
                .subject(username)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + EXPIRATION))
                .signWith(
                        io.jsonwebtoken.security.Keys.hmacShaKeyFor(
                                SECRET.getBytes()
                        ),
                        Jwts.SIG.HS256
                )
                .compact();

    }

    public String extractUsername(String token) {

        return getClaims(token).getSubject();

    }

    public boolean validateToken(String token, String username) {

        return extractUsername(token).equals(username)
                && !isExpired(token);

    }

    private boolean isExpired(String token) {

        return getClaims(token)
                .getExpiration()
                .before(new Date());

    }

    private Claims getClaims(String token) {

        return Jwts.parser()
                .verifyWith(
                        io.jsonwebtoken.security.Keys.hmacShaKeyFor(
                                SECRET.getBytes()
                        )
                )
                .build()
                .parseSignedClaims(token)
                .getPayload();

    }

}