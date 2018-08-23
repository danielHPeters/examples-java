package ch.peters.daniel.example.console;

import java.util.List;

/**
 * Console messaging class.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Messages {
  private String message;

  public Messages(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void greetings(String guest) {
    printMessage("Hello" + guest + "!");
  }

  public void goodbye(String guest) {
    printMessage("Bye " + guest + "!");
  }

  /**
   * @param myMessage String message to be printed to Terminal
   */
  public void printMessage(String myMessage) {
    System.out.println(myMessage);
  }

  public void massGreetAndSayGoodbye(List<String> guests) {
    guests.forEach(guest -> {
      greetings(guest);
      goodbye(guest);
    });
  }
}
