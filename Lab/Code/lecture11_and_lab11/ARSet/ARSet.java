import java.util.Iterator;

public class ARSet<T> implements Iterable<T> {
    private T[] items;
    private int size;

    /**
     * Create an empty set.
     */
    @SuppressWarnings("unchecked")
    public ARSet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    /**
     * @return the number of items in the set
     */
    public int size() {
        return size;
    }

    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    // Copy paste your code from Week 10 here

    public Iterator<T> iterator() {

        return new ARSetIterator();

    }

    private class ARSetIterator implements Iterator<T> {

        private int index;

        public ARSetIterator() {
            this.index = 0;
        }


        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            T result = items[index];
            index ++;

            return result;
        }
    }

    public void add(T item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }

        if (size < 100 && ! this.contains(item)) {
            items[size] = item;
            size ++;
        }

    }

    public boolean contains(T item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < this.size; i++) {
            if (item == this.items[i]) {
                return true;
            }
        }

        return false;
    }

    


    // EXERCISE 11.2  EQUALS

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object that) {
        if (this == that) return true;
		if (that == null) return false;
		if (! (that instanceof ARSet)) return false;

		ARSet<T> thatSet = (ARSet<T>) that;

		if (this.size == thatSet.size) {
		    for (T item : this) {
		        if (! thatSet.contains(item)) {
		            return false;
                }
		        return true;
            }
        }

		return false;
    }
	
}