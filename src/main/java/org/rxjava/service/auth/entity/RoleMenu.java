package org.rxjava.service.auth.entity;

import lombok.Data;
import org.rxjava.web.core.BaseEntity;

/**
 * 角色菜单表
 */
@Data
public class RoleMenu extends BaseEntity {
    /**
     * 角色Id
     */
    private String roleId;
    /**
     * 菜单Id
     */
    private String menuId;
}
