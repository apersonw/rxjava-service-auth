package org.rxjava.service.auth.repository;

import org.bson.types.ObjectId;
import org.rxjava.service.auth.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId>, SpecialUserRepository {

}

interface SpecialUserRepository {
    List<User> findAllUsers();
}

class UserRepositoryImpl implements SpecialUserRepository {

    @Override
    public List<User> findAllUsers() {
        return new ArrayList<>();
    }
}