public class SLList2 {

    private static class Node {
        public int item;
        public Node next;

        public Node(int i, Node n) {
            item = i;
            next = n;
        }
    }

    // The first node at the front of the list
    private Node first;
    private int size;

    /** Creates an SLList with one item. */
    public SLList2(int item) {
        first = new Node(item, null);
        size = 1;
    }

    /** Creates an empty SLList with no item. */
    public SLList2() {
        first = null;
        size = 0;
    }

    /**
     * Adds a new node with an input item to the front of the list.
     * @param item is an integer.
     */
    public void addFirst(int item) {
        first = new Node(item, first);
        size += 1;
    }

    /**
     * @return the first item in the front of the SLList.
     */
    public int getFirst() {
        return first.item;
    }

    /**
     * Adds item to the end of the list.
     * @param item is an integer.
     */
    public void addLast(int item) {
        if (first == null) {
            first = new Node(item, null);
            return;
        }
        Node p = first;
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
        SLList2 list = new SLList2(10);
        list.addFirst(2);
        list.addFirst(5);
        System.out.println(list.getFirst());
        list.addLast(25);
        System.out.println(list.size());

    }
}
