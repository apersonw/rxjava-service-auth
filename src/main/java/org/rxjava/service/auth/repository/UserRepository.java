package org.rxjava.service.auth.repository;

import org.rxjava.service.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
