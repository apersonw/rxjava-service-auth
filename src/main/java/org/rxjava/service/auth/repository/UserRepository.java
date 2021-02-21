package org.rxjava.service.auth.repository;

import org.rxjava.service.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public interface UserRepository extends JpaRepository<User, String>, SpecialUserRepository, JpaSpecificationExecutor<User> {

}

interface SpecialUserRepository {
    List<User> findAllUsers();
}

class UserRepositoryImpl implements SpecialUserRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> findAllUsers() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> query = criteriaBuilder.createQuery(User.class);
        Root<User> userRoot = query.from(User.class);
        query.where(criteriaBuilder.equal(userRoot.get("isAdmin"), true));
        return entityManager.createQuery(query).getResultList();
    }
}