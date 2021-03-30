package org.rxjava.service.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.rxjava.web.core.BaseEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Menu extends BaseEntity {
    private String name;
    private String icon;
    private String url;
    private String type;
    private int level;
    private String status;
}
