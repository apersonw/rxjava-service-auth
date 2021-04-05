package org.rxjava.service.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.rxjava.web.core.BaseEntity;

import javax.persistence.Entity;

/**
 * @author happy
 * 角色表
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Role extends BaseEntity {
    private String parentId;
    private String name;
    private String description;
}
