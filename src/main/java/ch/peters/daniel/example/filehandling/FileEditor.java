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
      String line,
        vorname;
      String[] attribs,
        attribDesc = {"Name: ", "Vorname: ", "Geburtsdatum: "};

      int maxItems = attribDesc.length,
        thisYear = Calendar.getInstance().get(Calendar.YEAR),
        age;
      while ((line = br.readLine()) != null) {
        attribs = line.split(";");
        vorname = attribs[1];
        if (person.equals(vorname)) {
          for (int i = 0; i < maxItems; i++) {
            printMsgString(attribDesc[i] + attribs[i]);
          }

          /**
           * Da das Alter immer an letzter Stelle sein soll, können
           * wir das Alter immer mit maxItems - 1 Selektieren. - 1, da
           * der Index von 0 anfängt.
           */
          age = thisYear - Integer.parseInt(attribs[maxItems - 1]);
          printMsgString("Alter: " + age + "\n");
        }
      }
    } catch (IOException e) {
      printMsgString("Fehler beim Einlesen der Datei.");
    }
  }

  public void printMsgString(String msg) {
    System.out.println(msg);
  }

}
