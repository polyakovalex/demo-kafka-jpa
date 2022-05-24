package ru.gpb.demo;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.gpb.demo.entity.EmailEntity;
import ru.gpb.demo.kafka.KafkaSenderSync;
import ru.gpb.demo.model.Client;
import ru.gpb.demo.repository.EmailRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoKafkaJpaApplicationTests {

  @Autowired
  EmailRepository emailRepository;

  @Autowired
  KafkaSenderSync kafkaSenderSync;

/*  @Autowired
  KafkaListenersExample kafkaListenersExample;*/

  @Test
  void getTableTest() {
    List<EmailEntity> emailEntities = emailRepository.findAll();
    System.out.println("TEST");
  }

  @Test
  void sendKafkaSync(){
    Client client = new Client(0.0, "Vasya", "Pupkin");
    kafkaSenderSync.sendMessage("werfwef", "IN");
    System.out.println("Send");
  }

/*
  @Test
  void listenerKafkaS(){
    kafkaListenersExample.commonListenerForInTopics("Test");
    System.out.println("Send");
  }
*/

}
