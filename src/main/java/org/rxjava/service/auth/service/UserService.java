package org.rxjava.service.auth.service;

import org.codehaus.jackson.map.util.BeanUtil;
import org.rxjava.service.auth.entity.User;
import org.rxjava.service.auth.form.UserRegisterForm;
import org.rxjava.service.auth.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(UserRegisterForm form) {
        User user = new User();
        BeanUtils.copyProperties(form, user);
        return userRepository.save(user);
    }
}
