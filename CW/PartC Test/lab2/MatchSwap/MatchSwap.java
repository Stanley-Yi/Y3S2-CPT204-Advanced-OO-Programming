import org.junit.Test;

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
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i ++) {
            String str = list.get(i);
            if (map.containsKey(str.substring(0, 1))) {
                int index = map.get(str.substring(0, 1));
                String temp = list.get(index);
                list.set(index, list.get(i));
                list.set(i, temp);
                map.remove(str.substring(0, 1));
            } else {
                map.put(str.substring(0, 1), i);
            }
        }
		
		return list;
    }

}