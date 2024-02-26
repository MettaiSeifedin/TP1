package BranchCoverageTest;


import org.example.Anagram;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Exo2Test {
    @Test
    public void IsAnagramShouldReturnExceptionWhenOneOfTheInputsIsNull(){
        Assertions.assertThrows(NullPointerException.class,()-> Anagram.isAnagram(null,"s"));
    }
    @Test
    public void IsAnagramShouldReturnFalseWhenTheStringsInputSizesAreDifferent()
    {
        Assertions.assertFalse(Anagram.isAnagram("as","sscs"));
    }
    @Test
    public void IsAnagramShouldReturnFalseWhenTheStringsInputAreNotAnagrams()
    {
        Assertions.assertFalse(Anagram.isAnagram("a","c"));
    }
    @Test
    public void IsAnagramShouldReturnTrueWhenTheStringsInputAreAnagrams()
    {
        Assertions.assertTrue(Anagram.isAnagram("acb","bac"));
    }
}
