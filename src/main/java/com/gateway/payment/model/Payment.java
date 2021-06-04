package com.gateway.payment.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {

    private String type;

    private Double amount;

    private Integer installments;

    private String softDescriptor;

    private CreditCard creditCard;

}