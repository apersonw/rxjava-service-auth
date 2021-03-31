package org.rxjava.service.auth.repository;

import org.rxjava.service.auth.entity.PermissionMenu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author happy
 */
public interface PermissionMenuRepository extends JpaRepository<PermissionMenu, String> {
}
