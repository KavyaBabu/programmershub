package com.kb.dp.substring;

import java.util.HashMap;
import java.util.Scanner;

public class LongestCommonSubstringMemoisation {
    public String getLongestCommonSubString(String firstWord, String secondWord) {
        int firstWordLength = firstWord.length();
        int secondWordLength = secondWord.length();

        int[][] lookUpMatrix = new int[firstWordLength+1][secondWordLength+1];
        int len = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i <= firstWordLength ; i++) {
            for (int j = 0; j <= secondWordLength ; j++) {
                if( i == 0 || j == 0){
                    lookUpMatrix[i][j] = 0;
                } else if(firstWord.charAt(i-1) == secondWord.charAt(j-1)){
                    lookUpMatrix[i][j] = lookUpMatrix[i-1][j-1] + 1;
                    if(lookUpMatrix[i][j] > len){
                        len = lookUpMatrix[i][j];
                        row = i;
                        col = j;
                    }
                } else {
                    lookUpMatrix[i][j] = 0;
                }
            }
        }

        String subString = "";
        while (row > 0 && col > 0){
            subString = firstWord.charAt(row-1) + subString;
            row--;
            col--;
        }
        return subString;
    }


}
