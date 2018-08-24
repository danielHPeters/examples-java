import ch.peters.daniel.example.App
import spock.lang.Specification

/**
 * App class unit test.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
class AppTest extends Specification {
  def "application has a greeting"() {
    given:
    def app = new App()

    when:
    def greeting = app.greeting

    then:
    greeting == 'Hello world.'
  }
}
