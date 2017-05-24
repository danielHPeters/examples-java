/**
 * © Rafisa Informatik.
 * Alle Rechte Vorbehalten
 */
package javaintroduction.console;

import java.util.Scanner;

/**
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Messages {

    /**
     * 
     */
    private String message = "Hello!";

    /**
     *
     * @return
     */
    public String getMessage() {
        String myMessage = message;
        return myMessage;
    }

    public void setMessage(String myMessage) {
        message = myMessage;
    }

    /**
     *
     * @return
     */
    public String setAndGetMessage() {
        String myMessage = scanInputString();
        setMessage(myMessage);
        myMessage = getMessage();

        return myMessage;
    }

    /**
     *
     * @return
     */
    public String scanInputString() {
        Scanner sc = new Scanner(System.in);
        String myMessage = sc.next();

        return myMessage;
    }

    /**
     *
     * @param guest String containing a questname
     */
    public void greetings(String guest) {
        String myMessage = "Hello " + guest + "!";
        printMessage(myMessage);
    }

    /**
     *
     * @param guest String containing a guestname
     */
    public void goodbye(String guest) {
        String myMessage = "Bye " + guest + "!";
        printMessage(myMessage);
    }

    /**
     *
     * @param myMessage String message to be printed to Terminal
     */
    public void printMessage(String myMessage) {
        System.out.println(myMessage);
    }

    /**
     *
     * @param persons Array with all guests
     */
    public void massPrintMessages(String[] persons) {
        for (String guest : persons) {
            greetings(guest);
            goodbye(guest);
        }
    }
}
