package org.rxjava.service.auth.repository;

import org.rxjava.service.auth.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author happy
 */
public interface PermissionRepository extends JpaRepository<Permission, String> {
}
