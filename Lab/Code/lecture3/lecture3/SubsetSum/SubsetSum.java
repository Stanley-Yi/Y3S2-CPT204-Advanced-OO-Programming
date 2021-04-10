import java.util.List;

public class SubsetSum {
	
    /**
     * Decide whether there is a subset in the input list
     * that adds up to the target sum.
     * For example, subsetSum([2, 5, 8], 10) → true.
     * @param list is the input list.
     * @param sum is the target sum.
     * @return true iff there is a subset of list that adds to sum.
     */
    public static boolean subsetSum(List<Integer> list, int sum) {
        // call your recursive helper method
        return subsetSumHelper(list, 0, sum);
    }

    private static boolean subsetSumHelper(List<Integer> list, int start, int sum) {
        // base case
        if (start == list.size()) {
            // return (sum == 0)
            if (sum == 0) {
                return true;
            }
            return false;
        }
        // recursive step

        if (subsetSumHelper(list, start+1, sum-list.get(start)))
            return true;
        if (subsetSumHelper(list, start+1, sum))
            return true;
        return false;
    }

}
