package com.gateway.payment.model;

import lombok.Data;

@Data
public class CreditCard {

    private String cardNumber;

    private String holder;

    private String expirationDate;

    private String securityCode;

    private String brand;

}
