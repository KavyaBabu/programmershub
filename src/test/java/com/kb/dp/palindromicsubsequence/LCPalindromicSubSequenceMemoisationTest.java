package com.kb.dp.palindromicsubsequence;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCPalindromicSubSequenceMemoisationTest {

    @Test
    @DisplayName("palindromic sub-sequence")
    public void returnTheLengthOfPalindromicSubSequence(){

        LCPalindromicSubSequenceMemoisation lengthOfPalindromicSubsequnce = new LCPalindromicSubSequenceMemoisation();
        String word = "abdadhbj";
        String longestPalindromicSubSequence = lengthOfPalindromicSubsequnce.getLongestPalindromicSubsequence(word);
        assertEquals(longestPalindromicSubSequence, "bdadb" +
                "");
    }

    @Test
    @DisplayName("return empty for empty input")
    public void returnEmptySubSequence(){

        LCPalindromicSubSequenceMemoisation lengthOfPalindromicSubsequnce = new LCPalindromicSubSequenceMemoisation();
        String word = "";
        String longestPalindromicSubSequence = lengthOfPalindromicSubsequnce.getLongestPalindromicSubsequence(word);
        assertEquals(longestPalindromicSubSequence, "");
    }
}