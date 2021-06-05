package com.gateway.payment.service.impl;

import com.gateway.payment.route.RabbitMqProducer;
import com.gateway.payment.model.TrxPaymentDTO;
import com.gateway.payment.model.entity.TrxPayment;
import com.gateway.payment.model.entity.repository.TransactionRepository;
import com.gateway.payment.service.PaymentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@Service
@AllArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final TransactionRepository repository;
    private final RabbitMqProducer rabbitMqProducer;

    @Override
    public TrxPaymentDTO send(TrxPaymentDTO trxPaymentDTO) {
        var transaction = save(trxPaymentDTO);
        rabbitMqProducer.send(trxPaymentDTO);
        trxPaymentDTO.setId(transaction.getId().toString());
        trxPaymentDTO.setStatus(transaction.getStatus().name());
        return trxPaymentDTO;
    }

    @Transactional
    TrxPayment save(TrxPaymentDTO trxPaymentDTO){
        return repository.save(new TrxPayment(trxPaymentDTO));
    }

}
