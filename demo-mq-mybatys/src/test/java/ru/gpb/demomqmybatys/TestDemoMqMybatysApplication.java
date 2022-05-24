package ru.gpb.demomqmybatys;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import ru.gpb.demomqmybatys.mapper.ClientMapper;
import ru.gpb.demomqmybatys.model.Client;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemoMqMybatysApplication {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private ClientMapper clientMapper;

    @Test
    public void testSend(){
        Client sendMail = new Client(1.0,"testt", "body");
        jmsTemplate.convertAndSend("IN", sendMail);
        System.out.println("Successfully sent a message.");
    }

    @Test
    public void testFindById(){
        Client client = clientMapper.findById(0);
        System.out.println("Successfully get db.");
    }

    @Test
    public void testInsertClient(){
        Client client = new Client(0.0,"Letov", "Egor");
        clientMapper.insertClient(client);
        System.out.println("Successfully get db.");
    }
}
