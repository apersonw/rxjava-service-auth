package org.rxjava.service.auth.repository;

import org.rxjava.service.auth.entity.PermissionOperation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author happy
 */
public interface PermissionOperationRepository extends JpaRepository<PermissionOperation, String> {
}
