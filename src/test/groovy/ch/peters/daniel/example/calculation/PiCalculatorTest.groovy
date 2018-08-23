package ch.peters.daniel.example.calculation

import spock.lang.Specification

class PiCalculatorTest extends Specification {
  def 'approximate pi correcty with 10000000 drops' () {
    given:
    def dropCount = 10000000

    when:
    def pi = PiCalculator.approximatePi(dropCount)

    then:
    pi == 3.1412264d
  }
}
