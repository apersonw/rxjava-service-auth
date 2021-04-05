package org.rxjava.service.auth.controller;

import org.rxjava.service.auth.entity.Role;
import org.rxjava.service.auth.entity.User;
import org.rxjava.service.auth.repository.RoleRepository;
import org.rxjava.service.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @PostMapping("login/account")
    public User login() {
        return new User();
    }

    @GetMapping("user/list")
    public List<User> userList() {
        return userRepository.findAll();
    }

    @GetMapping("user/init")
    public User userSave() {
        User user = new User();
        user.setUsername("test");
        Role role = new Role();
        role.setName("test");
        roleRepository.save(role);
        HashSet<Role> roles = new HashSet<>();
        roles.add(role);
        user.setRoles(roles);
        return userRepository.save(user);
    }
}
