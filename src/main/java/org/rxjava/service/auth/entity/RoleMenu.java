package org.rxjava.service.auth.entity;

import lombok.Data;
import org.rxjava.web.core.WebEntity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;

@Data
@Entity
public class RoleMenu extends WebEntity {
    private String name;
}
