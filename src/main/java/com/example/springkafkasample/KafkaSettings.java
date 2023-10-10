package com.example.springkafkasample;

import com.sun.jdi.event.StepEvent;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "kafka")
@Data
public class KafkaSettings {
    private String bootstrapServers;
    private String groupId;
    private String topic;
}
