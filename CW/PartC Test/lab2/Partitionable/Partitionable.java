import java.util.List;

public class Partitionable {

    /**
     * Decide whether a list is partitionable.
     * For example, isPartitionable([1, 1, 1, 2, 1]) -> true,
     * and isPartitionable([2, 1, 1, 2, 1]) -> false.
     * @param list is a non-empty list of integers.
     * @return true iff list is partitionable.
     */
    public static boolean isPartitionable(List<Integer> list) {
        int sum = 0;
        int sumLeft = 0;

        for (int i : list) {
            sum += i;
        }

        for (int i = 0; i < list.size(); i ++) {
            sumLeft += list.get(i);

            if (sumLeft == (sum - sumLeft)) return true;
        }

        return false;
    }
}