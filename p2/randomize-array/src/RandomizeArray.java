/**
 * RandomizeArray
 *
 * @author AlexandrAnatoliev
 * @version 0.1.2 2025-07-17
 */
public class RandomizeArray {
  public static void main(String[] args) {

    String[] array = new String[args.length];
    if (args.length > 0) {
      System.out.println("yes");
      for(int i = 0; i < args.length; i++) {
        array[i] = args[i];
      }
    }
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
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
