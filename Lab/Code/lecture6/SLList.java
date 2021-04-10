public class SLList<T> {

    private class Node {
        public T item;
        public Node next;

        public Node(T i, Node n) {
            item = i;
            next = n;
        }
    }

    // The first node at the front of the list is a sentinel node
    // The first item, if it exists, is in the sentinel.next node
    private Node sentinel;
    private int size;

    /*
     * Above is code from last week
     */


//    // Shallow Copy
//    // NOT what we want !
//    public SLList(SLList<T> other) {
//       sentinel = other.sentinel;
//        size = other.size;
//    }

//    /** Creates a (deep) copy SLList of other. */
//    public SLList(SLList<T> other) {
//        sentinel = new Node(null, null);
//        size = 0;
//
//        Node p = sentinel;
//        Node q = other.sentinel;
//        while (q.next != null) {
//            p.next = new Node(q.next.item, null);
//            p = p.next;
//            q = q.next;
//            size += 1;
//        }
//    }

//    /** Creates a (deep) copy SLList of other. */
//    public SLList(SLList<T> other) {
//        this();
//
//        Node q = other.sentinel;
//        while (q.next != null) {
//            this.addLast(q.next.item);
//            q = q.next;
//        }
//    }

//    /**
//     * Creates a deep copy SLList of other.
//     * @param other an SLList object
//     * @throws IllegalArgumentException if other is null
//     */
//    public SLList(SLList<T> other) {
//
//        if (other == null) {
//            throw new IllegalArgumentException("other is null");
//        }
//
//        sentinel = new Node(null, null);
//        size = 0;
//
//        Node p = sentinel;
//        Node q = other.sentinel;
//        while (q.next != null) {
//            this.addLast(q.next.item);
//            q = q.next;
//        }
//    }


    /**
     * Creates a deep copy SLList of other.
     * @param other an SLList object
     * @throws IllegalArgumentException if other is null
     * @throws EmptySLListException if other is empty
     */
    public SLList(SLList<T> other) throws EmptySLListException {

        if (other == null) {
            throw new IllegalArgumentException("other is null");
        }

        if (other.size() == 0) {
            throw new EmptySLListException("other");
        }

        sentinel = new Node(null, null);
        size = 0;

        Node p = sentinel;
        Node q = other.sentinel;
        while (q.next != null) {
            this.addLast(q.next.item);
            q = q.next;
        }
    }


    /*
     * Below is code from last week
     */

    /** Creates an SLList with one item. */
    public SLList(T item) {
        sentinel = new Node(null, null);
        sentinel.next = new Node(item, null);
        size = 1;
    }

    /** Creates an empty SLList with no item. */
    public SLList() {
        sentinel = new Node(null, null);
        size = 0;
    }

    /**
     * Adds a new node with an input item to the front of the list.
     * @param item is an integer.
     */
    public void addFirst(T item) {
        sentinel.next = new Node(item, sentinel.next);
        size += 1;
    }

    /**
     * @return the first item in the front of the SLList.
     */
    public T getFirst() {
        return sentinel.next.item;
    }

    /**
     * Adds item to the end of the list.
     * @param item is an integer.
     */
    public void addLast(T item) {
        Node p = sentinel;
        // Advance p to the end of the list
        while (p.next != null) {
            p = p.next;
        }
        p.next = new Node(item, null);
        size += 1;
    }

    /**
     * @return the size of the SLList.
     */
    public int size() {
        return size;
    }

    /**
     * Prints the items in the deque from first to last,
     * separated by a space, ended with a new line.
     */
    public void printList() {
        Node p = sentinel.next;
        while (p != null) {
            System.out.print(p.item + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        SLList<String> listStr = new SLList<>();
//        listStr.addFirst("c");
//        listStr.addFirst("b");
//        listStr.addFirst("a");
//        listStr.printList();
//        SLList<String> copyListStr = new SLList<>(listStr);
//        copyListStr.printList();
//        System.out.println(copyListStr.size());
//
//        // copyListStr must not change
//        listStr.addFirst("x");
//        listStr.printList();
//        copyListStr.printList();
//        System.out.println(copyListStr.size());
//
//        copyListStr.addFirst("y");
//        listStr.printList();
//        copyListStr.printList();
//        System.out.println(copyListStr.size());

//        // NullPointerException
//        SLList<String> listStr1 = null;
//        SLList<String> listStr2 = new SLList<>(listStr1);
//        listStr2.printList();

//        // Try-Catch IllegalArgumentException
//        SLList<String> listStr1 = null;
//        try {
//            SLList<String> listStr2 = new SLList<>(listStr1);
//        } catch (IllegalArgumentException iae) {
//            System.out.println("Copy failed, " + iae.getMessage());
//        }

        // Try-Catch IllegalArgumentException and EmptySLListException
        SLList<String> listStr1 = new SLList<>();
        try {
            SLList<String> listStr2 = new SLList<>(listStr1);
        } catch (IllegalArgumentException iae) {
            System.out.println("Copy failed, " + iae.getMessage());
        } catch (EmptySLListException ese) {
            System.out.println("Cannot copy, " + ese.getMessage());
        }

    }

}
