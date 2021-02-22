package org.rxjava.service.auth.provider;

import org.rxjava.service.auth.entity.User;
import org.rxjava.service.auth.form.UserRegisterForm;
import org.rxjava.service.auth.repository.UserRepository;
import org.rxjava.service.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserProvider {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    /**
     * 注册用户
     */
    @PostMapping("register")
    public User register(UserRegisterForm form) {
        return userService.save(form);
    }

    /**
     * 查询用户列表
     */
    @GetMapping("page")
    public Page<User> list() {
        return userRepository.findAll(PageRequest.of(0, 100));
    }

    /**
     * 导出用户数据
     */
    @GetMapping(value = "/download")
    @PreAuthorize("@el.check('user:list')")
    public void download() {
    }

    /**
     * 查询用户列表
     */
    @GetMapping
    @PreAuthorize("@el.check('user:list')")
    public List<User> query() {
        return userRepository.findAllUsers();
    }

    /**
     * 新增用户
     */
    @PostMapping
    @PreAuthorize("@el.check('user:add')")
    public User create() {
        return new User();
    }

    /**
     * 修改用户
     */
    @PutMapping
    @PreAuthorize("@el.check('user:edit')")
    public User update() {
        return new User();
    }

    /**
     * 删除用户
     */
    @DeleteMapping
    @PreAuthorize("@el.check('user:del')")
    public void delete() {
    }

    /**
     * 个人信息修改
     */
    @PutMapping(value = "self")
    public User center() {
        return new User();
    }

    /**
     * 个人密码修改
     */
    @PatchMapping("/password")
    public void selfUpdatePassword() {
    }

    /**
     * 个人头像修改
     */
    @PatchMapping("/avatar")
    public void selfUpdateAvatar() {
    }

    /**
     * 个人邮箱修改
     */
    @PatchMapping("/updateEmail/{code}")
    public void updateEmail() {
    }

}
