package org.rxjava.service.auth.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 自定义异常解析器
 * @author happy
 */
@ControllerAdvice
@Slf4j
public class CustomExceptionHandler {
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    @ResponseBody
    public String exceptionHandler(SQLIntegrityConstraintViolationException e) {
        log.error("CustomExceptionHandler->exceptionHandler:",e);
        return e.getMessage();
    }
}
