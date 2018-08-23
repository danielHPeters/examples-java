package ch.peters.daniel.example.inheritance;

/**
 * Dog model class.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Dog extends Animal {
  private String looks;

  public Dog(int legsCount, String name, String color, String looks) {
    super(legsCount, name, color);
    this.looks = looks;
  }

  public String getLooks() {
    return looks;
  }

  public void setLooks(String looks) {
    this.looks = looks;
  }

  @Override
  public String greet() {
    return "Barf barf";
  }
}
