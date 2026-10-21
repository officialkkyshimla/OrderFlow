package com.orderflow.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class orderFlowcontroller {
    @GetMapping
    public String test() {
        return "hello world";
    }

    @PostMapping("/order")
    public ResponseEntity<String> SaveOrder() {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Order accepted");
    }

    @PostMapping("/sell")
    public ResponseEntity<String> SellOrder(){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Sell done");
    }
}
