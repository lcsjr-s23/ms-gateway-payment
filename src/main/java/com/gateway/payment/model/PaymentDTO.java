package com.gateway.payment.model;

import lombok.Data;

@Data
public class PaymentDTO {

    private String MerchantOrderId;
    Payment PaymentObject;

}
