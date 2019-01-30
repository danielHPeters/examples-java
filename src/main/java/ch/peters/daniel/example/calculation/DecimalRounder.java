package ch.peters.daniel.example.calculation;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Class DecimalRounder.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public abstract class DecimalRounder {
  public static double round(double value, int digits) {
    if (digits < 0) throw new IllegalArgumentException();

    var decimal = new BigDecimal(value);
    decimal = decimal.setScale(digits, RoundingMode.HALF_UP);
    return decimal.doubleValue();
  }
}
