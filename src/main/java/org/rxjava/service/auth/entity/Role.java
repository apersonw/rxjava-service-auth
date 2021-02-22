package org.rxjava.service.auth.entity;

import lombok.Data;
import org.rxjava.web.core.BaseEntity;

@Data
public class Role extends BaseEntity {
    private String name;
    private String description;
}
