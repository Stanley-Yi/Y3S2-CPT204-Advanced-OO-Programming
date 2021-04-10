import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class EvenAppend {

    /**
     * Append words that appear the 2nd, 4th, 6th, etc. time in a list.
     * For example, evenAppend(["a", "b", "b", "a", "a", "b", "b"]) → "bab".
     * @param list is a list of words.
     * @return a concatenation of even appearing words.
     */
    public static String evenAppend(List<String> list) {

        String evenAppear = "";

        Map<String, Integer> counter = new HashMap<>();

        for (String elem : list) {

            if (!counter.containsKey(elem)) {

                counter.put(elem, 1);

            } else {

                counter.put(elem, counter.get(elem) + 1);

                if (counter.get(elem) % 2 == 0) {

                    evenAppear += elem;

                }

            }

        }

        return evenAppear;
    }

}