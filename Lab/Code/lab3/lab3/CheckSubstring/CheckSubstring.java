public class CheckSubstring {
	
    /**
     * Check if at least n copies of a substring occur in input string.
     * They may overlap.
     * For example, checkSubstring("ababaxxxaba", "aba", 3) → true
     * @param input is the input string.
     * @param subs is the non-empty substring.
     * @param n is non-negative number of occurrences.
     * @return true iff at least n copies of subs occur in input.
     */
    public static boolean checkSubstring(String input, String subs, int n) {
        // base case
		if (n <= 0)
		    return true;
		if (subs.length() > input.length() && n > 0)
            return false;

        // recursive step
        if (input.substring(0, subs.length()).equals(subs))
            return checkSubstring(input.substring(1), subs, n-1);
        else
            return checkSubstring(input.substring(1), subs, n);
    }
}
