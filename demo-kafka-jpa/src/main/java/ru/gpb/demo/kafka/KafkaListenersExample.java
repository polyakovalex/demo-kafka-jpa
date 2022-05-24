package ru.gpb.demo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListenersExample {
  Logger LOG = LoggerFactory.getLogger(KafkaListenersExample.class);

  @KafkaListener(topics = "reflectoring-1")
  void listener(String data) {
    LOG.info(data);
  }

  @KafkaListener(
      topics = "reflectoring-1, reflectoring-2",
      groupId = "reflectoring-group-2")
  void commonListenerForMultipleTopics(String message) {
    LOG.info("MultipleTopicListener - {}", message);
  }

  @KafkaListener(
      topics = "${spring.kafka.consumer.in}",
      groupId = "${spring.kafka.consumer.group-id}")
  public void commonListenerForInTopics(String message) {
    LOG.info("MultipleInTopicListener - {}", message);
  }

}
