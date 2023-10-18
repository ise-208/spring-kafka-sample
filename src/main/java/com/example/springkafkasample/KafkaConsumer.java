package com.example.springkafkasample;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "${kafka.topic")
    public void consume(ConsumerRecord<String, String> record){
        System.out.println(record.key());
    }
}
