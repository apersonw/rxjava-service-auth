package org.rxjava.service.auth.service;

import org.rxjava.service.auth.dto.AuthMemberDTO;
import org.rxjava.service.auth.dto.MemberDTO;
import org.rxjava.service.auth.pojo.UmsUser;
import org.rxjava.service.auth.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("mall-ums")
public interface MemberFeignService {

    @PostMapping("/api.app/v1/users")
    Result add(@RequestBody UmsUser user);

    /**
     * 获取会员信息
     */
    @GetMapping("/api.app/v1/users/{id}")
    Result<MemberDTO> getUserById(@PathVariable Long id);


    /**
     * 获取认证会员信息
     */
    @GetMapping("/api.app/v1/users/openid/{openid}")
    Result<AuthMemberDTO> getUserByOpenid(@PathVariable String openid);

}


