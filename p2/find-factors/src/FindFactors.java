/**
 * Raise to power
 *
 * @author AlexandrAnatoliev
 * @version 0.2.1 2025-07-25
 */
import java.util.ArrayList;

public class FindFactors {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);

    System.out.print("\n" + num + " = ");

    ArrayList<Integer> factors = new ArrayList<Integer>();
    int fact = 2;
    while(fact <= num) {
      fact = getNextFactor(fact, num);
      factors.add(fact);
      num /= fact;
    }
    System.out.print(factors.get(0));
    for(int i = 1; i < factors.size(); i++) {
      System.out.print(" * " + factors.get(i));
    }
    System.out.print("\n");
  }

  /**
   * Method to get next minimal factor of number
   *
   * @param start First number to search
   * @param number Natural number
   * @return factor
   */
  public static int getNextFactor(int start, int number) { 
    for(int factor = start; factor < number; factor++) {
      if(number % factor == 0) {
        return factor;
      }
    }
    return number;
  }

  /**
   * Method to get even powers of number array
   *
   * @param number Natural number A
   * @param power Natural number B
   * @return long[] {A, A^2, A^4, A^8 ... A^B}
   */
  public static long[] getEvenPowArray(long number, long power) { 
    long[] array = new long[64];
    array[0] = number;
    int even = 2;
    for(int i = 1; even <= power; even *= 2) {
      array[i] = array[i - 1] * array[i - 1];
      i++;
    } 
    return array;
  }
}
