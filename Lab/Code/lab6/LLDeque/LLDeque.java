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

    public LLDeque() {
        sentinel = new Node(null,null,null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    // EXERCISE 6.1 COPY CONSTRUCTOR

    /**
     * Creates a (deep) copy of another Deque object.
	 * @param other is another LLDeque<T> object.
     */
    public LLDeque(LLDeque<T> other) {
		this();

		Node p = sentinel;
        Node q = other.sentinel.next;

        while (q != other.sentinel) {
            p.next = new Node(p, q.item, null);
            q = q.next;
            p = p.next;
            size ++;
        }
        p.next = sentinel;
    }


    // EXERCISE 6.2 ADD NOT NULL TO FRONT

    /**
     * Adds an non-null item of type T to the front of the deque.
     * @param item is a type T object.
     * @throws IllegalArgumentException if the item is null.
     */
    public void addFirst(T item) {
		if (item == null) {
		    throw new IllegalArgumentException();
        } else {
            Node newNode = new Node(sentinel, item, sentinel.next);
            sentinel.next.prev = newNode;
            sentinel.next = newNode;
            size++;
        }

    }


    // EXERCISE 6.3 ADD LEGAL ITEM TO FRONT

    /**
     * Adds the first item of type T to the front of the deque,
     * or the second item of type T instead if the first item is illegal.
     * @param item1 is a type T object.
     * @param item2 is a type T object.
     */
    public void addLegalFirst(T item1, T item2) {
		try {
		    this.addFirst(item1);
        } catch (IllegalArgumentException e) {
		    this.addFirst(item2);
        }
    }
	
	
	
	
    /*
     *************************************************************
     * You can copy paste Lab 5 codes below if you want to use it
     *************************************************************
     */

    public T iterGet(int index) {
        if (index<0 || index>=size || size == 0) {
            return null;
        }
        Node p = sentinel.next;
        while (index != 0) {
            p = p.next;
            index --;
        }
        return p.item;
    }

    public void addLast(T item) {
        Node newNode = new Node(sentinel.prev, item, sentinel);
        sentinel.prev.next = newNode;
        sentinel.prev = newNode;
        size++;
    }



    public void printDeque() {
        Node p = sentinel.next;
        while(p != sentinel){
            System.out.print(p.item+" ");
            p = p.next;
        }
        System.out.println();
    }
}
