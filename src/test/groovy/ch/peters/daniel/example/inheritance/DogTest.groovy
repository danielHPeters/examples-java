package ch.peters.daniel.example.inheritance

import spock.lang.Specification

class DogTest extends Specification {
  def 'constructor should set correct attributes'() {
    given:
    def legs = 4
    def name = 'Dusty'
    def color = 'Orange'
    def looks = 'Clean'

    when:
    def dog = new Dog(legs, name, color, looks)

    then:
    dog.legsCount == legs
    dog.name == name
    dog.color == color
    dog.looks == looks
  }

  def 'should bark'() {
    given:
    def legs = 4
    def name = 'Dusty'
    def color = 'Orange'
    def looks = 'Clean'

    when:
    def dog = new Dog(legs, name, color, looks)

    then:
    dog.greet() == 'Barf barf'
  }
}
