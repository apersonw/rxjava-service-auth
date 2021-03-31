package org.rxjava.service.auth.repository;

import org.rxjava.service.auth.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author happy
 */
public interface UserRoleRepository extends JpaRepository<UserRole, String> {
}
