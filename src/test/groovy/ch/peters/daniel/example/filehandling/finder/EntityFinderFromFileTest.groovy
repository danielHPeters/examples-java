package ch.peters.daniel.example.filehandling.finder

import ch.peters.daniel.example.filehandling.factory.FactoryPerson
import ch.peters.daniel.example.filehandling.model.Person
import spock.lang.Specification

/**
 * EntityFinderFromFile unit test.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
class EntityFinderFromFileTest extends Specification {
  def 'load a person from a text file'() {
    given:
    def factory = new FactoryPerson()
    def finder = new EntityFinderFromFile<Person>(factory, 'people.txt')
    def lastName = 'Peters'
    def year = 1992

    when:
    def person = finder.findByName(lastName)

    then:
    person.birthDate.getYear() == year
    person.lastName == lastName
  }
}
