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
    public ... iterator() {
		
		
		
    }

    private class ARDequeIterator ... {
		
		
		
    }

}