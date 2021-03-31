package org.rxjava.service.auth.controller;

import org.rxjava.service.auth.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("login/account")
    public User login() {
        return new User();
    }
}
