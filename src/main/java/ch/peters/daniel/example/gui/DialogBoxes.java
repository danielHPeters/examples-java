package ch.peters.daniel.example.gui;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Dialog boxes examples.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class DialogBoxes {
  public static void dialogBoxes() {
    int input;
    String stringInput;

    // Aufruf der statischen Methode showConfirmDialog()
    input = JOptionPane.showConfirmDialog(null, "Geben Sie Ihr Einverständnis?", "Einverständnis", JOptionPane.YES_NO_CANCEL_OPTION);
    System.out.println(input);

    // Aufruf der statischen Methode showMessageDialog()
    JOptionPane.showMessageDialog(null, "Sie müssen eine Ganzzahl eingeben", "Eine Nachricht", JOptionPane.WARNING_MESSAGE);

    // Aufruf der statischen Methode showMessageDialog()
    stringInput = JOptionPane.showInputDialog(null, "Geben Sie Ihren Namen ein", "Eine Eingabeaufforderung", JOptionPane.PLAIN_MESSAGE);
    System.out.println(stringInput);

    // Erstellung Array vom Datentyp Object, Hinzufügen der Optionen
    Object[] options = {"OK", "Cancel", "Ja", "Nein", "Egal"};
    input = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl", "Alternativen", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    System.out.println(input);

    // Erstellung Array vom Datentyp Object, Hinzufügen der Komponenten
    JTextField lastName = new JTextField();
    JTextField firstName = new JTextField();

    Object[] message = {"Name", lastName, "Vorname", firstName};

    JOptionPane pane = new JOptionPane(message, JOptionPane.PLAIN_MESSAGE, JOptionPane.OK_CANCEL_OPTION);
    pane.createDialog(null, "Titelmusik").setVisible(true);
    System.out.println("Eingabe: " + lastName.getText() + ", " + firstName.getText());

    System.exit(0);
  }
}
