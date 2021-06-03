package com.gateway.payment.service;

import com.gateway.payment.model.PaymentDTO;

public interface PaymentService {
    PaymentDTO send(PaymentDTO paymentDTO);
}
