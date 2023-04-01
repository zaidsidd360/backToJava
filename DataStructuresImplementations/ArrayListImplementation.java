package DataStructuresImplementations;

class ArrayList<T> implements List<T> {
	private int capacity = 16;
	private int size = 0;
	private Object[] internalArray;

	/*
	 * Parameterized constructor. Constructs a list with the given capacity.
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
	 * Non-parameterized constructor.
	 */
	public ArrayList() {
		internalArray = new Object[this.capacity];
	}

	/*
	 * Appends the given element to the tail of the list. Complexity: Amortized O(1)
	 */
	public void add(T val) {
		if (size == capacity - 2) {
			this.capacity *= 2;
			this.resize(capacity);
		}
		this.internalArray[size++] = val;
	}

	/*
	 * Inserts the given element at the specified index in the list. Complexity:
	 * O(n)
	 */
	public void insert(int index, T val) {
		if (index >= size)
			throw new IndexOutOfBoundsException();
		if (size == capacity - 2) {
			this.capacity *= 2;
			this.resize(capacity);
		}
		for (int j = size + 1; j > index; j--) {
			internalArray[j] = internalArray[j - 1];
		}
		internalArray[index] = val;
		size++;
	}

	/*
	 * Deletes the element present at the specified index from the list.
	 */
	public void delete(int index) {
		if (index >= size)
			throw new IndexOutOfBoundsException();
		for (int i = index; i < size; i++) {
			internalArray[i] = internalArray[i + 1];
		}
		size--;
		if (size <= 0.25 * capacity) {
			capacity /= 2;
			this.resize(capacity);
		}
	}

	/*
	 * Removes the first occurance of the given element from the list.
	 */
	public void remove(T val) {
		for (int i = 0; i < size; i++) {
			if (internalArray[i].equals(val)) {
				delete(i);
			}
		}
		if (size <= 0.25 * capacity) {
			capacity /= 2;
			this.resize(capacity);
		}
	}

	/*
	 * Removes all the occurances of the given element from the list.
	 */
	public void removeAll(T val) {
		int length = 0;
		for (int i = 0; i < size; i++) {
			if (internalArray[i].equals(val))
				length++;
		}
		int indices[] = new int[length];
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (internalArray[i].equals(val))
				indices[count++] = i;
		}
		count = 0;
		for (int i = 0; i < length; i++) {
			delete(indices[i] - count++);
		}
	}

	/*
	 * Replaces all occurances of a specified value with the given value to be
	 * replaced with.
	 */
	public void replaceAll(T valToReplace, T valToBeReplacedWith) {
		for (int i = 0; i < size; i++) {
			if (internalArray[i].equals(valToReplace))
				internalArray[i] = valToBeReplacedWith;
		}
	}

	/*
	 * Gets the value at a given index. Throws indexOutOfBounds exception if given
	 * index is out of bounds. Complexity: O(1)
	 */
	public Object get(int index) {
		if (index >= size)
			throw new IndexOutOfBoundsException();
		return internalArray[index];
	}

	/*
	 * Replaces the specified element in the list, present at the specified index.
	 * Throws indexOutOfBounds exception if given index is out of bounds.
	 */
	public void set(int index, T val) {
		if (index >= size)
			throw new IndexOutOfBoundsException();
		internalArray[index] = val;
	}

	/*
	 * Returns true if the list contains the given element, false otherwise.
	 */
	public boolean contains(T val) {
		for (int i = 0; i < size; i++) {
			if (internalArray[i].equals(val))
				return true;
		}
		return false;
	}

	/*
	 * Return the first index of the specified element, or -1 if the list does not
	 * contain the element.
	 */
	public int indexOf(T val) {
		for (int i = 0; i < size; i++) {
			if (internalArray[i].equals(val))
				return i;
		}
		return -1;
	}

	/*
	 * Return the index of the last occurrence of the specified element, or -1 if
	 * the list does not contain the element.
	 */
	public int lastIndexOf(T val) {
		int ind = -1;
		for (int i = 0; i < size; i++) {
			if (internalArray[i].equals(val))
				ind = i;
		}
		return ind;
	}

	/*
	 * Returns true if the list is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/*
	 * Returns the number of elements in the list.
	 */
	public int size() {
		return size;
	}

	/*
	 * Removes all elements from the list. Complexity: O(1)
	 */
	public void clear() {
		this.capacity = 16;
		this.size = 0;
		internalArray = new Object[capacity];
	}

	/*
	 * Reverses the list in place.
	 */
	@SuppressWarnings("unchecked")
	public void reverse() {
		int i = 0;
		int j = this.size - 1;
		while (i < j) {
			T temp = (T) internalArray[i];
			internalArray[i] = internalArray[j];
			internalArray[j] = temp;
			i++;
			j--;
		}
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

	/*
	 * Private method to resize the internalArray if the size of list is at
	 * capacity.
	 */
	private void resize(int newCapacity) {
		Object[] tempArray = new Object[newCapacity];
		for (int i = 0; i < this.size; i++) {
			tempArray[i] = internalArray[i];
		}
		internalArray = tempArray;
	}
}

public class ArrayListImplementation {
	public static void main(String[] args) throws Exception {
		List<String> names = new ArrayList<>();

		names.add("Tausif");
		names.add("Adib");
		names.add("Maroof");
		names.add("Maroof");
		names.add("Maroof");
		names.print();
		names.insert(0, "Maroof");
		names.insert(3, "Nafis");
		names.print();
		names.removeAll("Maroof");
		names.print();
		names.reverse();
		names.print();
		System.out.println(names.indexOf("Maroof") + " " + names.lastIndexOf("Maroof") + " " + names.get(2) + " "
				+ names.isEmpty() + " " + names.size() + " " + names.lastIndexOf("Waqqas"));
	}
}
