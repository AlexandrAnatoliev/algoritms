/**
 * RandomizeArray
 *
 * @author AlexandrAnatoliev
 * @version 0.1.0 2025-07-17
 */
public class RandomizeArray {
  public static void main(String[] args) {

    int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int lenght = 10;
    for (int i = 0; i < lenght; i++) {
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
