package org.fablab.labank.configuration.security.hmac;

/**
 * HMAC Token
 * Created by kprim on 02/01/2017.
 */
public class HmacToken {

    private String jwtID;

    private String secret;

    private String jwt;


    public HmacToken(String jwtID, String secret, String jwt) {
        this.jwtID = jwtID;
        this.secret = secret;
        this.jwt = jwt;
    }

    public String getJwtID() {
        return jwtID;
    }

    public String getSecret() {
        return secret;
    }

    public String getJwt() {
        return jwt;
    }
}
