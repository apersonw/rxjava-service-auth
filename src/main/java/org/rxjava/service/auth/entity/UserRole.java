package org.rxjava.service.auth.entity;

import lombok.Data;
import org.rxjava.web.core.BaseEntity;

/**
 * @author happy
 */
@Data
public class UserRole extends BaseEntity {

    private String userId;

    private String roleId;
}
