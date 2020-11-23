package org.rxjava.service.auth.service;

import org.rxjava.service.auth.entity.SysUser;
import org.springframework.stereotype.Service;

@Service
public class SysUserService {

    /**
     *  根据用户名查询用户
     */
    public SysUser selectByUsername(String username) {
        return new SysUser("1","yaohw","$2a$10$CwIutywnbs9bifHaY3Ezu.gYkWi4Zano8gVPq08hXjal6.uj.Yzuy","测试字段，根据用户名查询");
    }

    /**
     * 根据手机号查询用户
     */
    public SysUser selectByMobile(String mobile) {
        return new SysUser("2","yaohw2","$2a$10$CwIutywnbs9bifHaY3Ezu.gYkWi4Zano8gVPq08hXjal6.uj.Yzuy","测试字段，根据手机号查询");
    }
}
