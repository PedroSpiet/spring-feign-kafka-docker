package com.spiet.consumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConsumerSpietTopics {

    @KafkaListener(topics = "${topic.spiet-topics}", groupId = "group_id")
    public void consumer(String message) {
        log.info("Chegou a mensagem: {}", message);
    }
}
