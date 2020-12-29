package org.rxjava.service.auth.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author happy
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "xwj.security")
public class SecurityProperty {

    private OAuth2Property oauth2 = new OAuth2Property();

}
