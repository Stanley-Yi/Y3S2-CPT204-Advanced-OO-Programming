import java.util.List;

public class CountRuns {

    /**
     * Count the number of runs in a list.
     * For example, countRuns([1, 2, 2, 2, 3]) = 1.
     * @param list is a list of integers.
     * @return the number of runs in list.
     */
    public static int countRuns(List<Integer> list) {
        int runs = 0;
        int i = 0;

        while (i < list.size()) {
            int j = i + 1;

            while (j < list.size() && list.get(j).equals(list.get(i))) {
                j ++;
            }

            if (j > i + 1) runs ++;

            i = j;
        }

        return runs;
    }
}