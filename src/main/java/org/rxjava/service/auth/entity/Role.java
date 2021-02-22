package org.rxjava.service.auth.entity;

import lombok.Data;
import org.rxjava.web.core.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Role extends BaseEntity {
    private String name;
    private String description;
}
