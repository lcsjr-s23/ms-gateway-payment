package com.gateway.payment.route;

import com.gateway.payment.model.TrxPaymentDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RabbitMqConsumer implements RabbitListenerConfigurer {

    @Override
    public void configureRabbitListeners(RabbitListenerEndpointRegistrar rabbitListenerEndpointRegistrar) {
    }

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void xMessage(TrxPaymentDTO trxPaymentDTO) {
        //TODO: Send to Cielo
        log.info("Payment being sent for processing: " + trxPaymentDTO);
    }
}
