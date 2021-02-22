package org.rxjava.service.auth.repository;

import org.bson.types.ObjectId;
import org.rxjava.service.auth.entity.Dict;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author happy
 */
@Repository
public interface DictRepository extends MongoRepository<Dict, ObjectId> {
}
