package org.rxjava.service.auth.provider;

import org.rxjava.service.auth.entity.User;
import org.rxjava.service.auth.form.UserForm;
import org.rxjava.service.auth.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserProvider {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("userList")
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @GetMapping("user")
    public User saveUser(UserForm form) {
        User user = new User();
        BeanUtils.copyProperties(form, user);
        return userRepository.save(user);
    }
}
