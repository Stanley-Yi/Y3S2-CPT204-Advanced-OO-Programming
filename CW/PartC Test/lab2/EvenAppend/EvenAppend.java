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
        Map<String, Integer> numMap = new HashMap<>();
		String result = "";
		int count = 0;
        for (String word : list) {
            if (!numMap.containsKey(word)) {
                numMap.put(word, 1);
            }
            else {
                count = numMap.get(word);
                if (count % 2 == 1) {
                    result += word;
                }
                numMap.put(word, count + 1);
            }
        }
		return result;
    }

}