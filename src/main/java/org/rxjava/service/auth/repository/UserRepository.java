package org.rxjava.service.auth.repository;

import org.rxjava.service.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author happy
 */
public interface UserRepository extends JpaRepository<User, String> {
}
