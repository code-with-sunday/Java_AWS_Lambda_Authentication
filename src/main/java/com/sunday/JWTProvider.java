package com.sunday;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JWTProvider {

    private static final String SECRET_KEY = "kjdbvkjhbdkhjabdhvahbiudhiuvhiurhghwqbjdbadvbouasbdfbvajdbjvbouabdvoujabdfvjabdsvjaobdcvaola";

    private String generateJwtToken(String username) {
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(now)
                .setExpiration(new Date(nowMillis + 3600000)) // 1 hour expiration
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }
}
