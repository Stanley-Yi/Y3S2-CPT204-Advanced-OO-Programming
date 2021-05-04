import java.util.Iterator;

public class ARList<T> implements ListIF<T>, Iterable<T> {

    private T[] items;
    private int size;

    /** Creates an empty list. */
    @SuppressWarnings("unchecked")
    public ARList() {
        items = (T[]) new Object[100];
        size = 0;
    }

    /**
     * Returns the number of items in the list.
     * @return the size of the list.
     */
    @Override
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
    @Override
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
    @Override
    public T getLast() {
        return items[size - 1];
    }

    /**
     * Gets the item at the given index in the list.
     * @param i is an index where 0 is the front.
     * @return the ith item in the list.
     */
    @Override
    public T get(int i) {
        return items[i];
    }

    /**
     * Deletes and returns the item at the back of the list.
     * @return the last item of the list to be deleted.
     */
    @Override
    public T delLast() {
        T x = getLast();
        items[size - 1] = null;
        size--;
        return x;
    }

    /**
     * Make an iterator
     */
    @Override
    public Iterator<T> iterator() {
        return new ARListIterator();
    }

    private class ARListIterator implements Iterator<T> {
        private int index;

        public ARListIterator() {
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            T nextItem = items[index];
            index++;
            return nextItem;
        }
    }

    public static void main(String[] args) {

        ARList<Integer> intList = new ARList<>();
        intList.addLast(1);
        intList.addLast(2);
        intList.addLast(3);

        // naked enhanced for loop
        Iterator<Integer> iter = intList.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println();

        // enhanced for loop / for-each loop
        for(int item : intList) {
            System.out.println(item);
        }
        System.out.println();

    }
}
