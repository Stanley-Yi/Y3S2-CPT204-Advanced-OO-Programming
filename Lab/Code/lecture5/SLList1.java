public class SLList1 {

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

    /** Creates an SLList with one item. */
    public SLList1(int item) {
        first = new Node(item, null);
    }

    /**
     * Adds a new node with an input item to the front of the list.
     * @param item is an integer.
     */
    public void addFirst(int item) {
        first = new Node(item, first);
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
        Node p = first;
        // Advance p to the end of the list
        while (p.next != null) {
            p = p.next;
        }
        p.next = new Node(item, null);
    }

    /**
     * @return the size of the SLList recursively.
     */
    public int size() {
        return size(first);
    }

    // Recursive size helper method
    private int size(Node p) {
        // base case
        if (p.next == null) {
            return 1;
        }
        // recursive step
        return 1 + size(p.next);
    }

    public static void main(String[] args) {
        SLList1 list = new SLList1(10);
        list.addFirst(2);
        list.addFirst(5);
        int firstItem = list.getFirst();
        System.out.println(firstItem);
        System.out.println(list.size());
    }
}
