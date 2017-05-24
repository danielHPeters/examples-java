/**
 * © Rafisa Informatik.
 * Alle Rechte Vorbehalten
 */
package main;

import javaintroduction.console.MessagingTest;
import javaintroduction.filehandling.FileHandlingTest;
import javaintroduction.gui.DialogBoxes;
import javaintroduction.inheritance.InheritanceTest;

/**
 *
 * @author d.peters
 */
public class Main {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MessagingTest.testMessages();
        FileHandlingTest.testFileEditor();
        InheritanceTest.testInheritance();
        DialogBoxes.dialogBoxes();
    }
}
