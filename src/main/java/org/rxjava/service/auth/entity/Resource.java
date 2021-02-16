package org.rxjava.service.auth.entity;

import lombok.Data;
import org.rxjava.web.core.BaseEntity;

import javax.persistence.Entity;

@Entity
@Data
public class Resource extends BaseEntity {

    private String discription;

    private String url;

    private String creator;

    private Integer status;

    private Integer type;
}
