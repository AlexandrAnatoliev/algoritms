/**
 * Randomizer
 *
 * @author AlexandrAnatoliev
 * @version 0.1.0 2025-07-17
 */
public class Randomizer {
  public static void main(String[] args) {
    int seed = (args.length > 0) ? (Integer.parseInt(args[0])) : (6);

    int answer = getNextNumber(seed);
    System.out.println(answer);
  }

  /**
   * Method to get next random number
   *
   * @param number Natural number
   * @return Random number
   */
  public static int getNextNumber(int number) { 
    return (7 * number + 5) % 11;
  }

}
