public class HigherOrderFunc {

    public static int applyTwice(IntToIntFuncIF f, int x) {
        return f.func(f.func(x));
    }

    public static void main(String[] args) {
        IntToIntFuncIF multByTen = new MultByTen();
        System.out.println(applyTwice(multByTen, 5));
    }

}
