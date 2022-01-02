package org.rxjava.service.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.rxjava.service.auth.type.PermissionType;
import top.rxjava.starter.jpa.entity.BaseEntity;

import javax.persistence.Entity;

/**
 * 用户权限表
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class UserPermission extends BaseEntity {
    private String userId;
    private String permissionId;
    private PermissionType permissionType;
}
