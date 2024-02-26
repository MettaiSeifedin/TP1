package ConditionCoverageTest;


import org.example.Anagram;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Exo2Test {
    @Test
    public void IsAnagramShouldReturnExceptionWhenOneOfTheInputsIsNull(){
        Assertions.assertThrows(NullPointerException.class,()-> Anagram.isAnagram(null,"s"));
    }
    @Test
    public void IsAnagramShouldReturnFalseWhenTheStringsInputNotNullAndSizesAreDifferent()
    {
        Assertions.assertFalse(Anagram.isAnagram("as","sscs"));
    }
    @Test
    public void IsAnagramShouldReturnFalseWhenTheStringsInputNotNullAndAreNotAnagrams()
    {
        Assertions.assertFalse(Anagram.isAnagram("a","c"));
    }
    @Test
    public void IsAnagramShouldReturnTrueWhenTheStringsInputNotNullAndAreAnagrams()
    {
        Assertions.assertTrue(Anagram.isAnagram("acb","bac"));
    }
}
