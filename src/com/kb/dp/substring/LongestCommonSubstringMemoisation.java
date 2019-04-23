package com.kb.dp.substring;

import java.util.HashMap;
import java.util.Scanner;

public class LongestCommonSubstringMemoisation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string1 = in.nextLine();
        String string2 = in.nextLine();
        int lengthOfLongestSubstring = LCS(string1, string2, string1.length(), string2.length(), new HashMap<String, Integer>());
        System.out.println("Length of longest substring (with memoisation ) = " + lengthOfLongestSubstring );
    }

    private static Integer LCS(String string1, String string2, int lengthOfString1, int lengthOfString2, HashMap<String, Integer> subStringLookUps) {
        if(lengthOfString1 == 0 || lengthOfString2 == 0){
            return 0;
        }
        String lookUpKey = lengthOfString1 + "-" + lengthOfString2;
        if(!subStringLookUps.containsKey(lookUpKey)){
            if(string1.charAt(lengthOfString1 - 1) == string2.charAt(lengthOfString2 - 1)){
                subStringLengthForSameEndCharacter(string1, string2, lengthOfString1, lengthOfString2, subStringLookUps, lookUpKey);
            } else {
                subStringLengthForDifferentEndCharacter(string1, string2, lengthOfString1, lengthOfString2, subStringLookUps, lookUpKey);
            }
        }
        return subStringLookUps.get(lookUpKey);
    }

    private static void subStringLengthForDifferentEndCharacter(String string1, String string2, int lengthOfString1, int lengthOfString2, HashMap<String, Integer> subStringLookUps, String lookUpKey) {
        int subStringLength = Math.max(LCS(string1, string2, lengthOfString1 - 1, lengthOfString2, subStringLookUps),
                LCS(string1, string2, lengthOfString1, lengthOfString2 - 1, subStringLookUps));
        subStringLookUps.put(lookUpKey, subStringLength);
    }

    private static void subStringLengthForSameEndCharacter(String string1, String string2, int lengthOfString1, int lengthOfString2, HashMap<String, Integer> subStringLookUps, String lookUpKey) {
        int subStringLength = LCS(string1, string2, lengthOfString1 - 1, lengthOfString2 - 1, subStringLookUps) + 1;
        subStringLookUps.put(lookUpKey, subStringLength);
    }
}
