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

    @Override
    public void addFirst(T element) {

    }


    /**
     * @return true if deque is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    public ARDeque() {
        items=(T[])new Object[4];
        size=0;
        nextFirst=2;
        nextLast=3;

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
    @Override
    public void addLast(T item) {
        //if array is full double it
        if (size==items.length)
            resize(2*items.length);

        items[nextLast]=item;
        nextLast=plusOne(nextLast);
        size++;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void printDeque() {

    }

    @Override
    public T delFirst() {
        return null;
    }

    @Override
    public T delLast() {
        return null;
    }

    private void resize(int capacity) {
        T[] newArray=(T[])new Object[capacity];

        int curr =plusOne(nextFirst);
        for (int i = 0; i < size; i++) {

            newArray[i]=items[curr];
            curr=plusOne(curr);
        }

        items=newArray;
        nextFirst=capacity-1;
        nextLast=size;

    }



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
            T returnItem = items[index];
            index = plusOne(index);
            count++;
            return returnItem;
        }
    }

    private int plusOne(int index) {
        return (index + 1) % items.length;
    }

    public static void main(String[] args) {
        ARDeque<String> deque = new ARDeque<>();
        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");
        for (String item : deque) {
            System.out.print(item + " ");
        }
    }

}