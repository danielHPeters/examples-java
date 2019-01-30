package ch.peters.daniel.example.console;

/**
 * Console messaging class.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Console {
  private String message;

  public void greetings(String guest) {
    print("Hello " + guest + "!");
  }

  public void goodbye(String guest) {
    print("Bye " + guest + "!");
  }

  /**
   * @param myMessage String message to be printed to Terminal
   */
  public void print(String myMessage) {
    System.out.println(myMessage);
  }
}
