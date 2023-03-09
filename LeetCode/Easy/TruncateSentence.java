/*
 * A sentence is a list of words that are separated by a single 
 * space with no leading or trailing spaces. Each of the words 
 * consists of only uppercase and lowercase English letters (no punctuation). 
 * For example, "Hello World", "HELLO", and "hello world hello world" are all sentences. 
 * You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that 
 * it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.
 * */

package LeetCode.Easy;

public class TruncateSentence { // 1816
	public static String truncateSentence(String s, int k) {
		String arr[] = s.split(" ");
		String ans = "";
		for (int i = 0; i < k; i++) {
			if (i == k - 1)
				ans += arr[i];
			else
				ans += arr[i] + " ";
		}
		return ans;
	}

	public static void main(String[] args) {
		String s = "Hello how are you Contestant";
		int k = 4;
		System.out.println(truncateSentence(s, k));
	}

}
