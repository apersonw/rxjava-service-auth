package org.rxjava.service.auth.provider;

import org.rxjava.service.auth.entity.Role;
import org.rxjava.service.auth.entity.User;
import org.rxjava.service.auth.form.UserForm;
import org.rxjava.service.auth.repository.RoleRepository;
import org.rxjava.service.auth.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleProvider {
    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("roleList")
    public List<Role> getUserList() {
        return roleRepository.findAll();
    }

    @GetMapping("role")
    public Role saveRole(UserForm form) {
        Role role = new Role();
        BeanUtils.copyProperties(form, role);
        return roleRepository.save(role);
    }
}
