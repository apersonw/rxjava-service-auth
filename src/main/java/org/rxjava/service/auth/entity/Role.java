package org.rxjava.service.auth.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.rxjava.web.core.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
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
    @JsonIgnoreProperties("roles")
    @ManyToMany(mappedBy = "roles")
    private Set<User> users=new HashSet<>();
    ///**
    // * 角色菜单中间表
    // */
    //@ManyToMany
    //@JoinTable(name = "role_menu",
    //        joinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")},
    //        inverseJoinColumns = {@JoinColumn(name = "menu_id", referencedColumnName = "id")})
    //private Set<Menu> menus;
    private String parentId;
    private String name;
    private String description;
}
