package org.rxjava.service.auth.provider;

import lombok.RequiredArgsConstructor;
import org.rxjava.service.auth.model.UserElementModel;
import org.rxjava.service.auth.model.UserModel;
import org.rxjava.service.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author happy
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UserProvider {
    private final UserService userService;

    /**
     * 查询用户所有详情
     */
    @GetMapping("/getUserDetail")
    public UserModel getUserDetail() {
        //有必要做一下Redis缓存
        final UserModel userAllInfoDto = userService.queryUserAllDetail("userName");
        userAllInfoDto.setPassword(null);
        return userAllInfoDto;
    }

    /**
     * 查询用户拥有的权限元素
     */
    @GetMapping("/elements")
    public List<UserElementModel> getElements() {
        //有必要做一下Redis缓存
        return userService.queryUserElementModelList("userName");
    }
}
