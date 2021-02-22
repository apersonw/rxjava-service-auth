package org.rxjava.service.auth.entity;

import lombok.Data;
import org.rxjava.web.core.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 角色菜单表
 */
@Data
@Document
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
