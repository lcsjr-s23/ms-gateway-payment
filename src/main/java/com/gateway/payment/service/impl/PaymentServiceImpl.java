package com.gateway.payment.service.impl;

import com.gateway.payment.model.TrxPaymentDTO;
import com.gateway.payment.model.entity.TrxPayment;
import com.gateway.payment.model.entity.repository.TransactionRepository;
import com.gateway.payment.service.PaymentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@Service
@AllArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final TransactionRepository repository;

    @Override
    public TrxPaymentDTO send(TrxPaymentDTO trxPaymentDTO) {

        var transaction = save(trxPaymentDTO);

        /*
        / TODO: post to rabbitmq
         */
        return trxPaymentDTO;
    }
    @Transactional
    TrxPayment save(TrxPaymentDTO trxPaymentDTO){
        return repository.save(new TrxPayment(trxPaymentDTO));
    }

}
