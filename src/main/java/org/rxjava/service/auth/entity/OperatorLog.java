package org.rxjava.service.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.rxjava.web.core.BaseEntity;

import javax.persistence.Entity;

/**
 * 操作日志表
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class OperatorLog extends BaseEntity {
    private String content;
    private String userId;
}
