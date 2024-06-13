/*
 * Copyright (c) Windy my copyright message. 2024-2024. All rights reserved. (MIT)
 *
 */

package com.windy.common;


import io.jsonwebtoken.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class JwtUtils {

    private static final String SECRET_KEY = "5qaMWJ7HZY1m9arl2p9Hwfx8Ox6aHGex";
    private static final long EXPIRATION_TIME = 86400000; // 24小时

    public static String generateToken(String username) {
        Map<String,Object> claims = new HashMap<>();
        claims.put("username", username);
        JwtBuilder jwtBuilder = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .setClaims(claims)
                .setIssuedAt(new Date(System.currentTimeMillis()+EXPIRATION_TIME));
        String token = jwtBuilder.compact();
        return token;
    }

    public static Map<String,Object> parseToken(String token) {
        try {
            Jwt parse= Jwts.parser().setSigningKey(SECRET_KEY).parse(token);
            return (Map<String,Object>) parse.getBody();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String token = JwtUtils.generateToken("windy333");
        System.out.println(token);
        Map<String,Object> claims = JwtUtils.parseToken(token);
        System.out.println(claims);
    }

}