package com.gateway.payment.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrxPaymentDTO {

    private String merchantOrderId;

    private Payment payment;

}
