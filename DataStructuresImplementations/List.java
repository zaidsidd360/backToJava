package DataStructuresImplementations;

public interface List<T> {

	public void add(T val);

	public void insert(int index, T val);

	public void delete(int index);

	public void remove(T val);

	public void removeAll(T val);

	public void replaceAll(T valToReplace, T valToBeReplacedWith);

	public Object get(int index);

	public void set(int index, T val);

	public boolean contains(T val);

	public int indexOf(T val);

	public int lastIndexOf(T val);

	public boolean isEmpty();

	public int size();

	public void clear();

	public void print();

	public void reverse();

}
