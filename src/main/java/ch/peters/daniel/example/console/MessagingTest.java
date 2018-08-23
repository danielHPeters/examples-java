package ch.peters.daniel.example.console;

import java.util.Arrays;

/**
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class MessagingTest {
  public static void testMessages() {
    var msg = new Messages("Hi");
    var myMessage = msg.getMessage();
    var people = Arrays.asList("Daniel", "George", "Alex", "Tom");

    msg.printMessage(myMessage);
    msg.setMessage("Bye");
    msg.printMessage(myMessage);
    msg.massGreetAndSayGoodbye(people);
  }
}
