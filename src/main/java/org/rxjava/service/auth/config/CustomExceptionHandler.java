package org.rxjava.service.auth.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 自定义异常解析器
 */
@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(value = SQLIntegrityConstraintViolationException.class)
    @ResponseBody
    public String exceptionHandler(SQLIntegrityConstraintViolationException e) {
        System.out.println("发生了一个异常" + e);
        return e.getMessage();
    }
}
