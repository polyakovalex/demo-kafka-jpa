package ru.gpb.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "email")
public class EmailEntity {

  private float id;
  private String email;
  private String bodyTest;

  public EmailEntity() {
  }

  public EmailEntity(float id, String email, String bodyTest) {
    this.id = id;
    this.email = email;
    this.bodyTest = bodyTest;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public float getId() {
    return id;
  }

  public void setId(float id) {
    this.id = id;
  }

  @Column(name = "email", nullable = false)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Column(name = "body_test", nullable = true)
  public String getBodyTest() {
    return bodyTest;
  }

  public void setBodyTest(String bodyTest) {
    this.bodyTest = bodyTest;
  }
}