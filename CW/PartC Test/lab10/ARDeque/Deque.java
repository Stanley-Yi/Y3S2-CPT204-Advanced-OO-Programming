// LAB EXERCISE 10.1  DEQUE INTERFACE

// Complete the interface for Deque
// to be implemented by ARDeque

public interface Deque<T> {

    public void addLast(T item);
    public void printDeque();
    public T get(int index);
    public void addFirst(T item);
    public T delFirst();
    public T delLast();
    public int size();

}
