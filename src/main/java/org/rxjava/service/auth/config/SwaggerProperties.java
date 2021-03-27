package org.rxjava.service.auth.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * swagger的属性配置类
 */
@ConfigurationProperties(prefix = "spring.swagger")
@Data
public class SwaggerProperties {
    /**
     * 前台接口配置
     */
    private SwaggerEntity front = new SwaggerEntity();
    /**
     * 后台接口配置
     */
    private SwaggerEntity back = new SwaggerEntity();

    @Data
    public static class SwaggerEntity {
        private String groupName;
        private String basePackage;
        private String title;
        private String description;
        private String contactName;
        private String contactEmail;
        private String contactUrl;
        private String version;
        private Boolean enable = Boolean.TRUE;
    }
}