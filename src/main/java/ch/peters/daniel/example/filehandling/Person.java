package ch.peters.daniel.example.filehandling;

import java.time.LocalDate;

/**
 * Person class.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Person {
  private String lastName;
  private String firstName;
  private LocalDate birthDate;

  public Person(String firstName, String lastName, LocalDate birthDate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
  }
}
