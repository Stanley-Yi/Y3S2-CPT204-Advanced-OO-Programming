public interface MinPQ<T extends Comparable<T>> {

    void add(T item);

    T getMin();
	
	T delMin();

    boolean isEmpty();
    
    int size();

}
