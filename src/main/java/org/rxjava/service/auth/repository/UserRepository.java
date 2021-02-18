package org.rxjava.service.auth.repository;

import org.rxjava.service.auth.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String>, SpecialUserRepository, JpaSpecificationExecutor<User> {

}

interface SpecialUserRepository {
    List<User> findAllUsers();
}

class UserRepositoryImpl implements SpecialUserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findAllUsers() {
        return jdbcTemplate
                .query("select * from user", (resultSet, i) -> null);
    }
}