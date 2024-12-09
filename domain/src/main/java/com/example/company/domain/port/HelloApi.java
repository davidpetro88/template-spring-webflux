package com.example.company.domain.port;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface HelloApi {

    Flux<String> helloWorld();
    Mono<String> helloWorld(String message);
}
