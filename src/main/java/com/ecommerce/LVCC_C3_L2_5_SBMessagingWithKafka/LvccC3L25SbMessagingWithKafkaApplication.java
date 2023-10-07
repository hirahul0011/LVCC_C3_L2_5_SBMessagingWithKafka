package com.ecommerce.LVCC_C3_L2_5_SBMessagingWithKafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class LvccC3L25SbMessagingWithKafkaApplication {
	
	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


	public static void main(String[] args) {
		SpringApplication.run(LvccC3L25SbMessagingWithKafkaApplication.class, args);
	}
	
	@KafkaListener(topics = "ecommerce", groupId = "group-id")
    public void listen(String message) {
       System.out.println("Received Message in group - group-id: " + message);
    }


}
