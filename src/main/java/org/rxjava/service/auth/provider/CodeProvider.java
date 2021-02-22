package org.rxjava.service.auth.provider;

import org.springframework.web.bind.annotation.*;

/**
 * 验证码
 */
@RestController
@RequestMapping("codes")
public class CodeProvider {
    /**
     * 重置邮箱，发送验证码
     */
    @PostMapping(value = "/resetEmail")
    public void resetEmail(@RequestParam String email) {
    }

    /**
     * 重置密码，发送验证码
     */
    @PostMapping(value = "/email/resetPass")
    public void resetPass(@RequestParam String email) {
    }

    /**
     * 验证码验证
     */
    @GetMapping(value = "/validated")
    public void validated() {

    }
}
