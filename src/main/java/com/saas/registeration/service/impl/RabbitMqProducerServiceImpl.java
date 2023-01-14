package com.saas.registeration.service.impl;

import com.saas.registeration.service.RabbitMqProducerService;
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
