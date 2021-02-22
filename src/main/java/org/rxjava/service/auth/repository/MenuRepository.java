package org.rxjava.service.auth.repository;

import org.bson.types.ObjectId;
import org.rxjava.service.auth.entity.Menu;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MenuRepository extends MongoRepository<Menu, ObjectId> {

}
