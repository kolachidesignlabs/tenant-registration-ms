package com.kolachidesignlabs.tenant.registration.service;

public interface RabbitMqProducerService {
    void send(Object message, String exchange, String routingkey);
}
