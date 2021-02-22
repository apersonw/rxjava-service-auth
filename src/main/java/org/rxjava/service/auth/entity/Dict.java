package org.rxjava.service.auth.entity;

import lombok.Data;
import org.rxjava.web.core.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author happy
 * 字典
 */
@Data
@Document
public class Dict extends BaseEntity {

    private String dictKey;

    private String value;

    private String tableName;

    private String fieldName;
}