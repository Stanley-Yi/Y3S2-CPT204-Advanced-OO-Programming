// LAB EXERCISE 10.1  DEQUE INTERFACE

// Complete the interface for Deque
// to be implemented by ARDeque

public interface Deque<T> {

    public int size();
    public void addFirst(T element);
    public void addLast(T element);
    public T get(int index);
    public void printDeque();
    public T delFirst();
    public T delLast();

}
