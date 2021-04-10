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
		sentinel = new Node(null,null,null);
		sentinel.prev = sentinel;
		sentinel.next = sentinel;
		size = 0;
    }


    // LAB EXERCISE 5.2 ADD TO FRONT

    /**
     * Adds an item of type T to the front of the deque.
     * @param item is a type T object added to the deque.
     */
    public void addFirst(T item) {
        Node newNode = new Node(sentinel, item, sentinel.next);
        sentinel.next.prev = newNode;
        sentinel.next = newNode;
        size++;
    }


    // LAB EXERCISE 5.3 PRINT ITEMS

    /**
     * Prints the items in the deque from first to last,
     * separated by a space, ended with a new line.
     */
    public void printDeque() {
        Node p = sentinel.next;
        while(p != sentinel){
            System.out.print(p.item+" ");
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


    // EXERCISE 5.1 ADD TO BACK

    /**
     * Adds an item of type T to the back of the deque.
     * @param item is a type T object added to the deque.
     */
    public void addLast(T item) {
		Node newNode = new Node(sentinel.prev, item, sentinel);
		sentinel.prev.next = newNode;
		sentinel.prev = newNode;
        size++;
    }


    // EXERCISE 5.2 DELETE FRONT

    /**
     * Deletes and returns the item at the front of the deque.
     * If no such item exists, returns null.
     * @return the first item of the deque, null if it does not exist.
     */
    public T delFirst() {
        if (size == 0) {
            return null;
        }

        Node first = sentinel.next;

        sentinel.next = first.next;
        first.next.prev = sentinel;

        first.next = null;
        first.prev = null;

        size --;

        return first.item;
    }


    // EXERCISE 5.3 DELETE BACK

    /**
     * Deletes and returns the item at the back  of the deque.
     * If no such item exists, returns null.
     * @return the last item of the deque, null if it does not exist.
     */
    public T delLast() {
        if (size == 0) {
            return null;
        }
        Node last = sentinel.prev;
        last.prev.next = sentinel;
        sentinel.prev = last.prev;

        last.prev = null;
        last.next = null;

        size--;
        return last.item;
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
        // base case
//        if (size == 0 || index>=size || index <0) {
//            return null;
//        }
//        if (index == 0) {
//            return this.iterGet(0);
//        }
//
//        // recursive case
//        LLDeque<T> temp = this;
//        T del = temp.delFirst();
//        T result = temp.recGet(index-1);
//        temp.addFirst(del);
//
//        return result;

        // base case
        if (size == 0 || index>=size || index <0) {
            return null;
        }
        if (index == 0) {
            return sentinel.next.item;
        }

        // recursive case
        sentinel = sentinel.next;
        T result = recGet(index-1);
        sentinel = sentinel.prev;

        return result;
    }
	

    public static void main(String[] args) {
        LLDeque<String> list = new LLDeque<>();
      /*  list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");*/
                list.addLast("qq");
                list.addLast("bb");
                System.out.println(list.size());

                list.printDeque();
                //System.out.println(list.iterGet(5));

    }

}
