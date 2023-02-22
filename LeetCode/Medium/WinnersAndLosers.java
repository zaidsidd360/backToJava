/*
You are given an integer array matches where matches[i] = [winneri, loseri] 
indicates that the player winneri defeated player loseri in a match.
Return a list answer of size 2 where:

* answer[0] is a list of all players that have not lost any matches.
* answer[1] is a list of all players that have lost exactly one match.
The values in the two lists should be returned in increasing order.

Note:
You should only consider the players that have played at least one match.
The testcases will be generated such that no two matches will have the same outcome.
*/

package LeetCode.Medium;

import java.util.*;

public class WinnersAndLosers { // 2225
    public static List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Map<Integer, Integer> losers = new HashMap<>();
        Map<Integer, Integer> winners = new HashMap<>();
        for (int[] match : matches) {
            if (losers.containsKey(match[1]))
                losers.put(match[1], losers.get(match[1]) + 1);
            else
                losers.put(match[1], 1);
        }
        for (int[] match : matches) {
            if (winners.containsKey(match[0]))
                winners.put(match[0], winners.get(match[0]) + 1);
            else
                winners.put(match[0], 1);
        }
        ArrayList<Integer> loserList = new ArrayList<>();
        ArrayList<Integer> winnerList = new ArrayList<>();
        for (int k1 : losers.keySet()) {
            if (losers.get(k1) == 1)
                loserList.add(k1);
        }
        for (int k2 : winners.keySet()) {
            if (!losers.containsKey(k2))
                winnerList.add(k2);
        }
        list.add(winnerList);
        list.add(loserList);
        Collections.sort(winnerList);
        Collections.sort(loserList);
        return list;
    }

    public static void main(String[] args) {
        int matches[][] = { { 1, 3 }, { 2, 3 }, { 3, 6 }, { 5, 6 }, { 5, 7 }, { 4, 5 }, { 4, 8 }, { 4, 9 }, { 10, 4 },
                { 10, 9 } };
        System.out.println(findWinners(matches));
    }
}
