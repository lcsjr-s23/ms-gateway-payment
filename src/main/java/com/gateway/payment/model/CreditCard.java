package com.gateway.payment.model;

import lombok.Data;

@Data
public class CreditCard {

    private String CardNumber;
    private String Holder;
    private String ExpirationDate;
    private String SecurityCode;
    private String Brand;
}
