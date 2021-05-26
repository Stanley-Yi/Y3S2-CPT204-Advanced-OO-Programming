public interface ExpMinPQ<T> {

    void add(T item, int priority);
	
	T getMin();

    T delMin();

    boolean isEmpty();    

    int size();

}
