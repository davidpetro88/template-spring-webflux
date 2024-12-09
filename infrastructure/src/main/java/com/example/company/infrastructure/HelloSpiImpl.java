package com.example.company.infrastructure;

import com.example.company.domain.port.HelloSpi;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HelloSpiImpl implements HelloSpi {

    @Override
    public Flux<String> helloWorld() {
        return Flux.just("Hello", "World");
    }

    @Override
    public Mono<String> helloWorld(String message) {
        return Mono.just(message);
    }
}
