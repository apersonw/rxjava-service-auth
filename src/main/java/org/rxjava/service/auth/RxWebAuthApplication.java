package org.rxjava.service.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 认证微服务
 *
 * @author happy
 */
@SpringBootApplication
@ComponentScan(basePackages = {"org.rxjava"})
public class RxWebAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(RxWebAuthApplication.class, args);
    }
}