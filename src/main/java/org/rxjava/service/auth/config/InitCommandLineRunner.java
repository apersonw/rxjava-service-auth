package org.rxjava.service.auth.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.rxjava.service.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author happy
 */
@Component
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
@Slf4j
public class InitCommandLineRunner implements CommandLineRunner {

    private final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        log.info("初始化：InitCommandLineRunner");
        //userRepository.save(new User()).getId();
    }
}
