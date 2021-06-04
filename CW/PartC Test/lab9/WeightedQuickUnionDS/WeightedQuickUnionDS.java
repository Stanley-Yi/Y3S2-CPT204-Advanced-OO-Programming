public class WeightedQuickUnionDS {

    private int[] parent;

    /*
     * Returns the parent of element p.
     * If p is the root of a tree, returns the negative size
     * of the tree for which p is the root.
     */
    public int parent(int p) {
        return parent[p];
    }

    /* Prints the parents of the elements, separated by a space */
    public void printParent() {
        for (int element : parent) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    /*
     ***** HELPER METHODS START *****
     */

    // Add your own helper methods here
	// INCLUDE your helper methods in your submission !

    private int find(int p) {
        validate(p);
        int root = p;
        while (parent(root) > -1) {
            root = parent(root);
        }
        return root;
    }
	

    /*
     ***** HELPER METHODS END *****
     */


    // LAB EXERCISE 9.3  CONSTRUCTOR

    /**
     * Creates a Disjoint Sets data structure with n elements,
     * 0 through n-1.
     * Initially, each element is in its own set.
     * @param N the number of elements
     */
    public WeightedQuickUnionDS(int N) {
        parent = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = -1;
        }
    }


    // LAB EXERCISE 9.4 VALIDATE

    /**
     * Validates that p is a valid element/index.
     * @throws IllegalArgumentException if p is not a valid index.
     */
    public void validate(int p) {
        if (p < 0 || p >= parent.length) throw new IllegalArgumentException();
    }


    // EXERCISE 9.1  SIZE OF

    /**
     * Returns the size of the set element p belongs to.
     * @param p an element
     * @return the size of the set containing p
     */
    public int sizeOf(int p) {
        validate(p);
        while (parent[p] > -1) {
            p = parent[p];
        }
        return Math.abs(parent[p]);
    }


    // EXERCISE 9.2  IS CONNECTED


    /**
     * Returns true iff elements p and q are connected.
     * @param p an element
     * @param q the other element
     * @return true if p and q are in the same set
     *         false otherwise
     * @throws IllegalArgumentException if p or q is not a valid index.
     */
    public boolean isConnected(int p, int q) {
        validate(p);
        validate(q);

        while (parent[p] > -1) {
            p = parent[p];
        }

        while (parent[q] > -1) {
            q = parent[q];
        }
		return p == q;
    }


    // EXERCISE 9.3  CONNECT

    /**
     * Connects two elements p and q together,
     * by combining the sets containing them.
     * @param p an element
     * @param q the other element
     * @throws IllegalArgumentException if p or q is not a valid index.
     */
    public void connect(int p, int q) {
        if (!isConnected(p, q)) {
            if (sizeOf(p) > sizeOf(q)) {
                parent[find(p)] -= sizeOf(q);
                parent[find(q)] = find(p);
            } else {
                parent[find(q)] -= sizeOf(p);
                parent[find(p)] = find(q);
            }
        }
    }


    public static void main(String[] args) {
        WeightedQuickUnionDS ds = new WeightedQuickUnionDS(4);
        ds.connect(1, 0);
        ds.connect(3, 2);
        ds.connect(3, 1);
        ds.printParent();
    }

}
