public class QuickFindDS {

    private int[] id;

    /** Construct a new disjoint sets data structure of N elements. */
    public QuickFindDS(int N){
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    /** Connects two elements p and q. */
    public void connect(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++){
            if (id[i] == pid){
                id[i] = qid;
            }
        }
    }

    /** Decides if two elements p and q are connected. */
    public boolean isConnected(int p, int q){
        return (id[p] == id[q]);
    }
}

