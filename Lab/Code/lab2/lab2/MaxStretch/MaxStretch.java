import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxStretch {

    /**
     * Find the largest stretch in a list.
     * For example, maxStretch([8, 5, 1, 2, 3, 4, 5, 10]) = 6.
     * @param list is a list of integers.
     * @return the largest stretch in list.
     */
    public static int maxStretch(List<Integer> list) {
        int max = 0;

        if (!list.isEmpty()){

            List<Integer> maxStretch = new ArrayList<>();

            for (int i = 0; i < list.size(); i ++){

                for (int j = list.size() - 1; j >= i; j --){

                    if (list.get(i).equals(list.get(j))){

                        if (maxStretch.isEmpty()){

                            for (int k = i; k <= j; k ++){

                                maxStretch.add(list.get(k));

                            }

                        } else {

                            if (maxStretch.size() < (j + 1 - i)) {

                                maxStretch.clear();

                                for (int k = i; k <= j; k ++){

                                    maxStretch.add(list.get(k));

                                }

                            }

                        }

                    }

                }

            }

            max = maxStretch.size();

        }
		
        return max;
    }
}