package com.groialeonardo.lgportfolio.security.jwt;

import com.groialeonardo.lgportfolio.model.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenUtil {
    
    private static final Logger LOGGER= LoggerFactory.getLogger(JwtTokenUtil.class);
    private static final long EXPIRE_DURATION=1*60*60*1000;
    
    @Value("${app.jwt.secret}")
    private String secretKey;
    
    public String generateAccessToken(User user){
        return Jwts.builder()
                .setSubject(user.getId() + "," + user.getEmail())
                .setIssuer("CodeJava")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()*EXPIRE_DURATION))
                .signWith(SignatureAlgorithm.HS512,secretKey)
                .compact();                
        
    }
    
    public boolean validateAccessToken(String token){
        try{
            Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
            return true;
        }
        catch (ExpiredJwtException ex){
            LOGGER.error("El JWT ha expirado", ex);
        }
        catch (IllegalArgumentException ex){
            LOGGER.error("El token es nulo, vacío o solo contiene espacios en blanco", ex);
        }
        catch (MalformedJwtException ex){
            LOGGER.error("JWT invalido", ex);
        }
        catch (UnsupportedJwtException ex){
            LOGGER.error("JWT no soportado", ex);
        }
        catch (SignatureException ex){
            LOGGER.error("fallo en validacion de firma", ex);
        }
        
        return false;
    }
    
    public String getSubject(String token){
        return parseClaims(token).getSubject();
    }
    
    private Claims parseClaims (String token){
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody();
    }

}
