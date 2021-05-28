public class ConcatContain {

    /**
     * Compute the smallest number of times source is concatenated with itself
     * so that the resulting string contains target.
     * For example, For example, source "ab" concatenated 2 times "ab"+"ab"+"ab" into "ababab"
     * contains target "baba".
     * @param source a non-empty string to be concatenated.
     * @param target a non-empty string that can be contained in repeatedly concatenated source.
     * @return the smallest number of times of the concatenation.
     */
    public static int concatContain(String source, String target) {
        String s = source;
        int ans = 0;

        while (s.length() < target.length()) {
            s = s + source;
            ans++;
        }
        if (s.contains(target))
            return ans;
        s = s + source;
        if (s.contains(target))
            return ans+1;

        return -1;
    }

    
}