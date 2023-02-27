/*
 * A sentence is a list of words that are separated 
 * by a single space with no leading or trailing spaces. 
 * You are given an array of strings sentences, where 
 * each sentences[i] represents a single sentence.
 * Return the maximum number of words that appear in a single sentence.
 * */

package LeetCode.Easy;

public class MaxWordsInSentence { // 2114
	public static int mostWordsFound(String[] sentences) {
		int max = 0;
		for (String sentence : sentences) {
			String arr[] = sentence.split(" ");
			max = Math.max(arr.length, max);
		}
		return max;
	}

	public static void main(String[] args) {
		String sentences[] = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
		System.out.println(mostWordsFound(sentences));
	}

}
