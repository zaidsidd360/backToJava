/*
 * In English, we have a concept called root, which can be followed by some other word to form 
 * another longer word - let's call this word successor. For example, when the root "an" is followed 
 * by the successor word "other", we can form a new word "another". 
 * 
 * Given a dictionary consisting of many roots and a sentence consisting of words separated by 
 * spaces, replace all the successors in the sentence with the root forming it. If a successor 
 * can be replaced by more than one root, replace it with the root that has the shortest length. 
 * 
 * Return the sentence after the replacement.
 * */

package LeetCode.Medium;

import java.util.*;

public class ReplaceWords { // 648
	public static String replaceWords(List<String> dictionary, String sentence) {
		String arr[] = sentence.split(" ");
		int i = 0;
		while (i < dictionary.size()) {
			String root = dictionary.get(i);
			for (int j = 0; j < arr.length; j++) {
				String word = arr[j];
				if (word.length() >= root.length() && word.substring(0, root.length()).equals(root))
					arr[j] = dictionary.get(i);
			}
			i++;
		}
		return String.join(" ", arr);
	}

	public static void main(String[] args) {
		List<String> dictionary = Arrays.asList("cat", "bat", "rat");
		String sentence = "the cattle was rattled by the battery";
		System.out.println(replaceWords(dictionary, sentence));
	}

}
