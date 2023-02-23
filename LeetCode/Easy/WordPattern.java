/*
Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection 
between a letter in pattern and a non-empty word in s.
*/

package LeetCode.Easy;

import java.util.*;

public class WordPattern { // 290
    public static boolean wordPattern(String pattern, String s) {
        Map<String, Character> map = new HashMap<>();
        String[] str = s.split(" ");
        if (pattern.length() != str.length)
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            char currChar = pattern.charAt(i);
            String currWord = str[i];
            if (map.containsKey(currWord) && map.get(currWord) != currChar)
                return false;
            map.put(currWord, currChar);
        }
        System.out.println(map);
        Set<Character> set = new HashSet<>();
        for (String k : map.keySet()) {
            char v = map.get(k);
            if (set.contains(v))
                return false;
            else
                set.add(v);
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abbabba";
        String s = "dog cat cat dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}
