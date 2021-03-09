package org.rxjava.service.auth.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String username;
    private String password;
    private Integer status;
    private String clientId;
    private List<Long> roleIds;

}
