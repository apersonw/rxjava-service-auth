package org.rxjava.service.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.rxjava.service.auth.type.PermissionType;
import org.rxjava.web.core.BaseEntity;

import javax.persistence.Entity;

/**
 * 角色权限表
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class RolePermission extends BaseEntity {
    private String roleId;
    private String permissionId;
    private PermissionType permissionType;
}
