// You are given two strings s and t. String t is generated by 
// random shuffling string s and then add one more letter at a 
// random position. Return the letter that was added to t.

package LeetCode.Easy;

import java.util.*;

public class DifferenceOfStrings { // 389
    public static char findTheDifference(String s, String t) {
        char arrS[] = s.toCharArray();
        char arrT[] = t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        int pointerS = 0;
        int pointerT = 0;
        while (pointerS < s.length()) {
            if (arrS[pointerS] != arrT[pointerT])
                return arrT[pointerT];
            pointerS++;
            pointerT++;
        }
        return arrT[t.length() - 1];
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
}
