package BranchCoverageTest;


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
        Assertions.assertTrue(Palindrome.isPalindrome("kayak"));
    }
    @Test
    public void PlaindromeTestShouldReturnFalseWhenStringIsNotPalindrome()
    {
        Assertions.assertFalse(Palindrome.isPalindrome("hello world"));
    }
    @Test
    public void PlaindromeTestShouldReturnTrueWhenLenghtOfStringIs1()
    {
        Assertions.assertFalse(Palindrome.isPalindrome("d"));
    }

}