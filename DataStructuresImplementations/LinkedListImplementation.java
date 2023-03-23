package DataStructuresImplementations;

class LinkedList<T> {
	/*
	 * ListNode class for each node of the LinkedList.
	 */
	class ListNode {
		T value;
		ListNode next;

		/*
		 * Constructor for an individual ListNode.
		 */
		public ListNode(T val) {
			this.value = val;
			this.next = null;
		}
	}

	/* Head of the list. */
	public ListNode head;
	/* Tail of the list. */
	public ListNode tail;

	/*
	 * Constructor for our LinkedList class.
	 */
	public LinkedList() {
		this.head = new ListNode(null);
		this.tail = this.head;
	}

	/*
	 * Adds the given value to the tail of the list.
	 */
	public void add(T val) {
		tail.next = new ListNode(val);
		tail = tail.next;
	}

	/*
	 * Prints the list.
	 */
	public void print() {
		ListNode curr = head.next;
		while (curr != null) {
			System.out.print(curr.value + " -> ");
			curr = curr.next;
		}
		System.out.print("null");
		System.out.println();
	}
}

public class LinkedListImplementation {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		for (int i = 4; i <= 25; i++)
			list.add(i);
		list.print();
	}

}
