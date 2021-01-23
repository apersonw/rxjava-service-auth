package org.rxjava.service.auth.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class Resource {

    @Id
    private UUID id;

    private String discription;

    private String url;

    private String creator;

    @CreatedDate
    private LocalDateTime createTime;

    private Integer status;

    private Integer type;
}
