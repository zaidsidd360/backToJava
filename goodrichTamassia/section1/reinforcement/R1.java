/* Question: 
 * Suppose that we create an array A of GameEntry objects, which has an integer
 * scores field, and we clone A and store the result in an array B. If we then im-
 * mediately set A[4].score equal to 550, what is the score value of the GameEntry
 * object referenced by B[4]?
 * */

package goodrichTamassia.section1.reinforcement;

class GameEntry {
	int score;

	public GameEntry(int score) {
		this.score = score;
	}
}

public class R1 {

	public static void main(String[] args) {
		GameEntry A[] = new GameEntry[10];
		for (int i = 0; i < A.length; i++) {
			A[i] = new GameEntry(i);
		}
		GameEntry B[] = A.clone();
		A[4].score = 550;
		System.out.println(B[4].score);
	}

}

/*
 * Answer: The value of B[4].score changes to 550.
 */
