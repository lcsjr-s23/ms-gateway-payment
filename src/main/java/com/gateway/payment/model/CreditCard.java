package com.gateway.payment.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCard {

    private String cardNumber;

    private String holder;

    private String expirationDate;

    private String securityCode;

    private String brand;

}
