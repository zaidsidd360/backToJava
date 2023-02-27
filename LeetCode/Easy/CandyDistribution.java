/*
 * There are n kids with candies. You are given an integer array
 * candies, where each candies[i] represents the number of candies
 * the ith kid has, and an integer extraCandies, denoting the number 
 * of extra candies that you have. Return a boolean array result of 
 * length n, where result[i] is true if, after giving the ith kid all 
 * the extraCandies, they will have the greatest number of candies 
 * among all the kids, or false otherwise. 
 * Note that multiple kids can have the greatest number of candies.
 * */

package LeetCode.Easy;

import java.util.*;

public class CandyDistribution { // 1431
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> res = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		for (int candy : candies)
			max = Math.max(candy, max);
		for (int candy : candies)
			if (candy + extraCandies >= max)
				res.add(true);
			else
				res.add(false);
		return res;
	}

	public static void main(String[] args) {
		int candies[] = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;
		System.out.println(kidsWithCandies(candies, extraCandies));
	}

}
