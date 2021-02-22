package org.rxjava.service.auth.repository;

import org.bson.types.ObjectId;
import org.rxjava.service.auth.entity.RoleMenu;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleMenuRepository extends MongoRepository<RoleMenu, ObjectId> {

}
