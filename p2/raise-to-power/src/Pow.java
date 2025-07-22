/**
 * Raise to power
 *
 * @author AlexandrAnatoliev
 * @version 0.3.0 2025-07-21
 */
public class Pow {
  public static void main(String[] args) {
    long num = Long.parseLong(args[0]);
    long pow = Long.parseLong(args[1]);

    long[] array = getEvenPowArray(num, pow);
    long answer = getPow(num, pow, array);
    System.out.println(num+"^"+pow+"="+answer);
  }

  /**
   * Method to get pow of number
   *
   * @param number Natural number A
   * @param power Natural number B
   * @return A^B
   */
  public static long getPow(long number, long power, long[] array) { 
    long answer = 1;
    long mask = 1;
    int indx = 0;
    while(mask <= power) {
      if((power & mask) / mask == 1) {
	answer *= array[indx];
      }
      mask *= 2;
      indx++;
    }
    return answer;
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
