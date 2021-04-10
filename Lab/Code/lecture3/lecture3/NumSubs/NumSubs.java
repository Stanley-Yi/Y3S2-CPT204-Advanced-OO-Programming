public class NumSubs {
    /**
     * Compute the number of substrings in an input string
     * without overlapping
     * @param input the input string
     * @param subs the substring, a non-empty string
     * @return the number of substrings
     */
    public static int numSubs(String input, String subs) {
        // base case
        if (input.length()<subs.length()) {
            return 0;
        }

        // recursive step
        if (input.substring(0, subs.length()).equals(subs)) {

            return 1 + numSubs(input.substring(subs.length()), subs);

        }

        return numSubs(input.substring(1), subs);
    }
}
