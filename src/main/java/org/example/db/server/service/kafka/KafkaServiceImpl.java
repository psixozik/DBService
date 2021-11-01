package org.example.db.server.service.kafka;

import lombok.extern.slf4j.Slf4j;
import org.example.db.server.model.RegModelDTO;
import org.example.db.server.service.dblayer.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaServiceImpl {

    private final RegistrationService registrationService;

    @Autowired
    public KafkaServiceImpl(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @KafkaListener(
            topics = "${kafka.topic}",
            containerFactory = "registerKafkaListenerContainerFactory"
    )
    public void listenBrokerRegister(RegModelDTO message) {
        log.error("IN");
        registrationService.registerUser(message);
        log.error("OUT");
    }
}
