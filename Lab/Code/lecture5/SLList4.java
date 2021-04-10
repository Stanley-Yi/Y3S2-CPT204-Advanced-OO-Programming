public class SLList4<T> {

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
    public SLList4(T item) {
        sentinel = new Node(null, null);
        sentinel.next = new Node(item, null);
        size = 1;
    }

    /** Creates an empty SLList with no item. */
    public SLList4() {
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

    public static void main(String[] args) {
        SLList4<String> listStr = new SLList4<>();
        listStr.addFirst("cd");
        listStr.addFirst("ab");
        System.out.println(listStr.getFirst());

        listStr.addLast("ef");
        System.out.println(listStr.size());

    }
}
