public class Triple<T extends Comparable<T>, S extends Comparable<S>, U extends Comparable<U>>
        implements Comparable<Triple<T, S, U>> {

    private T first;
    private S second;
    private U third;

    public Triple(T firstElement, S secondElement, U thirdElement) {
        first = firstElement;
        second = secondElement;
        third =  thirdElement;
    }

    public T getFirst() { return first; }
    public S getSecond() { return second; }
    public U getThird() { return third; }


    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    // EXERCISE 14.1  COMPARETO

    @Override
    public int compareTo(Triple<T, S, U> other) {
        int cmp1, cmp2;
        cmp1 = first.compareTo(other.first);
        if (cmp1 == 0) {
            cmp2 = second.compareTo(other.second);
            if (cmp2 == 0) {
                return third.compareTo(other.third);
            }
            return cmp2;
        }
        return cmp1;
    }

}