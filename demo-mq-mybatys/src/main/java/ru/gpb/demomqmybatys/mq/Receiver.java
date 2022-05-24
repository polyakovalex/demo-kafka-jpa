package ru.gpb.demomqmybatys.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import ru.gpb.demomqmybatys.model.Client;
import ru.gpb.demomqmybatys.mapper.ClientMapper;

@Component
public class Receiver {

  @Autowired
  Sender sender;

  @Autowired
  ClientMapper clientMapper;

  @JmsListener(destination = "${ibm.mq.in}", containerFactory = "myFactory")
  public void receiveMessage(Client client) {
    System.out.println("Received <" + client + ">");
    Client newClient = clientMapper.findById(4);
    sender.send(newClient);
  }


}
