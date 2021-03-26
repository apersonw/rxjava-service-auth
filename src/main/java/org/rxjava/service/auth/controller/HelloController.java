package org.rxjava.service.auth.controller;

import org.rxjava.service.auth.entity.User;
import org.rxjava.service.auth.form.UserForm;
import org.rxjava.service.auth.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author happy
 */
@RestController
@RequestMapping("test")
public class HelloController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/admin/hello")
    public String admin() {
        return "hello admin";
    }

    @GetMapping("/user/hello")
    public String user() {
        return "hello user";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("user")
    public User saveUser(@Valid UserForm form) {
        User user = new User();
        BeanUtils.copyProperties(form, user);
        return userRepository.save(user);
    }

    @GetMapping("userObj")
    public User getUser(@Valid String username) {
        return userRepository.findUserByUsername(username);
    }
}
