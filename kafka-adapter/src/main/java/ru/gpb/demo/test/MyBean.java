package ru.gpb.demo.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

  @Value("${refresh.rate}")
  private int refreshRate;

  @Value("${refresh.ratet}")
  private int refreshRatet;

  public void doSomething() {
    System.out.printf("Refresh Rate : %s%n", refreshRate);
    System.out.printf("Refresh Ratet : %s%n", refreshRatet);
  }
}
