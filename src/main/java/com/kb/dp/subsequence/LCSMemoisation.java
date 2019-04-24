package com.kb.dp.subsequence;

public class LCSMemoisation {
    public int getLCSLength(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();
        int[][] lookupMatrix = new int[word1Length +1][word2Length +1];
        for (int i = 0; i <= word1Length; i++) {
            for (int j = 0; j <= word2Length; j++) {
                if(i==0 || j==0){
                    lookupMatrix[i][j] = 0;
                } else if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    lookupMatrix[i][j] = lookupMatrix[i-1][j-1] + 1 ;
                } else {
                    lookupMatrix[i][j] = Integer.max(lookupMatrix[i][j-1], lookupMatrix[i-1][j]);
                }
            }
        }

        return lookupMatrix[word1Length][word2Length];
    }
}
