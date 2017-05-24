/**
 * © Rafisa Informatik.
 * Alle Rechte Vorbehalten
 */
package javaintroduction.calculation;

/**
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Test {

    /**
     * 
     */
    public static void testCalculatePi() {

        int tropfenzahl = 10000000;
        double pi = CalculatePi.approximiere_pi(tropfenzahl);
        System.out.println(pi);
    }

}
