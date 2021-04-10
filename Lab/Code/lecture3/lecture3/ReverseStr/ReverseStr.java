public class ReverseStr {

    /**
     * Reverse the input string.
     * @param str is the input string.
     * @return the reverse of str.
     */
    public static String reverseStr(String str) {
        return reverseStrHelper(str, "");
    }

    private static String reverseStrHelper(String str, String reverse) {
        // base case
        if (str.equals(""))
            return reverse;
        // recursive step
        return reverseStrHelper(str.substring(1), str.charAt(0) + reverse);
    }
}
