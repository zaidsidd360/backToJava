package DataStructuresImplementations;

class LinkedList<T> {
	/*
	 * ListNode class for each node of the LinkedList.
	 */
	private class ListNode {
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
	private ListNode head;
	/* Tail of the list. */
	private ListNode tail;
	/* Size of the list. */
	private int size;

	/*
	 * Constructor for our LinkedList class.
	 */
	public LinkedList() {
		this.head = new ListNode(null);
		this.tail = this.head;
		this.size = 0;
	}

	/*
	 * Adds the given value to the tail of the list.
	 */
	public void add(T val) {
		tail.next = new ListNode(val);
		tail = tail.next;
		size++;
	}

	/*
	 * Insert the given value to the specified index.
	 */
	public void insert(int index, T val) {
		if (index >= this.size || index < 0)
			throw new IndexOutOfBoundsException();
		ListNode newNode = new ListNode(val);
		if (index == 0) {
			newNode.next = head.next;
			head.next = newNode;
			size++;
			return;
		}
		int i = 0;
		ListNode curr = head.next;
		while (curr != null) {
			if (i == index - 1) {
				ListNode ahead = curr.next;
				curr.next = newNode;
				newNode.next = ahead;
				size++;
			}
			i++;
			curr = curr.next;
		}
	}

	/*
	 * Returns the first element in the list.
	 */
	public T getFirst() {
		return head.next.value;
	}

	/*
	 * Returns the last element in the list.
	 */
	public T getLast() {
		return tail.value;
	}

	/*
	 * Returns the size of the list.
	 */
	public int size() {
		return this.size;
	}

	/*
	 * Returns true if the list is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return this.size == 0;
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
		for (int i = 4; i <= 10; i++)
			list.add(i);
		list.insert(9, 69);
		System.out.println(list.getLast());
		list.add(69420);
		System.out.println(list.getLast());
		list.print();
	}

}
