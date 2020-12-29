package org.rxjava.service.auth.config;

import lombok.Data;

@Data
public class OAuth2Property {
    private OAuth2ClientProperty[] clients = {};
}
