package org.rxjava.service.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import top.rxjava.starter.jpa.entity.BaseEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Permission extends BaseEntity {
    private String parentId;
    private String name;
    private String type;
    private String description;
}
