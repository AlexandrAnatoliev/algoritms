import static java.lang.Math.*;

/**
 * Find Primes
 *
 * @author AlexandrAnatoliev
 * @version 0.1.0 2025-07-26
 */
public class FindPrimes {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    boolean[] isComposite = getCompositeArr(num);
    System.out.println(isComposite[num]);

  }

  /**
   * Method to get composite array
   * if isComposite[num] = false, then num is prime
   *
   * @param number Natural number
   * @return boolean[] isComposite
   */
  public static boolean[] getCompositeArr(int number) {
    boolean[] isComposite = new boolean[number + 1];

    for (int i = 4; i < isComposite.length; i += 2) {
      isComposite[i] = true;
    }

    int nextPrime = 3;
    int max = (int) sqrt(isComposite.length);

    while (nextPrime <= max) {
      for (int i = nextPrime * 2; i < max; i += nextPrime) {
        isComposite[i] = true;
      }

      nextPrime += 2;
      while (nextPrime <= max && isComposite[nextPrime]) {
        nextPrime += 2;
      }
    }
    return isComposite;
  }
}
