package org.rxjava.service.auth.exceptionn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.oauth2.common.exceptions.InvalidGrantException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author happy
 */
@RestControllerAdvice
@Slf4j
public class AuthExceptionHandler {

    /**
     * 用户名和密码异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(InvalidGrantException.class)
    public String handleInvalidGrantException(InvalidGrantException e) {
        return "用户名或密码错误";
    }


    /**
     * 账户异常(禁用、锁定、过期)
     *
     * @param e
     * @return
     */
    @ExceptionHandler({InternalAuthenticationServiceException.class})
    public String handleInternalAuthenticationServiceException(InternalAuthenticationServiceException e) {
        return "账户异常(禁用、锁定、过期)";
    }

}
