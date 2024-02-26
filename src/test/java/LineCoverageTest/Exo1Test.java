package LineCoverageTest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.example.Palindrome ;
public class Exo1Test {
    @Test
    public void PlaindromeTestShouldReturnNullPointerExceptionWhenStingIsNull()
    {
         String S = null ;
        Assertions.assertThrows(NullPointerException.class,()->Palindrome.isPalindrome(S));
    }
    @Test
    public void PlaindromeTestShouldReturnTrueWhenStringIsPalindrome()
    {
        Assertions.assertTrue(Palindrome.isPalindrome("kk"));
    }
    @Test
    public void PlaindromeTestShouldReturnFalseWhenStringIsNotPalindrome()
    {
        Assertions.assertFalse(Palindrome.isPalindrome("hello"));
    }

}
