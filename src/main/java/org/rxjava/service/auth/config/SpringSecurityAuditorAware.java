package org.rxjava.service.auth.config;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author happy
 */
@Slf4j
@Component
public class SpringSecurityAuditorAware implements AuditorAware<String> {

    @NotNull
    @Override
    public Optional<String> getCurrentAuditor() {

        String userId = "testUserId";
        //if (userId != null){
        return Optional.of(userId);
        //} else {
        //    return Optional.empty();
        //}
    }
}
