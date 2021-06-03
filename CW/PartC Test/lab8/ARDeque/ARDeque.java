public class ARDeque<T> {
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
    ******************* HELPER METHODS START *******************
	***** Include your helper method(s) in EACH Submission *****
	*********************** that uses it ***********************
    */

    private int minusOne(int index) {
        return (index - 1 + items.length) % items.length;
    }

    private int plusOne(int index) {
        return (index + 1) % items.length;
    }
	
	
	 /* Resizes the underlying array to the target capacity. */
	@SuppressWarnings("unchecked")
    private void resize(int capacity) {
        T[] newList = (T[]) new Object[capacity];

        int curr = plusOne(nextFirst);
        for (int i = 0; i < size; i++) {
            newList[i] = items[curr];
            curr = plusOne(curr);
        }

        items = newList;
        nextFirst = capacity - 1;
        nextLast = size;
		
    }

    /*
    ******************** HELPER METHODS END ********************
    */


    // LAB EXERCISE 8.1 EMPTY CONSTRUCTOR

    /**
     * Creates an empty deque.
     */
	@SuppressWarnings("unchecked")
    public ARDeque() {
		size = 0;
		items = (T[]) new Object[4];
		nextFirst = 1;
		nextLast = 2;
    }


    // LAB EXERCISE 8.2 ADD TO BACK

    /**
     * Adds an item of type T to the back of the deque.
     * @param item is a type T object to be added.
     */
    public void addLast(T item) {
        if (size == items.length) {
            resize(2 * size);
        }

		size++;
		items[nextLast] = item;
		nextLast = plusOne(nextLast);
    }


    // LAB EXERCISE 8.3 PRINT ITEMS

    /**
     * Prints the items in the deque from first to last,
     * separated by a space, ended with a new line.
     */
    public void printDeque() {
        int i = plusOne(nextFirst);
		for (int j = 0; j < size; j++) {
		    System.out.print(items[i] + " ");
		    i = plusOne(i);
        }
		System.out.println();
		
    }


    // LAB EXERCISE 8.4 GET ITEM

    /**
     * Gets the item at the given index.
     * Does not mutate the deque.
     * @param index is an index where 0 is the front.
     * @return the index-th item of the deque.
     * @throws IndexOutOfBoundsException if no item exists at the given index.
     */
    public T get(int index) {
		if (size == 0 || index < 0 || index >= size) throw new IndexOutOfBoundsException("Index 1 is not valid");

		index = (plusOne(nextFirst) + index) % items.length;
		return items[index];
    }


    // EXERCISE 8.1 ADD TO FRONT

    /**
     * Adds an item of type T to the front of the deque.
     * @param item is a type T object to be added.
     */
    public void addFirst(T item) {
        if (size == items.length) {
            resize(2 * size);
        }

        items[nextFirst] = item;
        size += 1;
        nextFirst = minusOne(nextFirst);
    }


    // EXERCISE 8.2 DELETE FRONT

    /**
     * Deletes and returns the item at the front of the deque.
     * If no such item exists, returns null.
     * @return the first item of the deque, null if it does not exist.
     */
    public T delFirst() {
        if (size == 0) return null;

		size --;
		nextFirst = plusOne(nextFirst);
		T first = items[nextFirst];

		if (size <= items.length / 4) {
		    resize(items.length / 2);
        }

		return first;
    }


    // EXERCISE 8.3 DELETE BACK

    /**
     * Deletes and returns the item at the back  of the deque.
     * If no such item exists, returns null.
     * @return the last item of the deque, null if it does not exist.
     */
    public T delLast() {
		if (size == 0) return null;

		size --;
		nextLast = minusOne(nextLast);
		T last = items[nextLast];

		if (size <= items.length / 4) {
		    resize(items.length / 2);
        }
		return last;
    }


    // EXERCISE 8.4 COPY CONSTRUCTOR

    /**
     * Creates a (deep) copy of another Deque object.
     * @param other is another ARDeque<T> object.
     */
    public ARDeque(ARDeque<T> other) {
		this();
		for (int j = 0; j < other.size; j ++) {
		    this.addLast(other.get(j));
        }
		
	}


}
