package org.rxjava.service.auth.repository;

import org.rxjava.service.auth.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DictRepository extends JpaRepository<Menu, String> {

}
