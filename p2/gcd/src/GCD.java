/**
 * RandomizeArray
 *
 * @author AlexandrAnatoliev
 * @version 0.1.0 2025-07-19
 */
public class GCD {
  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    System.out.println(num1 + " " + num2);
  }

  /**
   * Method to get next random number
   *
   * @param number Natural number
   * @return Random number
   */
  public static int getNextNumber(int number, int min, int max) { 
    return (int)(min + (double)((7 * number + 5) % max) / (max) * (max - min));
  }
}
