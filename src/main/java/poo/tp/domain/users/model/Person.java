package poo.tp.domain.users.model;

import java.util.UUID;

public class Person {
  private String ID;
  private String firstName;
  private String lastName;
  private String CPF;

  public Person(String ID, String firstName, String lastName, String CPF) {
    this.ID = ID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.CPF = CPF;
  }

  public Person(String firstName, String lastName, String CPF) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.CPF = CPF;

    this.ID = UUID.randomUUID().toString();
  }

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
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

  public String getCPF() {
    return CPF;
  }

  public void setCPF(String CPF) {
    this.CPF = CPF;
  }

  @Override
  public String toString() {
    return "Person{" +
        "ID='" + ID + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", CPF='" + CPF + '\'' +
        '}';
  }
}
