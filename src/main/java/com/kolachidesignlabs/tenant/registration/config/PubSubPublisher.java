package com.kolachidesignlabs.tenant.registration.config;

import com.google.cloud.spring.pubsub.core.PubSubTemplate;
import com.google.pubsub.v1.PubsubMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;

@Slf4j
@RequiredArgsConstructor
public abstract class PubSubPublisher {

    private final PubSubTemplate pubSubTemplate;

    protected abstract String topic();

    public void publish(PubsubMessage pubsubMessage) throws ExecutionException, InterruptedException {
        log.info("Publishing to the topic [{}], message [{}]", topic(), pubsubMessage);
        pubSubTemplate.publish(topic(), pubsubMessage).get();
    }
}
