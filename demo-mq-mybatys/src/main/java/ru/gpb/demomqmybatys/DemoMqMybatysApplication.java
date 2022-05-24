package ru.gpb.demomqmybatys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMqMybatysApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoMqMybatysApplication.class, args);

        /*Пример отправки сообщения в очередь при старте*/
       /* ConfigurableApplicationContext context = SpringApplication.run(DemoMqMybatysApplication.class, args);
        JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);

        // Send a message with a POJO - the template reuse the message converter
        System.out.println("Sending an email message.");
        jmsTemplate.convertAndSend("IN", new Email("info@example.com", "Hello"));*/
    }

}
