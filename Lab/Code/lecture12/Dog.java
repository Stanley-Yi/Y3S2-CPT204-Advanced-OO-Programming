import java.util.Comparator;

public class Dog implements Comparable<Dog> {

    private String name;
    private int weight;

    public Dog(String n, int w) {
        name = n;
        weight = w;
    }

    /**
     * @param other another Dog
     * @return negative number if this is smaller than other
     *         0 if this equals other
     *         positive number if this is larger than other
     */
    @Override
    public int compareTo(Dog other) {
        return this.weight - other.weight;

    }

    public void bark() {
        System.out.println(name + ": bark!");
    }


    private static class NameComparator implements Comparator<Dog> {
        public int compare(Dog d1, Dog d2) {
            return d1.name.compareTo(d2.name);
        }
    }

    /** Comparator of Dog based on name */
    public static Comparator<Dog> getNameComparator() {
        return new NameComparator();
    }

}
