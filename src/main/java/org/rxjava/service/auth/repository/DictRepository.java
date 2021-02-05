package org.rxjava.service.auth.repository;

import org.rxjava.service.auth.entity.Dict;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author happy
 */
public interface DictRepository extends JpaRepository<Dict, String> {

}
