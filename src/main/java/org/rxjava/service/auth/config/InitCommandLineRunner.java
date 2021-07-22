package org.rxjava.service.auth.config;

import org.rxjava.service.auth.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitCommandLineRunner implements CommandLineRunner {

    private final UserRepository userRepository;

    public InitCommandLineRunner(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("初始化：InitCommandLineRunner");
        //userRepository.save(new User()).getId();
    }
}
