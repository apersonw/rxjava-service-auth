package org.rxjava.service.auth.repository;

import org.rxjava.service.auth.entity.RoleMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleMenuRepository extends JpaRepository<RoleMenu, String> {

}
