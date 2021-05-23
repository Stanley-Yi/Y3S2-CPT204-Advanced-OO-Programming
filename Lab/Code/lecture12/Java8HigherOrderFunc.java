import java.util.function.Function;

public class Java8HigherOrderFunc {
    public static int multByTen(int x) {
        return 10 * x;
    }

    public static int applyTwice(Function<Integer, Integer> f, int x) {
        return f.apply(f.apply(x));
    }

    public static void main(String[] args) {
        int result = applyTwice(Java8HigherOrderFunc::multByTen, 5);
        System.out.println(result);
    }

}
