/*
 * Given the array queries of positive integers between 1 and m, 
 * you have to process all queries[i] (from i=0 to i=queries.length-1) 
 * according to the following rules: 
 * 
 * * In the beginning, you have the permutation P=[1,2,3,...,m]. 
 * * For the current i, find the position of queries[i] in the 
 * permutation P (indexing from 0) and then move this at the beginning 
 * of the permutation P. 
 * 
 * Notice that the position of queries[i] in P is the result for queries[i]. 
 * Return an array containing the result for the given queries.
 * */

package LeetCode.Medium;

import java.util.*;

public class QueryPermutation { // 1409
	public static int[] processQueries(int[] queries, int m) {
		List<Integer> p = new ArrayList<>();
		int ans[] = new int[queries.length];
		for (int i = 1; i <= m; i++)
			p.add(i);
		for (int i = 0; i < queries.length; i++) {
			int curr = queries[i];
			int pos = p.indexOf(curr);
			ans[i] = pos;
			p.remove(pos);
			p.add(0, curr);
		}
		return ans;
	}

	public static void main(String[] args) {
		int queries[] = { 7, 5, 5, 8, 3 };
		int m = 8;
		int ans[] = processQueries(queries, m);
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

}
