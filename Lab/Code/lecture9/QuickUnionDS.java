public class QuickUnionDS {

    private int[] parent;

    /** Construct a new disjoint sets data structure of N elements. */
    public QuickUnionDS(int N) {
        parent = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = -1;
        }
    }

    // Finding the root.
    private int find(int p) {
        while (parent[p] >= 0) {
            p = parent[p];
        }
        return p;
    }

    /** Connects two elements p and q. */
    public void connect(int p, int q) {
        int i = find(p);
        int j = find(q);
        parent[i] = j;
    }

    /** Decides if two elements p and q are connected. */
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }
}

