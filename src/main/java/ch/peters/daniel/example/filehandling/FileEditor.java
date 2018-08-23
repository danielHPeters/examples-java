package ch.peters.daniel.example.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.1
 */
public class FileEditor {
  public void findPerson() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Wen suchst Du?\n");
    String person = sc.next();
    readFile(person);
  }

  public void readFile(String person) {
    var filename = "test.txt";

    try (var br = new BufferedReader(new FileReader(filename))) {

      int maxItems = attribDesc.length;
      int thisYear = Calendar.getInstance().get(Calendar.YEAR);
      var lines = br.lines();
      lines.map(line -> {
        var attributes = line.split(";");
        return new Person(attributes())
      });

      while ((line = br.readLine()) != null) {
        String[] attribs = line.split(";");
        String firstName = attribs[1];
        if (person.equals(firstName)) {
          for (int i = 0; i < maxItems; i++) {
            out(attribDesc[i] + attribs[i]);
          }

          /**
           * Da das Alter immer an letzter Stelle sein soll, können
           * wir das Alter immer mit maxItems - 1 Selektieren. - 1, da
           * der Index von 0 anfängt.
           */
          int age = thisYear - Integer.parseInt(attribs[maxItems - 1]);
          out("Alter: " + age + "\n");
        }
      }
    } catch (IOException e) {
      out("Fehler beim Einlesen der Datei.");
    }
  }

  public void out(String msg) {
    System.out.println(msg);
  }
}
