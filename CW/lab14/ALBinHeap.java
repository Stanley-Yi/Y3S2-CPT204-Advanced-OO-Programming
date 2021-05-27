import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *  ArrayList-based Binary Heap
 */
public class ALBinHeap<T> implements ExpMinPQ<T> {

    private final ArrayList<Node> heap;     // store items at indices 1 to n
    private int size;                       // number of items on binary heap

    /**
     * Represents a value-explicit priority pair.
     */
    private class Node {
        T item;
        int priority;

        Node(T item, int priority) {
            this.item = item;
            this.priority = priority;
        }
    }

    /*
     ********************
     Helper methods start
     ********************
     */

    // INCLUDE ALL YOUR HELPER METHODS
    // IN YOUR LEARNING MALL SUBMISSION !

    @SuppressWarnings("unchecked")
    private void swap(int i, int j) {
        Node temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    private void swim(int k) {
        if (k / 2 == 0) return;
        while (k != 1 && heap.get(k / 2).priority > heap.get(k).priority) {
            swap(k, k / 2);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (2*k <= size) {
            int j = 2*k;
            if (j < size && heap.get(j).priority > heap.get(j + 1).priority) j++;
            if (!(heap.get(k).priority > heap.get(j).priority)) break;
            swap(k, j);
            k = j;
        }
    }

    /*
     ******************
     Helper methods end
     ******************
     */


    // LAB 14 PART A.1 EMPTY CONSTRUCTOR

    /**
     * Initializes an empty binary heap.
     */
    public ALBinHeap() {
        heap = new ArrayList<Node>();
        heap.add(null);
        size = 0;
    }
	
	
	// LAB 14 PART A.2 GETMIN

    /**
     * Returns an item with a smallest priority on this binary heap.
     * @return an item with a smallest priority on this binary heap
     * @throws NoSuchElementException if this binary heap is empty
     */
    @Override
    public T getMin() {
        if (this == null || this.isEmpty()) throw new NoSuchElementException();

        return heap.get(1).item;
    }


    // LAB 14 PART A.3 ADD

    /**
     * Adds a new item with its priority to this binary heap.
     * @param  item the item to add to this binary heap
     * @param priority the priority of the item
     * @throws IllegalArgumentException if item is null
     */
    @Override
    public void add(T item, int priority) {
        if (item == null) throw new IllegalArgumentException();

        // add function
        Node element = new Node(item, priority);
        size ++;
        heap.add(element);

        // deal unbalance
        swim(size);
    }


    // LAB 14 PART A.4 DELMIN

    /**
     * Removes and returns an item with a smallest priority on this binary heap.
     * @return an item with a smallest priority on this binary heap
     * @throws NoSuchElementException if this binary heap is empty
     */
    @Override
    public T delMin() {
        if (this == null || this.isEmpty()) throw new NoSuchElementException();

        T delMin = heap.get(1).item;
        heap.set(1, heap.get(size));
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
		
    @SuppressWarnings("unchecked")
    public T[] toArray() {
        T[] result = (T[]) new Object[size() + 1];
        result[0] = null;
        for (int i = 1; i <= size(); i++) {
            result[i] = heap.get(i).item;;
        }
        return result;
    }

}
