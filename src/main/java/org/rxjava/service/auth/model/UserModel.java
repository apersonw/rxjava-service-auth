package org.rxjava.service.auth.model;

import lombok.Data;

/**
 * @author happy
 */
@Data
public class UserModel {
    private String id;
    private String password;
    private String name;
    private String realName;
    private byte systemUser;
    private String idNumber;
    private String jobTitle;
    private String profTitle;
    private String phone;
    private String email;
    private byte active;
}
