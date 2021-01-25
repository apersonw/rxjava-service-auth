package org.rxjava.service.auth.repository;

import org.rxjava.service.auth.entity.Menu;
import org.rxjava.service.auth.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, String> {

}
