// You're given strings jewels representing the types of stones that are 
// jewels, and stones representing the stones you have. Each character 
// in stones is a type of stone you have. You want to know how many of 
// the stones you have are also jewels. 
// Letters are case sensitive, so "a" is considered a different type of stone from "A".

// Constraints:

// 1 <= jewels.length, stones.length <= 50
// jewels and stones consist of only English letters.
// ** All the characters of jewels are unique. **

package LeetCode.Easy;

import java.util.*;

public class JewelsInStones { // 771
    public static int numJewelsInStones(String jewels, String stones) { // HashMap implementation; LC runtime 2ms
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < jewels.length(); i++) {
            map.put(jewels.charAt(i), 0);
        }
        for (int j = 0; j < stones.length(); j++) {
            if (map.containsKey(stones.charAt(j)))
                map.put(stones.charAt(j), map.get(stones.charAt(j)) + 1);
        }
        int count = 0;
        for (Character c : map.keySet()) {
            count += map.get(c);
        }
        return count;
    }

    public static int numJewelsInStones2(String jewels, String stones) { // HashSet implementation; LC runtime 1ms
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        for (int j = 0; j < stones.length(); j++) {
            if (set.contains(stones.charAt(j)))
                count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones2(jewels, stones));
    }
}
