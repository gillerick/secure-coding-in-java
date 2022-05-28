package app;

import utils.ObfuscationUtil;

public class Person {
  private String firstName;
  private String lastName;
  private String email;

  public Person(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  @Override
  public String toString() {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", email='" + ObfuscationUtil.obfuscateData(email) + '\'' +
        '}';
  }
}
