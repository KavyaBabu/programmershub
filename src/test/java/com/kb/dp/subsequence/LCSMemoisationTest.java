package com.kb.dp.subsequence;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCSMemoisationTest {

    @Test
    @DisplayName("Returns the length of longest common substring between 2 strings")
    public void returnLengthOfLCSForTwoStrings(){
        LCSMemoisation lcsMemoisation = new LCSMemoisation();
        String word1 = "abcde";
        String word2 = "dfe";
        int lcsLEngth = lcsMemoisation.getLCSLength(word1, word2);
        assertEquals(lcsLEngth, 2);

    }

    @Test
    @DisplayName("Returns the length of longest common substring between a string and an empty string")
    public void returnLengthOfLCSForEmptyStrings(){
        LCSMemoisation lcsMemoisation = new LCSMemoisation();
        String word1 = "abcde";
        String word2 = "";
        int lcsLEngth = lcsMemoisation.getLCSLength(word1, word2);
        assertEquals(lcsLEngth, 0);

    }


    @Test
    @DisplayName("Returns the length of longest common substring between a string and a string with repeating char")
    public void returnLengthOfLCSForStringWithRepeatingChar(){
        LCSMemoisation lcsMemoisation = new LCSMemoisation();
        String word1 = "abcde";
        String word2 = "abcc";
        int lcsLEngth = lcsMemoisation.getLCSLength(word1, word2);
        assertEquals(lcsLEngth, 3);

    }
}