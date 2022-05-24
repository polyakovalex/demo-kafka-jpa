package ru.gpb.demo.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaSenderSync {

  private KafkaTemplate<String, String> kafkaTemplate;

  @Autowired
  KafkaSenderSync(KafkaTemplate<String, String> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  public void sendMessage(String message, String topicName) {
    kafkaTemplate.send(topicName, message);
  }
}
