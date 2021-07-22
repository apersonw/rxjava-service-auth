package org.rxjava.service.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.rxjava.web.core.BaseEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Admin extends BaseEntity {
    private String username;
    private String password;
    private String icon;
    private String email;
    private String nickName;
    private String note;
    private boolean status;
}
