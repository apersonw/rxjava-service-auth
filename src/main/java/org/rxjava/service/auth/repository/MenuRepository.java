package org.rxjava.service.auth.repository;

import org.rxjava.service.auth.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author happy
 */
public interface MenuRepository extends JpaRepository<Menu, String> {
}
