package org.rxjava.service.auth.controller;

import org.rxjava.service.auth.entity.User;
import org.rxjava.service.auth.form.UserForm;
import org.rxjava.service.auth.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author happy
 */
@RestController
@RequestMapping("test")
public class HelloController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

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
        user.setPassword(passwordEncoder.encode("123456"));
        return userRepository.save(user);
    }

    @PreAuthorize("hasAuthority('userObj:read')")
    @GetMapping("userObj")
    public User getUser(@RequestParam String username) {
        return userRepository.findUserByUsername(username);
    }
}
