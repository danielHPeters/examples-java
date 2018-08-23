package ch.peters.daniel.example.inheritance;

/**
 * Animal class.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Animal extends LifeForm {
  protected String color;

  public Animal(int legsCount, String name, String color) {
    super(legsCount, name);
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void walk() {
    System.out.println("walking");
  }
}
