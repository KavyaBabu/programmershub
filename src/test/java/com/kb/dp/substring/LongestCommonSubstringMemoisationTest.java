package com.kb.dp.substring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubstringMemoisationTest {

    @Test
    @DisplayName("Longest Substring For A Non Empty String")
    public void returnLongestSubstringForANonEmptyString(){

        LongestCommonSubstringMemoisation longestCommonSubstringMemoisation = new LongestCommonSubstringMemoisation();
        String word1 = "distribute";
        String word2 = "tribute";
        String longestSubstring = longestCommonSubstringMemoisation.getLongestCommonSubString(word1, word2);
        Assertions.assertEquals("tribute", longestSubstring);
    }

}