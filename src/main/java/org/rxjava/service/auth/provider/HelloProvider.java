package org.rxjava.service.auth.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloProvider {
    @GetMapping
    Mono<String> greetings() {
        return Mono.just("Thank you !!");
    }

    @GetMapping("/user")
    Mono<String> greetingsFromUser() {
        return Mono.just("Thank you user !!");
    }

    @GetMapping("/admin")
    Mono<String> greetingsFromAdmin() {
        return Mono.just("Thank you admin !!");
    }
}
