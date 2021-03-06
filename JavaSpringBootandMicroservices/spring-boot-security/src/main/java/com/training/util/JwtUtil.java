package com.training.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;



@Component
//generate token based on the username
public class JwtUtil {
	
	public String generateToken(String username) {
		Map<String,Object> claims = new HashMap<>();
		claims.put("project", "as");
		
		return createToken(claims,username);
	}
	
	private String secretKey = "jwttest";
	
	private String createToken(Map<String,Object> claims,String username) {
	
		String token = Jwts.builder()
				.setClaims(claims)
				.setSubject(username)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+1000*60*60*1))
				.signWith(io.jsonwebtoken.SignatureAlgorithm.HS256, secretKey).compact();
		
		return token;
	}

	public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject); // username
    }

    public Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }
    private Claims extractAllClaims(String token) {
        return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
    }

    private Boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    public Boolean validateToken(String token, UserDetails userDetails) {
        final String username = extractUsername(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }
	
}
