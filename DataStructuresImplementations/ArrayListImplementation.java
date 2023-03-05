package DataStructuresImplementations;

class ArrayList<T> {
	int capacity = 16;
	int size = 0;
	Object[] internalArray;

	/*
	 * Parameterized constructor. Constructs a list with the given capacity
	 */
	public ArrayList(int initialCapacity) throws Exception {
		if (initialCapacity < 0)
			throw new Exception("Illegal initial capacity");
		else {
			this.capacity = initialCapacity;
			internalArray = new Object[this.capacity];
		}
	}

	/*
	 * Non-parameterized constructor
	 */
	public ArrayList() {
		internalArray = new Object[this.capacity];
	}

	/*
	 * Adds the given value to the tail of the list. Complexity: Amortized O(1)
	 */
	public void add(T val) {
		if (size == capacity - 1) {
			this.capacity *= 2;
			Object[] tempArray = new Object[capacity];
			for (int i = 0; i < this.size; i++) {
				tempArray[i] = internalArray[i];
			}
			internalArray = tempArray;
		}
		this.internalArray[size++] = val;
	}

	/*
	 * Gets the value at a given index. Throws indexOutOfBounds exception if given
	 * index is out of bounds. Complexity: O(1)
	 */
	public Object get(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		return internalArray[index];
	}

	/*
	 * Returns true if the list is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/*
	 * Prints the list. Complexity: O(n)
	 */
	public void print() {
		System.out.print("[");
		for (int p = 0; p < size; p++) {
			if (p == size - 1)
				System.out.print(internalArray[p] + "");
			else
				System.out.print(internalArray[p] + ", ");
		}
		System.out.print("]");
		System.out.println();
	}
}

public class ArrayListImplementation {
	public static void main(String[] args) throws Exception {
		ArrayList<String> names = new ArrayList<>();

		names.add("Tausif");
		names.add("Adib");
		names.add("Maroof");
		names.print();
		System.out.println(names.get(1) + " " + names.isEmpty());
	}
}
