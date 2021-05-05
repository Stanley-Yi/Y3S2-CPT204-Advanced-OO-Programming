public class ARDequeIterator<T> {

    private final ARDeque<T> deque;
    private int index;


    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    // LAB EXERCISE 9.1 CONSTRUCTOR AND HASNEXT

    /**
     * Make an iterator.
     * @param deque deque to iterate over
     */
    public ARDequeIterator(ARDeque<T> deque) {
        this.deque=deque;
        index=0;
    }

    /**
     * Test whether the iterator has more items to return.
     * @return true if next() will return another item,
     *         false if all items have been returned
     */
    public boolean hasNext() {
		return index<deque.size();
    }


    // LAB EXERCISE 9.2 NEXT

    /**
     * Get the next item of the deque.
     * Requires: hasNext() returns true.
     * Modifies: this iterator to advance it to the item
     *           following the returned item.
     * @return next item of the deque
     */
    public T next() {
        final T element = deque.get(index);
        index++;
        return element;
    }


    public static void main(String[] args) {
        ARDeque<String> deque = new ARDeque<>();
        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");

        ARDequeIterator<String> iter = new ARDequeIterator<>(deque);
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.print(str + " ");
        }
        System.out.println();
		
    }
}