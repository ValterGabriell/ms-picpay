package msjava.processing.transferencia.infra.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "user-account", groupId = "group-user")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }

}