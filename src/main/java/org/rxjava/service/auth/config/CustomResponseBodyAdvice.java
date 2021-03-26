package org.rxjava.service.auth.config;

import org.jetbrains.annotations.NotNull;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@ControllerAdvice
public class CustomResponseBodyAdvice implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(@NotNull MethodParameter methodParameter, @NotNull Class<? extends HttpMessageConverter<?>> aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(
            Object o,
            @NotNull MethodParameter methodParameter,
            @NotNull MediaType mediaType,
            @NotNull Class<? extends HttpMessageConverter<?>> aClass,
            @NotNull ServerHttpRequest serverHttpRequest,
            @NotNull ServerHttpResponse serverHttpResponse
    ) {
        return null;
    }
}
