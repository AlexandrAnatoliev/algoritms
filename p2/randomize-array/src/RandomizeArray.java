/**
 * RandomizeArray
 *
 * @author AlexandrAnatoliev
 * @version 0.2.1 2025-07-19
 */
public class RandomizeArray {
  public static void main(String[] args) {

    int[] array = new int[args.length];

    if (args.length > 0) {
      for(int i = 0; i < args.length; i++) {
        array[i] = Integer.parseInt(args[i]);
      }
    }

    for (int i = 0; i < array.length - 1; i++) {
      int randomIndex = getNextNumber(i, i + 1, args.length);
      int temp = array[randomIndex];
      array[randomIndex] = array[i];
      array[i] = temp;
    }

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " " );
    }
    System.out.print("\n");
  }

  /**
   * Method to get next random number
   *
   * @param number Natural number
   * @return Random number
   */
  public static int getNextNumber(int number, int min, int max) { 
    return min + (7 * number + 5) % max - min;
  }

}
