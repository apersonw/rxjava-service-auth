package org.rxjava.service.auth.service;

import org.rxjava.service.auth.dto.UserDTO;
import org.rxjava.service.auth.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "youlai-admin")
public interface UserFeignService {

    @GetMapping("/api.admin/v1/users/username")
    Result<UserDTO> getUserByUsername();
}
