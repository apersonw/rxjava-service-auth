package org.rxjava.service.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.rxjava.service.auth.type.PermissionType;
import org.rxjava.web.core.BaseEntity;

import javax.persistence.Entity;

/**
 * 组权限表
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class GroupPermission extends BaseEntity {
    private String groupId;
    private String permissionId;
    private PermissionType permissionType;
}
