package ch.peters.daniel.example.calculation

import spock.lang.Specification

/**
 * PiCalculator unit test.
 *
 * @author Daniel Peters
 * @version 1.0
 */
class PiCalculatorTest extends Specification {
  def 'approximate pi correctly with 10000000 drops'() {
    given:
    def dropCount = 10000000

    when:
    def pi = PiCalculator.approximatePi(dropCount)

    then:
    DecimalRounder.round(pi, 2) == 3.14d
  }
}
