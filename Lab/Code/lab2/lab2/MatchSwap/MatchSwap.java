import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchSwap {

    /**
     * Modify a list of strings such that two strings with same
     * first letter are swapped.
     * For example, matchSwap(["ap", "bp", "cp", "aq", "cq", "bq"]) →
     * ["aq", "bq", "cq", "ap", "cp", "bp"].
     * @param list is a list of strings.
     * The strings are non-empty.
     * @return the modified list.
     */
    public static List<String> matchSwap(List<String> list) {

        List<String> swapedList = new ArrayList<>(list);
		List<Integer> swapedNum = new ArrayList<>();

		for (int i = 1; i < list.size(); i ++) {

		    if (!list.get(i).isEmpty()) {

                String firstLetter_later = String.valueOf(list.get(i).charAt(0));

                for (int j = 0; j < i; j++) {

                    if (!list.get(j).isEmpty()) {

                        String firstLetter_forward = String.valueOf(list.get(j).charAt(0));

                        if (firstLetter_forward.equals(firstLetter_later) && !swapedNum.contains(j)) {

                            swapedNum.add(i);
                            swapedNum.add(j);

                            String temp = list.get(i);
                            swapedList.set(i, list.get(j));
                            swapedList.set(j, temp);

                        }

                    }

                }

            }

        }
		
		return swapedList;
    }

}