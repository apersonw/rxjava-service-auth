package org.rxjava.service.auth.entity;

import lombok.Data;
import org.rxjava.web.core.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Resource extends BaseEntity {

    private String discription;

    private String url;

    private String creator;

    private Integer status;

    private Integer type;
}
