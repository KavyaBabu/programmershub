package com.kb.dp.substring;

import java.util.Scanner;

public class LongestCommonSubstringRecusrion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string1 = in.nextLine();
        String string2 = in.nextLine();
        int lengthOfLongestSubstring = LCS(string1, string2, string1.length(), string2.length());
        System.out.println("Length of longest substring (with recursion ) = " + lengthOfLongestSubstring );

    }

    private static int LCS(String string1, String string2, int m, int n) {
        if(m == 0 || n == 0){
            return 0;
        }
        if(string1.charAt(m-1) == string2.charAt(n-1)){
            return LCS(string1, string2, m-1, n-1) +1;
        } else {
            return Math.max(LCS(string1, string2, m, n-1), LCS(string1, string2, m-1, n));
        }

    }
}
