import java.util.Iterator;

public class ARDeque<T> implements Deque<T>, Iterable<T> {
    private T[] items;
    private int size;
    private int nextFirst;
    private int nextLast;

    /**
     * @return the size of the array used in the deque.
     */
    public int itemsLength() {
        return items.length;
    }

    @Override
    public void addLast(T item) {

    }

    @Override
    public void printDeque() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void addFirst(T item) {

    }

    @Override
    public T delFirst() {
        return null;
    }

    @Override
    public T delLast() {
        return null;
    }

    /**
     * @return the number of items in the deque.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * @return true if deque is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    /*
     ***** HELPER METHODS START *****
     */

    // add your own helper methods here
	
	
	
	
	// INCLUDE in your submission
	// if you use them in your method

    /*
     ***** HELPER METHODS END *****
     */
	 
	 
	// add your own ARDeque codes from previous labs
	
	
	
	
	
	// EXERCISE 10.3  ITERATOR

    /**
     * Make an iterator
     */
    @Override
    public Iterator<T> iterator() {
        return new ARDequeIterator();
    }

    private class ARDequeIterator implements Iterator<T> {
        private int index;
        private int count;

        public ARDequeIterator() {
            index = plusOne(nextFirst);
            count = 0;
        }

        @Override
        public boolean hasNext() {
            return count < size;
        }

        @Override
        public T next() {
            T item = items[index];
            index = plusOne(index);
            count++;
            return item;
        }

        private int plusOne(int index) {
            return (index + 1) % items.length;
        }
    }

}