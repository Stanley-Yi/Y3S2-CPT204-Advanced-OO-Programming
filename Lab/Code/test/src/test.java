import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int x : list)
            sum += x;
        return sum;
}

    public static int sumOfAbsoluteValues(List<Integer> list) {
    // let's reuse sum() because DRY, so first we take absolute values
        for (int i = 0; i < list.size(); ++i)
            list.set(i, Math.abs(list.get(i)));
        return sum(list);
    }

    public static void main(String[] args) {
        List<Integer> myData = Arrays.asList(-5, -2, -10);
        System.out.println(sumOfAbsoluteValues(myData));
        System.out.println(sum(myData));
    }
}
