import java.util.Comparator;

public class DogClient {
    public static void main(String[] args) {

        Dog d1 = new Dog("XiaXue", 20);
        Dog d2 = new Dog("FooDog", 200);
        Dog d3 = new Dog("HellHound", 4444);

        Comparator<Dog> nameComp = Dog.getNameComparator();
        if (nameComp.compare(d1, d2) < 0) {
            d1.bark();
        }
        else {
            d2.bark();
        }
    }
}
