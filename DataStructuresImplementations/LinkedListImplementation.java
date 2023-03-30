package DataStructuresImplementations;

class LinkedList<T> implements List<T> {
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
		head = new ListNode(null);
		tail = head;
		size = 0;
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
	 * Deletes the element present at the specified index from the list.
	 */
	public void delete(int index) {
		if (index >= this.size || index < 0)
			throw new IndexOutOfBoundsException();
		if (index == 0) {
			head.next = head.next.next;
			size--;
			return;
		}
		int i = 0;
		ListNode curr = head.next;
		while (curr != null) {
			if (i == index - 1) {
				curr.next = curr.next.next;
				if (index == size - 1)
					tail = curr;
				size--;
			}
			i++;
			curr = curr.next;
		}
	}

	/*
	 * Removes the first occurance of the given element from the list.
	 */
	public void remove(T val) {
		int i = 0;
		ListNode curr = head.next;
		while (curr != null) {
			if (curr.value.equals(val)) {
				this.delete(i);
				return;
			}
			curr = curr.next;
			i++;
		}
	}

	/*
	 * Removes all the occurances of the given element from the list.
	 */
	public void removeAll(T val) {
		ListNode curr = head;
		while (curr.next != null) {
			if (curr.next.value.equals(val)) {
				curr.next = curr.next.next;
				size--;
			} else
				curr = curr.next;
		}
	}

	/*
	 * Replaces all occurances of a specified value with the given value to be
	 * replaced with.
	 */
	public void replaceAll(T valToReplace, T valToBeReplacedWith) {
		ListNode curr = head.next;
		while (curr != null) {
			if (curr.value.equals(valToReplace))
				curr.value = valToBeReplacedWith;
			curr = curr.next;
		}
	}

	/*
	 * Gets the value at a given index. Throws indexOutOfBounds exception if given
	 * index is out of bounds.
	 */
	@SuppressWarnings("unchecked")
	public T get(int index) {
		if (index >= this.size || index < 0)
			throw new IndexOutOfBoundsException();
		ListNode curr = head.next;
		int i = 0;
		while (curr != null) {
			if (i == index) {
				return curr.value;
			}
			curr = curr.next;
			i++;
		}
		return (T) "-1";
	}

	/*
	 * Replaces the specified element in the list, present at the specified index.
	 * Throws indexOutOfBounds exception if given index is out of bounds.
	 */
	public void set(int index, T val) {
		if (index >= this.size || index < 0)
			throw new IndexOutOfBoundsException();
		ListNode curr = head.next;
		int i = 0;
		while (curr != null) {
			if (i == index) {
				curr.value = val;
				return;
			}
			curr = curr.next;
			i++;
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

	@Override
	public boolean contains(T val) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(T val) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(T val) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}
}

public class LinkedListImplementation {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(3);
		for (int i = 4; i <= 10; i++)
			list.add(i);
		list.add(3);
		list.add(3);
		list.insert(9, 69);
		list.print();
		System.out.println(list.size());
		list.remove(3);
		list.set(0, 222);
		list.print();
		System.out.println(list.get(0));
	}

}
