package org.rxjava.service.auth.dto;

import lombok.Data;

@Data
public class MemberDTO {

    private Long id;

    private String nickname;

    private String mobile;

    private Long balance;
}
