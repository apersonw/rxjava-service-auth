package org.rxjava.service.auth.config;

import lombok.RequiredArgsConstructor;
import org.rxjava.service.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class InitCommandLineRunner implements CommandLineRunner {

    private final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("初始化：InitCommandLineRunner");
        //userRepository.save(new User()).getId();
    }
}
