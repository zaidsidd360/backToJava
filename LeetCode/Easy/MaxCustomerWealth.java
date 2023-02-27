/*
 * You are given an m x n integer grid accounts where 
 * accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer 
 * has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
 * A customer's wealth is the amount of money they have in all 
 * their bank accounts. The richest customer is the customer 
 * that has the maximum wealth.
 * */

package LeetCode.Easy;

public class MaxCustomerWealth { // 1672
	public static int maximumWealth(int[][] accounts) {
		int max = 0;
		for (int[] cus : accounts) {
			int curr = 0;
			for (int money : cus) {
				curr += money;
			}
			max = Math.max(curr, max);
		}
		return max;
	}

	public static void main(String[] args) {
		int accounts[][] = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
		System.out.println(maximumWealth(accounts));
	}

}
