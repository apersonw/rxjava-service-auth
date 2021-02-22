package org.rxjava.service.auth.repository;

import org.bson.types.ObjectId;
import org.rxjava.service.auth.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;
import java.util.List;

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