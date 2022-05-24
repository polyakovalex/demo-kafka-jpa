package ru.gpb.demomqmybatys.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import ru.gpb.demomqmybatys.model.Client;

@Component
public class Sender {

  private JmsTemplate jmsTemplate;
  private String destinationName;

  @Autowired
  public Sender(
      @Value("${ibm.mq.out}") String destinationName,
      JmsTemplate jmsTemplate
      ) {
    this.jmsTemplate = jmsTemplate;
    this.destinationName = destinationName;
  }

  public void send(Client client) {
    jmsTemplate.convertAndSend(destinationName, client);
    System.out.println("Successfully sent a message.");
  }

}



