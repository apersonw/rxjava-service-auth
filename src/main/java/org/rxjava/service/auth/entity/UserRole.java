package org.rxjava.service.auth.entity;

import lombok.Data;
import org.rxjava.web.core.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author happy
 */
@Data
@Document
public class UserRole extends BaseEntity {

    private String userId;

    private String roleId;
}
