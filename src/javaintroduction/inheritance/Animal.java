/**
 * © Rafisa Informatik.
 * Alle Rechte Vorbehalten
 */
package javaintroduction.inheritance;

/**
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Animal extends LifeForm {

    String color = "gray";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println("walking");
    }

}
