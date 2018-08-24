package ch.peters.daniel.example.console

import spock.lang.Specification

/**
 * Testing Console class.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
class ConsoleTest extends Specification {
  def 'test greeting'() {
    given:
    def console = new Console()
    def people = Arrays.asList("Daniel", "George", "Alex", "Tom")

    when:
    def buffer = new ByteArrayOutputStream()
    System.out = new PrintStream(buffer)

    and:
    console.print("Testing greetings and goodbye.")
    people.each { person ->
      console.greetings(person)
      console.goodbye(person)
    }

    then:
    buffer.toString() == "Testing greetings and goodbye.\n" +
      "Hello Daniel!\n" +
      "Bye Daniel!\n" +
      "Hello George!\n" +
      "Bye George!\n" +
      "Hello Alex!\n" +
      "Bye Alex!\n" +
      "Hello Tom!\n" +
      "Bye Tom!\n" +
      ""
  }
}
