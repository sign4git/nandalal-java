package com.example.SpringSecurity.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JwtService {

    private static final String SECRET="71662bddeca9fed26bd1787d4a86a2d4d9bd9f73de86aafbf226e43f998ccf83d7d22b859e71e9fd8c0387a29ebc3bedbb3f301503fd8ac9c66e314c30dbe06a505598002925e722d8274417d7650557c5ea125b0e945cdd2fa656b43be4d7ae1de8ffa16a9c97defde83e325214f1bd2a5a978511f7e238e1ade63fe50e4ce98f22fda190ea4edb4d5462d21cfc920762aa71f8a32a5b2fb3b2e899dc1524d48a552d704a10be06b658d335afe8079678cf1570d31bd7157dbc65fdd3579a3714f7656629e6f6acb16ac8380e95c22beb2514c906727501ae921fc24846b28a971a400607d92b9ee597356d55bf7e1f458af73e147d133ff29ca26fde795b41";

    private String secretKey;

    public JwtService() throws NoSuchAlgorithmException {
        secretKey = generateSecretKey();
        System.out.println(secretKey);
    }

    public String generateSecretKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
        SecretKey secretKey = keyGen.generateKey();
//        System.out.println(secretKey);
        return Base64.getEncoder().encodeToString(secretKey.getEncoded());
    }

    public String generateJwtToken(String userName){
        Map<String,Object> claims = new HashMap<>();
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(userName)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+1000*60*3))
                .signWith(getKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    private Key getKey() {
        byte [] keyBytes = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
