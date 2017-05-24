/**
 * © Rafisa Informatik.
 * Alle Rechte Vorbehalten
 */
package javaintroduction.console;

/**
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class MessagingTest {

    /**
     * 
     */
    public static void testMessages() {

        Messages msg = new Messages();

        String myMessage;

        myMessage = msg.getMessage();
        msg.printMessage(myMessage);

        myMessage = msg.setAndGetMessage();
        msg.printMessage(myMessage);

        String[] persons = {"Daniel", "George", "Alex", "Tom"};
        msg.massPrintMessages(persons);
    }
}
