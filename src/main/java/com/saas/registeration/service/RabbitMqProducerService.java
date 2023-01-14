package com.saas.registeration.service;

public interface RabbitMqProducerService {
    void send(Object message, String exchange, String routingkey);
}
