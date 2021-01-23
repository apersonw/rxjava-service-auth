package org.rxjava.service.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * 认证微服务
 *
 * @author happy
 */
@SpringBootApplication
@EnableJpaAuditing
public class RxServiceAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(RxServiceAuthApplication.class, args);
    }
}