package org.rxjava.service.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 认证微服务
 *
 * @author happy
 */
@SpringBootApplication
public class RxWebAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(RxWebAuthApplication.class, args);
    }
}