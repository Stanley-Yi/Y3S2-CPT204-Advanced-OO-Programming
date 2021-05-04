/** SList that recollects the deleted items with
 *  additional operation printDelItems() that
 *  prints all items that have ever been deleted. */
public class RecoSLList<T> extends SLList<T> {
    SLList<T> deletedItems;

    // empty constructor
    public RecoSLList() {
        super();
        deletedItems = new SLList<T>();
    }	
	
	// constructor taking one item
    public RecoSLList(T x) {
		super(x);
        deletedItems = new SLList<T>();
    }

    @Override
    public T delLast() {
        T x = super.delLast();
        deletedItems.addLast(x);
        return x;
    }

    /** Prints deleted items. */
    public void printDelItems() {
        deletedItems.print();
    }

    public static void main(String[] args) {
        RecoSLList<Integer> recolist = new RecoSLList<Integer>();
        recolist.addLast(2);
        recolist.addLast(5);
        recolist.addLast(10);
        recolist.addLast(25);
        // recolist is now: [2, 5, 10, 25]

        recolist.delLast();
        recolist.delLast();
        // After deletion, recolist is: [2, 5]

        // Print the deleted items, namely 25 and 10
        recolist.printDelItems();
    }
} 