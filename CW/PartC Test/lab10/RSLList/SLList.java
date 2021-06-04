public class SLList<T> implements ListIF<T> {

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
        size++;
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
    @Override
    public void addLast(T item) {
        Node p = sentinel;
        // Advance p to the end of the list
        while (p.next != null) {
            p = p.next;
        }
        p.next = new Node(item, null);
        size++;
    }

    /* Returns the back node of our list. */
    private Node getLastNode() {
        Node p = sentinel;

        /* Move p until it reaches the end. */
        while (p.next != null) {
            p = p.next;
        }
        return p;
    }

    /**
     * Returns the last item at the back of the list.
     * @return the last item in the list.
     */
    @Override
    public T getLast() {
        Node back = getLastNode();
        return back.item;
    }

    /**
     * Deletes and returns the item at the back of the list.
     * It returns null if the list is empty.
     * @return the last item of the list to be deleted.
     */
    @Override
    public T delLast() {
        Node back = getLastNode();
        if (back == sentinel) {
            return null;
        }

        Node p = sentinel;

        while (p.next != back) {
            p = p.next;
        }
        p.next = null;
        size--;
        return back.item;
    }

    /**
     * Gets the item at the given index in the list.
     * @param i is an index where 0 is the front.
     * @return the ith item in the list.
     */
    @Override
    public T get(int i) {
        return get(i, sentinel.next);
    }

    // recursive helper function
    private T get(int i, Node p) {
        if (i == 0) {
            return p.item;
        }
        return get(i - 1, p.next);
    }

    /**
     * @return the size of the SLList.
     */
    @Override
    public int size() {
        return size;
    }


    @Override
    public void print() {
        Node p = sentinel.next;
        while (p != null) {
            System.out.print(p.item + " ");
            p = p.next;
        }
    }


    public static void main(String[] args) {
        SLList<String> listStr = new SLList<>();
        listStr.addFirst("cd");
        listStr.addFirst("ab");
        System.out.println(listStr.getFirst());

        listStr.addLast("ef");
        System.out.println(listStr.size());

    }
}
