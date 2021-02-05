package org.rxjava.service.auth.entity;

import lombok.Data;
import org.rxjava.web.core.WebEntity;

import javax.persistence.Entity;

@Data
@Entity
public class Role extends WebEntity {
    private String name;
}
