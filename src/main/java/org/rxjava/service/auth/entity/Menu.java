package org.rxjava.service.auth.entity;

import lombok.Data;
import org.rxjava.service.auth.type.MenuType;
import org.rxjava.web.core.WebEntity;

import javax.persistence.Entity;

@Data
@Entity
public class Menu extends WebEntity {

    private String parentId;

    private String name;

    private String url;

    private String permissionFlag;

    private String icon;

    private MenuType menuType;

    private int orderNum;
}
