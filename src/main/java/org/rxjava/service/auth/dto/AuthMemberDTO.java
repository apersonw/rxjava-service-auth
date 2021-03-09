package org.rxjava.service.auth.dto;

import lombok.Data;

@Data
public class AuthMemberDTO {

    private Long id;
    private String username;
    private String password;
    private Integer status;
    private String clientId;

    private String avatar;
    private String nickname;

}
