package org.rxjava.service.auth.entity;

import lombok.Data;
import org.rxjava.web.core.BaseEntity;

import javax.persistence.Entity;

@Data
@Entity
public class RoleMenu extends BaseEntity {
    private String name;
}
