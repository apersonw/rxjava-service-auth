package org.rxjava.service.auth.repository;

import org.rxjava.service.auth.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {

}
