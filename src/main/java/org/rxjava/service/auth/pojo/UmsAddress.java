package org.rxjava.service.auth.pojo;


import lombok.Data;
import lombok.experimental.Accessors;
import nonapi.io.github.classgraph.json.Id;


@Data
@Accessors(chain = true)
public class UmsAddress {

    @Id
    private Long id;

    private Long userId;

    private String name;

    private String mobile;

    private String province;

    private String city;

    private String area;

    private String address;

    private String zipCode;

    private Integer defaulted;
}
