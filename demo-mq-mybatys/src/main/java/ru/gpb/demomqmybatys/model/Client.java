package ru.gpb.demomqmybatys.model;

public class Client {

  private Double id;
  private String firstName;
  private String lastName;

  public Client() {
  }

  public Client(Double id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Double getId() {
    return id;
  }

  public void setId(Double id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return String.format("client {to=%s, body=%s}", getFirstName(), getLastName());
  }
}
