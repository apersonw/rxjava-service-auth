package org.rxjava.service.auth.entity;

import lombok.Data;
import org.rxjava.web.core.BaseEntity;

/**
 * @author happy
 * 字典
 */
@Data
public class Dict extends BaseEntity {

    private String dictKey;

    private String value;

    private String tableName;

    private String fieldName;
}