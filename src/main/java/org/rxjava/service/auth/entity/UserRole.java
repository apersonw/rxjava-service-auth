package org.rxjava.service.auth.entity;

import lombok.Data;
import org.rxjava.web.core.WebEntity;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 * @author happy
 */
@Data
@Entity
@Table(
        indexes = {
                @Index(columnList = "userId,roleId",unique = true)
        }
)
public class UserRole extends WebEntity {

    private String userId;

    private String roleId;
}
