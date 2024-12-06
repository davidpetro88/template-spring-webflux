package com.example.webflux.domain.port;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface HelloSpi {
    Flux<String> helloWorld();
    Mono<String> helloWorld(String message);
}
