import java.util.List;
import java.util.ArrayList;

public class EqualSum {
    
    /**
     * Decide if it is possible to divide the integers in a list into two sets,
     * so that the sums of the two sets are the same.
     * Every integer must be in one set or the other.
     * For example, equalSum([2, 3, 5])  →  true.
     * @param list is a list of integers.
     * @return true iff there are two sets having the same sum.
     */
    public static boolean equalSum(List<Integer> list) {
        // call your recursive helper method
        return equalSumHelper(list, 0, 0, 0);
    }

    private static boolean equalSumHelper(List<Integer> list, int index, int leftSum, int rightSum) { // add any parameters
        // base case
        if (index == list.size()) {
            return leftSum == rightSum;
        }

        // recursive step
        if (equalSumHelper(list, index+1, leftSum + list.get(index), rightSum)) return true;
		if (equalSumHelper(list, index+1, leftSum, rightSum + list.get(index))) return true;
		return false;
    }

}
