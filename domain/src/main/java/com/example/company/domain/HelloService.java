package com.example.company.domain;

import com.example.company.domain.port.HelloApi;
import com.example.company.domain.port.HelloSpi;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class HelloService implements HelloApi {

    private final HelloSpi helloSpi;

    @Override
    public Flux<String> helloWorld() {
        return helloSpi.helloWorld();
    }

    @Override
    public Mono<String> helloWorld(String message) {
        return helloSpi.helloWorld(message);
    }
}
