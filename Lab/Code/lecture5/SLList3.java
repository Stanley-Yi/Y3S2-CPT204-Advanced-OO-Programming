public class SLList3 {

    private static class Node {
        public int item;
        public Node next;

        public Node(int i, Node n) {
            item = i;
            next = n;
        }
    }

    // The first node at the front of the list is a sentinel node
    // The first item, if it exists, is in the sentinel.next node
    private Node sentinel;
    private int size;

    /** Creates an SLList with one item. */
    public SLList3(int item) {
        sentinel = new Node(0, null);
        sentinel.next = new Node(item, null);
        size = 1;
    }

    /** Creates an empty SLList with no item. */
    public SLList3() {
        sentinel = new Node(0, null);
        size = 0;
    }

    /**
     * Adds a new node with an input item to the front of the list.
     * @param item is an integer.
     */
    public void addFirst(int item) {
        sentinel.next = new Node(item, sentinel.next);
        size += 1;
    }

    /**
     * @return the first item in the front of the SLList.
     */
    public int getFirst() {
        return sentinel.next.item;
    }

    /**
     * Adds item to the end of the list.
     * @param item is an integer.
     */
    public void addLast(int item) {
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
        SLList3 list = new SLList3(10);
        list.addFirst(2);
        list.addFirst(5);
//        System.out.println(list.getFirst());
        list.addLast(25);
//        System.out.println(list.size());

    }

}
