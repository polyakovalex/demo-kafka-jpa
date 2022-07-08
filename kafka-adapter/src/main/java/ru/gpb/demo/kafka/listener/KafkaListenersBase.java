package ru.gpb.demo.kafka.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListenersBase {
  Logger LOG = LoggerFactory.getLogger(KafkaListenersBase.class);
 /*
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
*/
  //Метод сам читает данные из очрееди когда они там появятся
  @KafkaListener(
      topics = "${spring.kafka.consumer.in}",
      groupId = "${spring.kafka.consumer.group-id}")
  public void commonListenerForInTopics(String message) {
    LOG.info("MultipleInTopicListener - {}", message);
  }

/*  @KafkaListener(topics = "${spring.kafka.consumer.in}")
  @SendTo("reflectoring-1")
  String listenAndReply(String message) {
    LOG.info("ListenAndReply [{}]", message);
    return "This is a reply sent after receiving message";
  }*/

}
