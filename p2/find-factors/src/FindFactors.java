import static java.lang.Math.*;
import java.util.ArrayList;

/**
 * Find Factors
 *
 * @author AlexandrAnatoliev
 * @version 0.2.4 2025-07-25
 */
public class FindFactors {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);

    System.out.print("\n" + num + " = ");

    ArrayList<Integer> factors = new ArrayList<Integer>();
    int fact = 2;
    while (fact <= num) {
      fact = getNextFactor(fact, num);
      factors.add(fact);
      num /= fact;
    }
    System.out.print(factors.get(0));
    for (int i = 1; i < factors.size(); i++) {
      System.out.print(" * " + factors.get(i));
    }
    System.out.print("\n");
  }

  /**
   * Method to get next minimal factor of number
   *
   * @param start  First number to search
   * @param number Natural number
   * @return factor
   */
  public static int getNextFactor(int start, int number) {
    if (number % 2 == 0) {
      return 2;
    }

    if (start % 2 == 0) {
      start++;
    }

    int max = (int) sqrt(number);

    for (int factor = start; factor < max; factor += 2) {
      if (number % factor == 0) {
        return factor;
      }
    }
    return number;
  }
}
