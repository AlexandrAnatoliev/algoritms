/**
 * Raise to power
 *
 * @author AlexandrAnatoliev
 * @version 0.1.1 2025-07-21
 */
public class Pow {
  public static void main(String[] args) {
    long num = Long.parseLong(args[0]);
    long pow = Long.parseLong(args[1]);

    long[] array = getEvenPowArray(num, pow);
    for(int i = 0; i < pow; i++) {
      System.out.print(" " + array[i]);
    }
    System.out.print("\n");
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
