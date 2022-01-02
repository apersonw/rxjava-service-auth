package org.rxjava.service.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import top.rxjava.starter.jpa.entity.BaseEntity;

import javax.persistence.Entity;

/**
 * @author happy
 * 菜单表
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Menu extends BaseEntity {
    private String title;
    private String componentName;
    private Integer menuSort = 999;
    private String component;
    private String path;
    private Integer type = 0;
    private String permission;
    private String icon;
    private Boolean cache;
    private Boolean hidden;
    private String parentId;
    private Integer subCount = 0;
    private Boolean iFrame;
    private long level;
    private long sort;
}
