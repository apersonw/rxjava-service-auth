package org.rxjava.service.auth.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Resource {

    private String discription;

    private String url;

    private String creator;

    private Integer status;

    private Integer type;

    /************通用定义字段************/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;

    @Version
    private long version;

    @CreatedBy
    private String createUserId;

    @LastModifiedBy
    private String lastModifyUserId;

    @CreatedDate
    private LocalDateTime createDateTime;

    @LastModifiedDate
    private LocalDateTime lastModifiedDateTime;
}
