package org.rxjava.service.auth.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.rxjava.web.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Set;

/**
 * @author happy
 * 角色表
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Role extends BaseEntity {
    /**
     * 用户角色中间表
     */
    @JsonIgnore
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
    /**
     * 角色菜单中间表
     */
    @ManyToMany
    @JoinTable(name = "role_menu",
            joinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "menu_id", referencedColumnName = "id")})
    private Set<Menu> menus;
    private String parentId;
    private String name;
    private String description;
}
