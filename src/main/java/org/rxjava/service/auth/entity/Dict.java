package org.rxjava.service.auth.entity;

import lombok.Data;
import org.rxjava.web.core.WebEntity;

import javax.persistence.Entity;

/**
 * @author happy
 * 字典
 */
@Data
@Entity
public class Dict extends WebEntity {

    private String dictKey;

    private String value;

    private String tableName;

    private String fieldName;
}