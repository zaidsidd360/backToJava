/*
 * Write a short Java method that uses a StringBuilder instance to remove all the
 * punctuation from a string s storing a sentence, for example, transforming the
 * string "Let’s try, Mike!" to "Lets try Mike".
 * */

package goodrichTamassia.section1.reinforcement;

public class R8 {
	public static String removePunctuation(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if ((int) s.charAt(i) < 33 || (int) s.charAt(i) > 48) {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(removePunctuation("Let's try, Mike!"));
	}
}
