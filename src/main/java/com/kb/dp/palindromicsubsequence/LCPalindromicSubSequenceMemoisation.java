package com.kb.dp.palindromicsubsequence;

public class LCPalindromicSubSequenceMemoisation {

    public String getLongestPalindromicSubsequence(String word) {
        String reverseWord = new StringBuilder(word).reverse().toString();
        int wordLength = word.length();
        int[][] lookupMatrix = getLookUpMatrix(word, reverseWord, wordLength);
        return getPalindromicSubsequence(word, reverseWord, wordLength, lookupMatrix);
    }

    private String getPalindromicSubsequence(String word, String reverseWord, int wordLength, int[][] lookupMatrix) {
        String palindromicSequence = "";
        int i = wordLength;
        int j = wordLength;
        while(i>0 && j>0){
            if(word.charAt(i-1) == reverseWord.charAt(j-1)){
                palindromicSequence += word.charAt(i-1);
                i--;
                j--;
            } else if(lookupMatrix[i][j-1] > lookupMatrix[i-1][j]){
                j--;
            } else {
                i--;
            }
        }
        return palindromicSequence;
    }

    private int[][] getLookUpMatrix(String word, String reverseWord, int wordLength) {
        int[][] lookupMatrix = new int[wordLength +1][wordLength +1];
        for (int i = 0; i <= wordLength; i++) {
            for (int j = 0; j <= wordLength; j++) {
                if(i==0 || j==0){
                    lookupMatrix[i][j] = 0;
                } else if (word.charAt(i-1) == reverseWord.charAt(j-1)) {
                    lookupMatrix[i][j] = lookupMatrix[i-1][j-1] + 1 ;
                } else {
                    lookupMatrix[i][j] = Integer.max(lookupMatrix[i][j-1], lookupMatrix[i-1][j]);
                }
            }
        }
        return lookupMatrix;
    }


}
