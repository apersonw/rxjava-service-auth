package org.rxjava.service.auth.repository;

import org.rxjava.service.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author happy
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findUserByUsername(String username);
}
