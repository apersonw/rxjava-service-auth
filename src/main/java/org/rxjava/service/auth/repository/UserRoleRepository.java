package org.rxjava.service.auth.repository;

import org.bson.types.ObjectId;
import org.rxjava.service.auth.entity.UserRole;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRoleRepository extends MongoRepository<UserRole, ObjectId> {

}
