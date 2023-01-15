package com.kolachidesignlabs.tenant.registration.config;

import com.google.cloud.spring.pubsub.core.PubSubTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Publisher extends PubSubPublisher {

    @Value("${pubsub.topic}")
    private String topic;

    public Publisher(PubSubTemplate pubSubTemplate) {
        super(pubSubTemplate);
    }

    @Override
    protected String topic() {
        return this.topic;
    }
}