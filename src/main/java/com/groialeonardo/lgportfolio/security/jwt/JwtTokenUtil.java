
package com.groialeonardo.lgportfolio.security.jwt;

import com.sun.org.apache.xml.internal.security.algorithms.SignatureAlgorithm;
import io.jsonwebtoken.Jwts;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
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
                .SetIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()*EXPIRE_DURATION))
                .singWith(SignatureAlgorithm.HS512,secretKey)
                .compact();
                
        
    }

}
