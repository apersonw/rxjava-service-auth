package org.rxjava.service.auth.entity;

import lombok.Data;
import org.rxjava.web.core.WebEntity;

import javax.persistence.Entity;

@Entity
@Data
public class Resource extends WebEntity {

    private String discription;

    private String url;

    private String creator;

    private Integer status;

    private Integer type;
}
