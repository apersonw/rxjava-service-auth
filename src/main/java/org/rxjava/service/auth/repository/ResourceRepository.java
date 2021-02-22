package org.rxjava.service.auth.repository;

import org.bson.types.ObjectId;
import org.rxjava.service.auth.entity.Resource;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResourceRepository extends MongoRepository<Resource, ObjectId> {

}
