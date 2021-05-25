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
        for (int i = 0; i < N; i ++) {
            parent[i] = -1;
        }
		
    }


    // LAB EXERCISE 9.4 VALIDATE

    /**
     * Validates that p is a valid element/index.
     * @throws IllegalArgumentException if p is not a valid index.
     */
    public void validate(int p) {
        if (p >= parent.length || p < 0) {
            throw new IllegalArgumentException();
        }
    }


    // EXERCISE 9.1  SIZE OF

    /**
     * Returns the size of the set element p belongs to.
     * @param p an element
     * @return the size of the set containing p
     */
    public int sizeOf(int p) {
        int num = p;
        while (parent[num] >= 0) {
            num = parent[num];
        }
        return Math.abs(parent[num]);
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
        if (p >= parent.length || p < 0 || q >= parent.length || q < 0) {
            throw new IllegalArgumentException();
        }

        int qNum = q;
        int pNum = p;

        while (parent[pNum] >= 0) {
            pNum = parent[pNum];
        }

        while (parent[qNum] >= 0) {
            qNum = parent[qNum];
        }

        return pNum == qNum;
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
        if (p >= parent.length || p < 0 || q >= parent.length || q < 0) {
            throw new IllegalArgumentException();
        }

        if (!isConnected(p, q)) {
            if (sizeOf(p) <= sizeOf(q)) {
                // connecting p's root to q's root
                int pNum = p;
                int qNum = q;

                while (parent[pNum] >= 0) {
                    pNum = parent[pNum];
                }

                while (parent[qNum] >= 0) {
                    qNum = parent[qNum];
                }

                parent[qNum] -= sizeOf(p);
                parent[pNum] = qNum;
            } else {
                int pNum = p;
                int qNum = q;

                while (parent[pNum] >= 0) {
                    pNum = parent[pNum];
                }

                while (parent[qNum] >= 0) {
                    qNum = parent[qNum];
                }

                parent[pNum] -= sizeOf(q);
                parent[qNum] = pNum;
            }
        }
		
    }


    public static void main(String[] args) {
        WeightedQuickUnionDS ds = new WeightedQuickUnionDS(4);
        ds.connect(1, 0);
        ds.connect(3, 2);
        ds.connect(3, 1);
        ds.printParent();
        System.out.println(ds.sizeOf(0));
    }

}
