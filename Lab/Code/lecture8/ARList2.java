public class ARList2<T> {

    private T[] items;
    private int size;

//    /** Creates an empty list. */
//    public ARList2() {
//        items = new T[100]; // Java does not allow this
//        size = 0;
//    }

    /** Creates an empty list. */
	@SuppressWarnings("unchecked")
    public ARList2() {
        items = (T[]) new Object[100];
        size = 0;
    }

    /**
     * Returns the number of items in the list.
     * @return the size of the list.
     */
    public int size() {
        return size;
    }

    /** Resizes the underlying array to the target capacity. */
	@SuppressWarnings("unchecked")
    private void resize(int capacity) {
        T[] a = (T[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    /**
     * Adds item to the end of the list.
     * @param item is the new item.
     */
    public void addLast(T item) {
        if (size == items.length) {
            resize(2 * size);
        }
        items[size] = item;
        size++;
    }

    /**
     * Returns the last item at the back of the list.
     * @return the last item in the list.
     */
    public T getLast() {
        return items[size - 1];
    }

    /**
     * Gets the item at the given index in the list.
     * @param i is an index where 0 is the front.
     * @return the ith item in the list.
     */
    public T get(int i) {
        return items[i];
    }

    /**
     * Deletes and returns the item at the back of the list.
     * @return the last item of the list to be deleted.
     */
    public T delLast() {
        T x = getLast();
        items[size - 1] = null;
        size--;
        return x;
    }

}
