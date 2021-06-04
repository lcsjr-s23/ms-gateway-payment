package com.gateway.payment.controller;

import com.gateway.payment.model.TrxPaymentDTO;
import com.gateway.payment.service.impl.PaymentServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping(path = "/payment")
@AllArgsConstructor
public class PaymentController {

    private final PaymentServiceImpl service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TrxPaymentDTO> create(@RequestBody TrxPaymentDTO paymentDTO){
        log.info("Request: " + paymentDTO);
        return ResponseEntity.ok(service.send(paymentDTO));
    }

}
