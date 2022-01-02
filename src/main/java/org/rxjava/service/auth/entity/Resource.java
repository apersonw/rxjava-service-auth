package org.rxjava.service.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bson.types.ObjectId;
import top.rxjava.starter.jpa.entity.BaseEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Resource extends BaseEntity {
    private ObjectId categoryId;
    private String name;
    private String url;
    private String description;
}
