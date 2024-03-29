package ch.peters.daniel.example.calculation;

/**
 * Pi calculator.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class PiCalculator {
  public static double approximatePi(int dropCount) {
    int inner = 0;
    int sum = dropCount;

    while (sum > 0) {
      var dotX = Math.random();
      var dotY = Math.random();

      if (dotX * dotX + dotY * dotY <= 1) {
        inner++;
      }

      sum--;
    }

    return 4 * (double) inner / dropCount;
  }
}
