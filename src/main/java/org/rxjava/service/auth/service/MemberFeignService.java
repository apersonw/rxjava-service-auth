package org.rxjava.service.auth.service;

import org.rxjava.service.auth.dto.AuthMemberDTO;
import org.rxjava.service.auth.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("mall-ums")
public interface MemberFeignService {

    @GetMapping("/api.admin/v1/member/{username}")
    Result<AuthMemberDTO> getUserByOpenid(String username);
}


