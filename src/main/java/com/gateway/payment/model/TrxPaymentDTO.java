package com.gateway.payment.model;

import lombok.Data;

@Data
public class TrxPaymentDTO {

    private String id;

    private String merchantOrderId;

    private Payment payment;

    private String status;

}
