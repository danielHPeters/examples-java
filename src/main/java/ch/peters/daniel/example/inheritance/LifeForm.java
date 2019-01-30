package ch.peters.daniel.example.inheritance;

/**
 * LifeForm base class.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public abstract class LifeForm {
  protected int legsCount;
  protected String name;

  public LifeForm(int legsCount, String name) {
    this.legsCount = legsCount;
    this.name = name;
  }

  public String greet() {
    return "Blub";
  }

  public int getLegsCount() {
    return legsCount;
  }

  public void setLegsCount(int legsCount) {
    this.legsCount = legsCount;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
