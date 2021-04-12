package org.rxjava.service.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.rxjava.web.core.BaseEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class UserGroup extends BaseEntity {
    private String userId;
    private String groupId;
}