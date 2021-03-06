package org.rxjava.service.auth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 这里可以看作数据库实体
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser {

    private String id;

    private String username;

    private String password;

    private String test;
}
