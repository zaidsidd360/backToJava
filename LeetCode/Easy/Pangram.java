// A pangram is a sentence where every letter of 
// the English alphabet appears at least once.
// Given a string sentence containing only lowercase 
// English letters, return true if sentence is a pangram, 
// or false otherwise.

package LeetCode.Easy;

import java.util.*;

public class Pangram { // 1832
    public static boolean checkIfPangram(String sentence) { // Naive implementation; LC runtime 5ms
        Map<Character, Boolean> map = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            map.put(alphabet.charAt(i), false);
        }
        for (int j = 0; j < sentence.length(); j++) {
            if (map.containsKey(sentence.charAt(j)))
                map.put(sentence.charAt(j), true);
        }
        for (Map.Entry<Character, Boolean> e : map.entrySet()) {
            if (!e.getValue())
                return false;
        }
        return true;
    }

    public static boolean checkIfPangram2(String sentence) { // Optimized implementation; LC runtime 4ms
        if (sentence.length() < 26)
            return false;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram2(sentence));
    }
}
