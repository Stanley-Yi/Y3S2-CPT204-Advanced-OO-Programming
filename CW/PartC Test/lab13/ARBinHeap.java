/**
 *  Resizing-array-based Binary Heap
 */
public class ARBinHeap<T extends Comparable<T>> implements MinPQ<T> {

    private T[] heap;     // store items at indices 1 to n
    private int size;     // number of items on binary heap

    /*
     ********************
     Helper methods start
     ********************
     */
	 
	 

    /*
     ******************
     Helper methods end
     ******************
     */


    // LAB EXERCISE 13.1 CONSTRUCTORS

    /**
     * Initializes an empty binary heap with the given initial capacity.
     * @param  initCapacity the initial capacity of this binary heap
     */
    @SuppressWarnings("unchecked")
    public ARBinHeap(int initCapacity) {
		
		
		
    }


    /**
     * Initializes an empty binary heap.
     */
    public ARBinHeap() {
		
		
		
    }


    // LAB EXERCISE 13.2 GETMIN

    /**
     * Returns a smallest item on this binary heap.
     * This binary heap is not empty.
     * @return a smallest item on this binary heap
     */
    @Override
    public T getMin() {
		
		
        return null;
    }


    // LAB EXERCISE 13.3 ADD

    /**
     * Adds a new item to this binary heap.
     * @param item the item to add to this binary heap
     */
    @Override
    public void add(T item) {
		
		
		
    }


    // LAB EXERCISE 13.4 DELMIN

    /**
     * Removes and returns a smallest item on this binary heap.
     * This binary heap is not empty.
     * @return a smallest item on this binary heap
     */
    @Override
    public T delMin() {		
		
		
        return null;
    }


    // DO NOT MODIFY CODE BELOW
    // for testing and visualization

    /**
     * Returns true if this binary heap is empty.
     * @return true if this binary heap is empty;
     *         false otherwise
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * Returns the number of items on this binary heap.
     * @return the number of items on this binary heap
     */
    @Override
    public int size() {
        return size;
    }

    public T[] toArray() {
        return heap;
    }


}
