package com.kafka.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	
	private KafkaTemplate<String,String>kafkaTemplate;
	
	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}


	
	public void sendMessage(String message) {
		System.out.println(message);	
		kafkaTemplate.send("pkKafka",message);
	}

}






//
//
//package com.kafka.producer;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//public class KafkaProducer {
//    
//    private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
//
//    private final KafkaTemplate<String, String> kafkaTemplate;
//
//    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    public void sendMessage(String message) {
//        logger.info("Sending message: {}", message);
//        kafkaTemplate.send("pkKafka", message);
//    }
//
//}
//
