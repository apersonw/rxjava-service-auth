package org.rxjava.service.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import top.rxjava.starter.jpa.entity.BaseEntity;

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
