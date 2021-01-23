package org.rxjava.service.auth.repository;

import org.rxjava.service.auth.entity.Menu;
import org.rxjava.service.auth.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MenuRepository extends JpaRepository<Menu, UUID> {

}
