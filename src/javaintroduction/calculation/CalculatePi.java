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
public class CalculatePi {

    public static double approximiere_pi(int tropfenzahl) {
        double pi = 0;
        int inner = 0;
        int sum = tropfenzahl;

        while (sum > 0) { // generate drops
            double dotX = Math.random();
            double dotY = Math.random();

            if (dotX * dotX + dotY * dotY <= 1) {
                // Punkt liegt inner des Kreises
                inner++;
            } else {
                // Punkt liegt außerhalb des Kreises
            }

            sum--;
        }

        pi = 4 * (double) inner / tropfenzahl;
        return pi;
    }

}
