import java.util.ArrayList;
import java.util.List;

public class Hailstone {

    /**
     * Compute a hailstone sequence.
     * For example, hailstone(5) = [5 16 8 4 2 1].
	 * @param n starting number of the sequence. Assume n > 0.
     * @return hailstone sequence starting at n and ending with 1.
     */
    public static List<Integer> hailstone(int n) {
        List<Integer> list = new ArrayList<Integer>();

        while (n != 1) {
            list.add(n);
            if (n % 2 == 0) {
                n = n/2;
            }
			else {
                n = 3*n + 1;
            }
        }
        list.add(n); // adding the final element 1
        return list;
    }

    /**
     * Compute the largest element in a hailstone sequence.
     * For example, maxHailstone(5) = 16.
     * @param n starting number of the sequence. Assume n > 0.
     * @return the largest element the sequence.
     */
    public static int maxHailstone(int n) {
        List<Integer> list = hailstone(n);
        int max = 0;

        for (int item : list) {
            if (item > max) {
                max = item;
            }
        }
		
		return max;
    }

}