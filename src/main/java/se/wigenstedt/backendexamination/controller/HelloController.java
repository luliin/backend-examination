package se.wigenstedt.backendexamination.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Julia Wigenstedt
 * Date: 2021-09-16
 * Time: 13:04
 * Project: backend-examination
 * Copyright: MIT
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<String> sayHelloWorld() {
        return ResponseEntity.ok("Hello, World!");
    }
}
