package org.rxjava.service.auth.pojo;


import lombok.Data;
import lombok.experimental.Accessors;
import nonapi.io.github.classgraph.json.Id;

import java.time.LocalDate;
import java.util.List;

@Data
@Accessors(chain = true)
public class UmsUser {

    @Id
    private Long id;

    private String username;

    private String password;

    private Integer gender;

    private String nickname;

    private String mobile;

    private LocalDate birthday;

    private String avatar;

    private String openid;

    private String sessionKey;

    private Integer status;

    private Integer point;

    private Integer deleted;

    private List<UmsAddress> addressList;

    //    @TableField(exist = false)
    private Long balance;

}
