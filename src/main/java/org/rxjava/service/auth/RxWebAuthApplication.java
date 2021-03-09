package org.rxjava.service.auth;

import org.rxjava.service.auth.service.MemberFeignService;
import org.rxjava.service.auth.service.UserFeignService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 认证微服务
 *
 * @author happy
 */
@EnableFeignClients(basePackageClasses = {UserFeignService.class, MemberFeignService.class})
@SpringBootApplication
public class RxWebAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(RxWebAuthApplication.class, args);
    }
}