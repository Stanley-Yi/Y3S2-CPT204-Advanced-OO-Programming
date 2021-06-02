public class LLDeque<T> {

    private class Node {
        Node prev;
        T item;
        Node next;

        Node(Node p, T i, Node n) {
            prev = p;
            item = i;
            next = n;
        }
    }

    private Node sentinel;
    private int size;

    /**
     * @return the number of items in the deque.
     */
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


    // LAB EXERCISE 5.1 EMPTY CONSTRUCTOR

    /**
     * Creates an empty deque.
     */
    public LLDeque() {
		sentinel = new Node(null, null, null);
		sentinel.next = sentinel;
		sentinel.prev = sentinel;
		size = 0;
    }


    // LAB EXERCISE 5.2 ADD TO FRONT

    /**
     * Adds an item of type T to the front of the deque.
     * @param item is a type T object added to the deque.
     */
    public void addFirst(T item) {
		Node first = new Node(sentinel, item, sentinel.next);
		sentinel.next.prev = first;
		sentinel.next = first;
		size ++;
    }


    // LAB EXERCISE 5.3 PRINT ITEMS

    /**
     * Prints the items in the deque from first to last,
     * separated by a space, ended with a new line.
     */
    public void printDeque() {
		Node p = sentinel;
		for (int i = 1; i <= size; i++) {
		    System.out.print(p.next.item + " ");
		    p = p.next;
        }
		System.out.println();
    }


    // LAB EXERCISE 5.4 ITERATIVE GET ITEM

    /**
     * Gets the item at the given index.
     * If no such item exists, returns null.
     * Does not mutate the deque.
     * @param index is an index where 0 is the front.
     * @return the ith item of the deque, null if it does not exist.
     */
    public T iterGet(int index) {
        if (size == 0 || index < 0 || index >= size) {
            return null;
        }

		Node p = sentinel.next;

		for (int i = 0; i < index; i++) {
            p = p.next;
        }
		return p.item;
    }


    // EXERCISE 5.1 ADD TO BACK

    /**
     * Adds an item of type T to the back of the deque.
     * @param item is a type T object added to the deque.
     */
    public void addLast(T item) {
		Node last = new Node(null, item, null);
		last.prev = sentinel.prev;
		last.next = sentinel;
		sentinel.prev.next = last;
		sentinel.prev = last;
		size ++;
    }


    // EXERCISE 5.2 DELETE FRONT

    /**
     * Deletes and returns the item at the front of the deque.
     * If no such item exists, returns null.
     * @return the first item of the deque, null if it does not exist.
     */
    public T delFirst() {
        if (isEmpty()) return null;
		T first = sentinel.next.item;
		sentinel.next = sentinel.next.next;
		sentinel.next.prev = sentinel;
		size--;
		return first;
    }


    // EXERCISE 5.3 DELETE BACK

    /**
     * Deletes and returns the item at the back  of the deque.
     * If no such item exists, returns null.
     * @return the last item of the deque, null if it does not exist.
     */
    public T delLast() {
        if (isEmpty()) return null;

		T last = sentinel.prev.item;
		sentinel.prev = sentinel.prev.prev;
		sentinel.prev.next = sentinel;
		size--;
		return last;
    }


    // EXERCISE 5.4 RECURSIVE GET ITEM

    /**
     * Gets the item at the given index.
     * If no such item exists, returns null.
     * Does not mutate the deque.
     * @param index is an index where 0 is the front.
     * @return the ith item of the deque, null if it does not exist.
     */
    public T recGet(int index) {
        if (size == 0 || index < 0 || index >= size) {
            return null;
        }
        return recGetHelper(sentinel.next, index);
    }

    // Recursive Get Helper Method
    private T recGetHelper(Node p, int index) {
        if (index == 0) {
            return p.item;
        } else {
            p = p.next;
            return recGetHelper(p, index - 1);
        }
    }
	

    public static void main(String[] args) {
        LLDeque<String> deque = new LLDeque<>();
        deque.addFirst("b");
        deque.addFirst("a");
        deque.printDeque();
    }

}
