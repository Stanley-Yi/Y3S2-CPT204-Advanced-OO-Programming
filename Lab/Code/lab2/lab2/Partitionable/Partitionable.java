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

        int flag = 0;

        for (int i = 0; i < list.size(); i ++) {

            int leftHalf = 0;
            int rightHalf = 0;

            for (int j = 0; j <= i; j ++) {

                leftHalf += list.get(j);

            }

            for (int k = list.size() - 1; k > i; k --) {

                rightHalf += list.get(k);

            }

            if (leftHalf == rightHalf) {

                flag = 1;

            }

        }

        if (flag == 0) {

            return false;

        }
		
        return true;
    }
}