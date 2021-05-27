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

    /**
     * do resize for ARBinHeap
     */
    @SuppressWarnings("unchecked")
    private void resize() {
        if (this.isEmpty() || this == null) return;
        if (size >= heap.length / 2) {
            // extend 2 times
            T[] newHeap = (T[]) new Comparable[heap.length * 2];
            for (int i = 1; i <= this.size; i ++) {
                newHeap[i] = heap[i];
            }
            heap = newHeap;
            return;
        }
        if (size <= heap.length / 3) {
            // squeeze to half
            T[] newHeap = (T[]) new Comparable[heap.length / 2];
            for (int i = 1; i <= this.size; i ++) {
                newHeap[i] = heap[i];
            }
            heap = newHeap;
            return;
        }
    }

    private boolean greater(int i, int j) {
        return ((Comparable<T>) heap[i]).compareTo(heap[j]) > 0;
    }

    /**
     * swap two element, according their index
     * @param i index
     * @param j index
     */
    private void swap(int i, int j) {
        T temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    /**
     * make tree balance (top small, bottom big)
     * @param k index
     */
    private void swim(int k) {
        if (k / 2 == 0) return;
        while (k != 1 && greater(k / 2, k)) {
            swap(k, k / 2);
            k = k / 2;
        }
    }

    /**
     * make tree balance
     * @param k index
     */
    private void sink(int k) {
        while (2*k <= size) {
            int j = 2*k;
            if (j < size && greater(j, j+1)) j++;
            if (!greater(k, j)) break;
            swap(k, j);
            k = j;
        }
    }

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
		heap = (T[]) new Comparable[initCapacity + 1];
        size = 0;
    }


    /**
     * Initializes an empty binary heap.
     */
    @SuppressWarnings("unchecked")
    public ARBinHeap() {
        heap = (T[]) new Comparable[2];
		size = 0;
    }


    // LAB EXERCISE 13.2 GETMIN

    /**
     * Returns a smallest item on this binary heap.
     * This binary heap is not empty.
     * @return a smallest item on this binary heap
     */
    @Override
    public T getMin() {
		if (this == null || this.isEmpty()) {
		    return null;
        }
		
        return this.heap[1];
    }


    // LAB EXERCISE 13.3 ADD

    /**
     * Adds a new item to this binary heap.
     * @param item the item to add to this binary heap
     */
    @Override
    public void add(T item) {
		// deal size error
        if (size + 1 > heap.length - 1) {
            this.resize();
        }

		// add function
        this.size ++;
        this.heap[size] = item;

        // deal unbalance
        swim(size);
    }


    // LAB EXERCISE 13.4 DELMIN

    /**
     * Removes and returns a smallest item on this binary heap.
     * This binary heap is not empty.
     * @return a smallest item on this binary heap
     */
    @Override
    public T delMin() {
        if (this == null && this.isEmpty()) return null;

		T delMin = heap[1];
		heap[1] = heap[size];
		size --;

        sink(1);

        return delMin;
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
