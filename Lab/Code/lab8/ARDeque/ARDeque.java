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
	
	
	 /* Resizes the underlying array to the target capacity. */
	@SuppressWarnings("unchecked")
    private void resize(int capacity) {
		T[] a = (T[]) new Object[capacity];

		if (!isEmpty()) {
            if (nextLast > nextFirst) {
                System.arraycopy(items, nextFirst, a, nextFirst, size);
            } else {  // nextLast < nextFirst
                System.arraycopy(items, 0, a, 0, nextLast + 1);
                System.arraycopy(items, nextFirst, a, a.length - items.length + nextFirst, items.length - nextFirst);
                nextFirst = a.length - nextFirst;
            }

            items = a;
        }
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
        items = (T[]) new Object[4];
		nextFirst = items.length - 1;
		nextLast = 0;
		size = 0;
    }


    // LAB EXERCISE 8.2 ADD TO BACK

    /**
     * Adds an item of type T to the back of the deque.
     * @param item is a type T object to be added.
     */
    public void addLast(T item) {
        if (size == items.length) {
            resize(2 * items.length);
            nextLast ++;
            items[nextLast] = item;
            size ++;
        } else {
            if (isEmpty()) {
                items[nextLast] = item;
                size ++;
            }else if (nextLast == items.length - 1) {
                if (size == items.length - 1 && nextFirst == 0) {
                    nextFirst ++;
                }
                nextLast = 0;
                items[nextLast] = item;
                size ++;
            } else {
                if (size == items.length - 1 && nextFirst == nextLast + 1) {
                    if (nextFirst == items.length - 1) {
                        nextFirst = 0;
                    } else {
                        nextFirst ++;
                    }
                }
                nextLast ++;
                items[nextLast] = item;
                size ++;
            }
        }
    }


    // LAB EXERCISE 8.3 PRINT ITEMS

    /**
     * Prints the items in the deque from first to last,
     * separated by a space, ended with a new line.
     */
    public void printDeque() {
		if (nextLast > nextFirst) {
		    for (int i = nextFirst; i <= nextLast; i++) {
		        System.out.print(items[i] + " ");
            }
		    System.out.println();
        } else {
            for (int i = nextFirst; i < items.length; i++) {
                System.out.print(items[i] + " ");
            }
            for (int i = 0; i <= nextLast; i++) {
                System.out.print(items[i] + " ");
            }
            System.out.println();
        }

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
        try {
            if (index <= items.length) {
                index += nextFirst;
                if (index > items.length - 1) {
                    index -= items.length;
                }
            }
            return items[index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
		
		return null;
    }


    // EXERCISE 8.1 ADD TO FRONT

    /**
     * Adds an item of type T to the front of the deque.
     * @param item is a type T object to be added.
     */
    public void addFirst(T item) {

        if (size == items.length) {
            resize(2 * items.length);
            nextFirst = items.length - 1;
            items[nextFirst] = item;
            size ++;
        } else {
            if (isEmpty()) {
                items[nextFirst] = item;
                size ++;
            }else if (nextFirst == 0) {
                if (size == items.length - 1 && nextLast == items.length - 1) {
                    nextLast --;
                }
                nextFirst = items.length - 1;
                items[nextFirst] = item;
                size ++;
            } else {
                if (size == items.length - 1 && nextLast == nextFirst - 1) {
                    if (nextLast == 0) {
                        nextLast = items.length - 1;
                    } else {
                        nextLast --;
                    }

                }
                nextFirst --;
                items[nextFirst] = item;
                size ++;
            }
        }
		
    }


    // EXERCISE 8.2 DELETE FRONT

    /**
     * Deletes and returns the item at the front of the deque.
     * If no such item exists, returns null.
     * @return the first item of the deque, null if it does not exist.
     */
    public T delFirst() {
		if (size != 0) {
		    T first = items[nextFirst];
            if (nextFirst == items.length - 1) {
                nextFirst = 0;
            } else {
                nextFirst ++;
            }
		    size --;
            return first;
        }
		
		return null;
    }


    // EXERCISE 8.3 DELETE BACK

    /**
     * Deletes and returns the item at the back  of the deque.
     * If no such item exists, returns null.
     * @return the last item of the deque, null if it does not exist.
     */
    public T delLast() {
        if (size != 0) {
            T last = items[nextLast];
            if (nextLast == 0) {
                nextLast = items.length - 1;
            } else {
                nextLast --;
            }
            size --;
            return last;
        }

        return null;

    }


    // EXERCISE 8.4 COPY CONSTRUCTOR

    /**
     * Creates a (deep) copy of another Deque object.
     * @param other is another ARDeque<T> object.
     */
    public ARDeque(ARDeque<T> other) {
        this();
		int arraySize = other.itemsLength();
        this.resize(arraySize);

        if (!other.isEmpty()) {
            if (other.nextLast > other.nextFirst) {
                System.arraycopy(other.items, other.nextFirst, this.items, other.nextFirst, other.size);
            } else {  // nextLast < nextFirst
                System.arraycopy(other.items, 0, this.items, 0, other.nextLast + 1);
                System.arraycopy(other.items, other.nextFirst, this.items, other.nextFirst, other.items.length - other.nextFirst);
            }
            this.nextFirst = other.nextFirst;
            this.nextLast = other.nextLast;
            this.size = other.size;
        }
	}


}
