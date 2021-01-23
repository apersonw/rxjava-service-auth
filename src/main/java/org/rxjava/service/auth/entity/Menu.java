package org.rxjava.service.auth.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.rxjava.service.auth.type.MenuType;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;

    private String parentId;

    private String name;

    private String url;

    private String permissionFlag;

    private String icon;

    private MenuType menuType;

    private int orderNum;

    @CreatedDate
    private LocalDateTime createTime;

    @LastModifiedDate
    private LocalDateTime updateTime;
}
