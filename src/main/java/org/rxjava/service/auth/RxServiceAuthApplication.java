package org.rxjava.service.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 响应式认证微服务
 *
 * @author happy
 */
@SpringBootApplication
public class RxServiceAuthApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(RxServiceAuthApplication.class).web(WebApplicationType.REACTIVE).run(args);
    }
}