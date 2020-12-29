package org.rxjava.service.auth.config;

import lombok.Data;

@Data
public class OAuth2ClientProperty {
    private String clientId;
    private String clientSecret;
    private int accessTokenValiditySeconds;
}
