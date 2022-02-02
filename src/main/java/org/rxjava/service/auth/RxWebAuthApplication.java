package org.rxjava.service.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 认证中心微服务(含用户权限管理)
 * @author happy
 */
@SpringBootApplication
public class RxWebAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(RxWebAuthApplication.class, args);
    }
}