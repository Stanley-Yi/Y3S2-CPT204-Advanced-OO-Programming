import java.util.ArrayList;
import java.util.Comparator;

/**
 *  Hash-based Set
 */
public class HASet<T> {

    private static final int DEFAULT_CAPACITY = 16;

    private ArrayList<ArrayList<T>> buckets;
    private int size;

    private int reduce(T item) {
        return Math.floorMod(item.hashCode(), DEFAULT_CAPACITY);
    }

    public HASet() {
        buckets = new ArrayList<>();
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            buckets.add(new ArrayList<>());
        }
        size = 0;
    }

    /**
     * @return the number of items in the set
     */
    public int size() {
        return size;
    }

    /**
     * Checks whether an item is inside the set.
     * @param item to be checked
     * @return true iff the set contains the item
     */
    public boolean contains(T item) {
        if (item == null) {
            return false;
        }
        int index = reduce(item);
        return buckets.get(index).contains(item);
    }


    /**
     * Adds an item into the set if it is not already inside.
     * @param item to be added inside the set.
     * @throws IllegalArgumentException if item is null.
     */
    public void add(T item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }
        if (contains(item)) {
            return;
        }
        int index = reduce(item);
        buckets.get(index).add(item);
        size++;
    }


    // LAB EXERCISE 12.1 COMPARATOR

    private class SizeComparator implements Comparator<HASet<T>> {


        @Override
        public int compare(HASet<T> o1, HASet<T> o2) {
            return o1.size - o2.size;
        }
    }

    /** Comparator of set based on size */
    public SizeComparator getSizeComparator() {

        return new SizeComparator();

    }

}
