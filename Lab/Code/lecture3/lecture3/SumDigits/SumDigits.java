public class SumDigits {
    /**
     * Compute the sum of digits of a non-negative int
     * @param n an integer >= 0
     * @return the sum of digits
     */
    public static int sumDigits(int n) {
        // base case
        if (n == 0) {
            return 0;
        }
        // recursive step
        return (n % 10) + sumDigits(n / 10);
    }
}
