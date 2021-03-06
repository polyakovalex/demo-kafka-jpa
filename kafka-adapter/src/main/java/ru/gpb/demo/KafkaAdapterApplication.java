package ru.gpb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class KafkaAdapterApplication {


  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(KafkaAdapterApplication.class, args);
/*
    String[] profiles = context.getEnvironment().getActiveProfiles();
    System.out.println("Active Profiles: "+ Arrays.toString(profiles));

    //SpringApplication.run(KafkaAdapterApplication.class, args);

    MyBean myBean = context.getBean(MyBean.class);
    myBean.doSomething();*/
  }
}


