package com.gateway.payment.model;

import lombok.Data;

@Data
public class Payment {

    private String Type;
    private float Amount;
    private float Installments;
    private String SoftDescriptor;
    CreditCard CreditCardObject;
}