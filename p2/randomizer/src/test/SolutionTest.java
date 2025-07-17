import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

  @Test
  public void invert_123456_to_654321() {
    int result = Solution.invert(123456);
    assertEquals(654321, result, "123456 invert to 654321");
  }

  @Test
  public void isPalindrome_987789() {
    boolean palindrome = Solution.isPalindrome(987789);
    assertTrue(palindrome);
  }
}
