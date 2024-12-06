package com.example.webflux.contract.v1.hello;

import com.example.webflux.domain.port.HelloApi;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/v1/hello")
@RestController
@AllArgsConstructor
public class HelloController {

    private final HelloApi helloApi;

    @Operation(summary = "Hello World", description = "Hello World")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Hello World"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error"),
            @ApiResponse(responseCode = "404", description = "Not Found"),
            @ApiResponse(responseCode = "400", description = "Bad Request")
    })
    @GetMapping("")
    public Flux<String> helloWorld() {
        return helloApi.helloWorld();
    }

    @Operation(summary = "Hello World", description = "Hello World")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Hello World"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error"),
            @ApiResponse(responseCode = "404", description = "Not Found"),
            @ApiResponse(responseCode = "400", description = "Bad Request")
    })
    @PostMapping("message")
    public Mono<String> helloWorld(String message) {
        return helloApi.helloWorld(message);
    }

}