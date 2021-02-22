package org.rxjava.service.auth.config;

import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author happy
 */
@Slf4j
@Component
public class SpringSecurityAuditorAware implements AuditorAware<ObjectId> {

    @NotNull
    @Override
    public Optional<ObjectId> getCurrentAuditor() {

        ObjectId userId = new ObjectId("5349b4ddd2781d08c09890f3");
        //if (userId != null){
        return Optional.of(userId);
        //} else {
        //    return Optional.empty();
        //}
    }
}
