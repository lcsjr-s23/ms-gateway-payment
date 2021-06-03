package com.gateway.payment.controller;

import com.gateway.payment.model.PaymentDTO;
import com.gateway.payment.service.impl.PaymentServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(path = "/payment")
@AllArgsConstructor
public class PaymentController {

    private final PaymentServiceImpl service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PaymentDTO> create(@Validated @RequestBody PaymentDTO paymentDTO){
        return ResponseEntity.ok(service.send(paymentDTO));
    }

    @GetMapping
    public String get(){
        return "hello";
    }
}
