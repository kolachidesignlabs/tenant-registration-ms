package com.kolachidesignlabs.tenant.registration.service.impl;

import com.kolachidesignlabs.tenant.registration.service.RabbitMqProducerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class RabbitMqProducerServiceImpl implements RabbitMqProducerService {

    private final AmqpTemplate rabbitTemplate;

    @Override
    public void send(Object message, String exchange, String routingkey) {
        rabbitTemplate.convertAndSend(exchange, routingkey, message);
        log.info("Send msg = " + message);

    }
}
