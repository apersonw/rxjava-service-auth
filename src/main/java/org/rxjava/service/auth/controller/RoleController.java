package org.rxjava.service.auth.controller;

import lombok.RequiredArgsConstructor;
import org.rxjava.service.auth.entity.Role;
import org.rxjava.service.auth.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("role")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class RoleController {
    private final RoleRepository roleRepository;

    @GetMapping("list")
    public List<Role> roleList() {
        return roleRepository.findAll();
    }
}
