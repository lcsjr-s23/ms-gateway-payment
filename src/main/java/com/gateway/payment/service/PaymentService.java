package com.gateway.payment.service;

import com.gateway.payment.model.TrxPaymentDTO;

public interface PaymentService {
    TrxPaymentDTO send(TrxPaymentDTO paymentDTO);
}
