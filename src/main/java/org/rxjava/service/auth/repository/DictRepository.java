package org.rxjava.service.auth.repository;

import org.bson.types.ObjectId;
import org.rxjava.service.auth.entity.Dict;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author happy
 */
public interface DictRepository extends MongoRepository<Dict, ObjectId> {
}
