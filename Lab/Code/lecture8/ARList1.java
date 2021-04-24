public class ARList1 {

    private int[] items;
    private int size;

    /** Creates an empty list. */
    public ARList1() {
        items = new int[100];
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
    private void resize(int capacity) {
        int[] a = new int[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    /**
     * Adds item to the end of the list.
     * @param item is an integer.
     */
    public void addLast(int item) {
        if (size == items.length) {
            resize(2 * size);
        }
        items[size] = item;
        size++;
    }

    /**
     * Returns the last item at the back of the list.
     * @return the last integer in the list.
     */
    public int getLast() {
        return items[size - 1];
    }

    /**
     * Gets the item at the given index in the list.
     * @param i is an index where 0 is the front.
     * @return the ith item in the list.
     */
    public int get(int i) {
        return items[i];
    }

    /**
     * Deletes and returns the item at the back of the list.
     * @return the last integer of the list to be deleted.
     */
    public int delLast() {
        int x = getLast();
        size--;
        return x;
    }

}
