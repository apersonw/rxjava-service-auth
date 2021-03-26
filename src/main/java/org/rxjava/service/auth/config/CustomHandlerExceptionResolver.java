package org.rxjava.service.auth.config;

import org.jetbrains.annotations.NotNull;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 自定义异常解析器
 */
public class CustomHandlerExceptionResolver extends DefaultHandlerExceptionResolver implements MessageSourceAware {
    @Override
    public void setMessageSource(@NotNull MessageSource messageSource) {

    }

    @Override
    protected ModelAndView doResolveException(
            @NotNull HttpServletRequest request,
            @NotNull HttpServletResponse response,
            Object handler,
            @NotNull Exception ex
    ) {
        ModelAndView modelAndView = new ModelAndView();
        if (ex instanceof DataIntegrityViolationException) {
            modelAndView.addObject("errorMessage",ex.getMessage());
        }
        return modelAndView;
    }
}
