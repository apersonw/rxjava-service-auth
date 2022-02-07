package org.rxjava.service.auth.filter;

import org.rxjava.service.auth.service.DynamicSecurityService;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.CollectionUtils;
import org.springframework.util.PathMatcher;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.*;

/**
 * 动态权限数据源，用于获取动态权限规则
 * Created by macro on 2020/2/7.
 */
public class DynamicSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    private static Map<String, ConfigAttribute> configAttributeMap = null;
    private final DynamicSecurityService dynamicSecurityService;

    public DynamicSecurityMetadataSource(DynamicSecurityService dynamicSecurityService) {
        this.dynamicSecurityService = dynamicSecurityService;
    }

    @PostConstruct
    public void loadDataSource() {
        configAttributeMap = dynamicSecurityService.loadDataSource();
    }

    @PreDestroy
    public void clearDataSource() {
        configAttributeMap.clear();
        configAttributeMap = null;
    }

    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        if (configAttributeMap == null) {
            this.loadDataSource();
        }
        List<ConfigAttribute>  configAttributes = new ArrayList<>();
        //获取当前访问的路径
        String path = ((FilterInvocation) o).getRequestUrl();
        PathMatcher pathMatcher = new AntPathMatcher();
        //获取访问该路径所需资源
        if (!CollectionUtils.isEmpty(configAttributes)) {
            for (String pattern : configAttributeMap.keySet()) {
                if (pathMatcher.match(pattern, path)) {
                    configAttributes.add(configAttributeMap.get(pattern));
                }
            }
        }
        // 未设置操作请求权限，返回空集合
        return configAttributes;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }

}
