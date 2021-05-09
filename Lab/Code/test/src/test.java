import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        final List<Integer> list2 = list1;
        list1.add(300);
        list2.set(3, 400);
    }
}
