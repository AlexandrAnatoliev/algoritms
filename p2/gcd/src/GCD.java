/**
 * RandomizeArray
 *
 * @author AlexandrAnatoliev
 * @version 0.2.0 2025-07-19
 */
public class GCD {
  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    System.out.println("GCD " + num1 + " and " + num2 + " = " + getGCD(num1, num2));
  }

  /**
   * Method to get great common divisor
   *
   * @param number1 First number
   * @param number2 Second number
   * @return GCD
   */
  public static int getGCD(int number1, int number2) { 
    while(number2 != 0) {
      int remainder = number1 % number2;
      number1 = number2;
      number2 = remainder;
    }
    return number1;
  }
}
