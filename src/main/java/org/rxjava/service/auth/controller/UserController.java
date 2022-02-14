package org.rxjava.service.auth.controller;

import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UserController {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

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
