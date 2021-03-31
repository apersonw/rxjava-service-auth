package org.rxjava.service.auth.repository;

import org.rxjava.service.auth.entity.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author happy
 */
public interface RolePermissionRepository extends JpaRepository<RolePermission, String> {
}
