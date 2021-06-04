package com.gateway.payment.model.entity;

import com.gateway.payment.model.TrxPaymentDTO;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
public class TrxPayment extends BasicEntity {

    @NotNull(message = "Merchant order id value cannot be null.")
    @Column(length = 10, nullable = false)
    private String merchantOrderId;

    @NotNull(message = "Type value cannot be null.")
    private String type;

    @NotNull(message = "Amount value cannot be null.")
    private Double amount;

    @NotNull(message = "Installments value cannot be null.")
    private Integer installments;

    @NotNull(message = "Soft descriptor value cannot be null.")
    private String softDescriptor;

    @NotNull(message = "Card number value cannot be null.")
    private String cardNumber;

    @NotNull(message = "Holder value cannot be null.")
    private String holder;

    @NotNull(message = "Expiration date value cannot be null.")
    //@FutureOrPresent(message = "Expiration date cannot be less than now")
    private String expirationDate;

    @NotNull(message = "Security code value cannot be null.")
    @Size(min = 3, max = 3, message = "Security code must be equal size 3.")
    @Column(length = 3)
    private String securityCode;

    @NotNull(message = "Brand cannot be null.")
    private String brand;

    public TrxPayment(){}

    public TrxPayment(TrxPaymentDTO trxPaymentDTO){
        this.merchantOrderId = trxPaymentDTO.getMerchantOrderId();
        this.type = trxPaymentDTO.getPayment().getType();
        this.amount = trxPaymentDTO.getPayment().getAmount();
        this.installments = trxPaymentDTO.getPayment().getInstallments();
        this.softDescriptor = trxPaymentDTO.getPayment().getSoftDescriptor();
        this.cardNumber = trxPaymentDTO.getPayment().getCreditCard().getCardNumber();
        this.holder = trxPaymentDTO.getPayment().getCreditCard().getHolder();
        this.expirationDate = trxPaymentDTO.getPayment().getCreditCard().getExpirationDate();
        this.securityCode = trxPaymentDTO.getPayment().getCreditCard().getSecurityCode();
        this.brand = trxPaymentDTO.getPayment().getCreditCard().getBrand();
    }
}
