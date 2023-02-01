// There are n rings and each ring is either red, green, or blue. 
// The rings are distributed across ten rods labeled from 0 to 9.
// You are given a string rings of length 2n that describes the n 
// rings that are placed onto the rods. Every two characters in rings 
// forms a color-position pair that is used to describe each ring where:

// * The first character of the ith pair denotes the ith ring's color ('R', 'G', 'B').
// * The second character of the ith pair denotes the rod that the ith ring is placed on ('0' to '9').

// For example, "R3G2B1" describes n == 3 rings: 
// a red ring placed onto the rod labeled 3, 
// a green ring placed onto the rod labeled 2, 
// and a blue ring placed onto the rod labeled 1.
// Return the number of rods that have all three colors of rings on them.

package LeetCode.Easy;

import java.util.*;

public class RingsAndRods { // 2103
    public static int findRodsWithThreeColors(String rings) {
        Map<Integer, Set<Character>> map = new HashMap<>();
        for (int i = 0; i < rings.length(); i += 2) {
            int currentRod = (int) (rings.charAt(i + 1));
            char currentColor = rings.charAt(i);
            if (map.containsKey(currentRod)) {
                map.get(currentRod).add(currentColor);
            } else {
                Set<Character> set = new HashSet<>();
                set.add(currentColor);
                map.put(currentRod, set);
            }
        }
        int count = 0;
        for (int k : map.keySet()) {
            if (map.get(k).size() == 3)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String rings = "B0B6G0R6R0R6G9";
        System.out.println(findRodsWithThreeColors(rings));
    }
}
