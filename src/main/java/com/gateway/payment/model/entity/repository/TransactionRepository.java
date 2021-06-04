package com.gateway.payment.model.entity.repository;

import com.gateway.payment.model.entity.TrxPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TransactionRepository extends JpaRepository<TrxPayment,UUID> {

}
