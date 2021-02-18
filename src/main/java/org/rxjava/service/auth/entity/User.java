package org.rxjava.service.auth.entity;

import lombok.Data;
import org.rxjava.web.core.BaseEntity;

import javax.persistence.Entity;

@Data
@Entity
public class User extends BaseEntity {
    private String name;
    private String username;
    private String nickName;
    private String email;
    private String phone;
    private String gender;
    private String avatarName;
    private String avatarPath;
    private String password;
    private Boolean enabled;
    private Boolean isAdmin = false;
}
