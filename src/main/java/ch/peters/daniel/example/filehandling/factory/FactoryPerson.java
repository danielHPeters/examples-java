package ch.peters.daniel.example.filehandling.factory;

import ch.peters.daniel.example.filehandling.model.Person;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Person factory class.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class FactoryPerson implements Factory<Person> {
  @Override
  public Person findOneByName(Stream<String> stringStream, String name) {
    return stringStream
      .map(line -> {
        var attributes = line.split(";");

        return new Person(attributes[0], attributes[1], LocalDate.parse(attributes[2]));
      })
      .filter(p -> p.getLastName().equals(name))
      .collect(Collectors.toList())
      .get(0);
  }
}
