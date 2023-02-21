package com.helloWorld.helloWorld.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloWorld")
    public ResponseEntity<String> getHelloWorld(){
        return ResponseEntity.ok("hello world");
    }

    @GetMapping("/message/{message}")
    public ResponseEntity<String> getMessage(@PathVariable String message){
        return ResponseEntity.ok(message);
    }
}
