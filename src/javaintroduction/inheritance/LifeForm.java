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
public class LifeForm {

    /**
     *
     */
    private int legsCount = 0;

    /**
     *
     * @return
     */
    public int getLegsCount() {
        return legsCount;
    }

    /**
     *
     * @param legsCount
     */
    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }

    /**
     *
     */
    public void makeSound() {
        System.out.println("Urschrei");
    }

}
