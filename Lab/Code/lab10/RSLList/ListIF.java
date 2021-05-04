public interface ListIF<T> {

    public void addLast(T item);
    public T getLast();
    public T delLast();
    public T get(int i);
    public int size();

    default public void print() {
        for (int i = 0; i < size(); i++) {
            System.out.print(get(i) + " ");
        }
    }
}
