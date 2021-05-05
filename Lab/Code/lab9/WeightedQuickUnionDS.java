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
        for (int i = 0; i <N ; i++) {
            parent[i]=-1;
        }
		
    }


    // LAB EXERCISE 9.4 VALIDATE

    /**
     * Validates that p is a valid element/index.
     * @throws IllegalArgumentException if p is not a valid index.
     */
    public void validate(int p) {
        if(p>=parent.length||p<0){
            throw new IllegalArgumentException("p is not a valid index");
        }
    }


    // EXERCISE 9.1  SIZE OF

    /**
     * Returns the size of the set element p belongs to.
     * @param p an element
     * @return the size of the set containing p
     */
    public int sizeOf(int p) {
        while(parent[p]>=0){
            p = parent[p];
        }
        int size = Math.abs(parent[p]);
		return size;
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
        while(parent[p]>=0){
            p = parent[p];
        }
        while(parent[q]>=0){
             q= parent[q];
        }


		return p==q;
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
        validate(p);
        validate(q);
        while(parent[p]>=0){
            p = parent[p];
        }
        while(parent[q]>=0){
            q= parent[q];
        }

        int rootP=p;
        int rootQ=q;

        if (rootP==rootQ){
            return;
        }
        if(parent[rootP]<parent[rootQ]){
            parent[rootP]+=parent[rootQ];
            parent[rootQ]=rootP;
        }else{
            parent[rootQ]+=parent[rootP];
            parent[rootP]=rootQ;
        }
		
		
    }


    public static void main(String[] args) {
        WeightedQuickUnionDS ds = new WeightedQuickUnionDS(19);
        ds.printParent();
        System.out.println(ds.sizeOf(16));
        System.out.println(ds.isConnected(16, 0));
        for(int i=1; i<=15; i+=2) {
            ds.connect(i+1, i);
        }
        ds.printParent();
        System.out.println(ds.isConnected(0, 16));
        System.out.println(ds.isConnected(15, 16));
        System.out.println(ds.sizeOf(0));
        System.out.println(ds.sizeOf(15));
        System.out.println(ds.sizeOf(16));
        for(int i=1; i<=15; i+=2) {
            ds.connect(i+1, i);
        }
        ds.printParent();
        ds.connect(1, 3);
        ds.connect(5, 8);
        ds.connect(10, 11);
        ds.connect(14, 16);
        ds.printParent();
        System.out.println(ds.sizeOf(6));
        System.out.println(ds.sizeOf(13));
        System.out.println(ds.isConnected(1, 8));
        System.out.println(ds.isConnected(11, 15));
        ds.connect(2, 5);
        ds.connect(14, 10);
        System.out.println(ds.isConnected(1, 8));
        System.out.println(ds.isConnected(11, 15));
        ds.printParent();
        System.out.println(ds.sizeOf(2));
        System.out.println(ds.sizeOf(10));
        System.out.println(ds.sizeOf(7));
        System.out.println(ds.sizeOf(3));
        ds.connect(8, 7);
        ds.connect(14, 12);
        ds.printParent();
        System.out.println(ds.isConnected(1, 13));
        ds.connect(14, 2);
        System.out.println(ds.isConnected(13, 1));
        ds.printParent();
        System.out.println(ds.sizeOf(14));
        System.out.println(ds.sizeOf(2));
        ds.connect(0, 14);
        ds.printParent();
        System.out.println(ds.sizeOf(0));
        ds.connect(17, 18);
        ds.connect(16, 17);
        ds.printParent();
        System.out.println(ds.sizeOf(17));


        char text0 = 'a';
        final char text1 = 'b';
        String text2 = text1 + "eiou";
        final String text3 = text2;
        char[] text4 = new char[] { text0, 'e', 'i', 'o', 'u' };
        final char[] text5 = text4;
        
    }

}
