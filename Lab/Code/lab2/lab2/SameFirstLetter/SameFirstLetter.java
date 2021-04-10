import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SameFirstLetter {

    /**
     * Create a map with first letter as key and words with that same
     * first letter separated by comma.
     * For example, numWords(["alice", "bob", "apple", "banana"]) →
     * {"a": "alice,apple", "b": "bob,banana"}.
     * @param list is a list of strings.
     * The strings are non-empty.
     * @return a map with first letter and comma-separated-words pair.
     */
    public static Map<String, String> sameFirstLetter(List<String> list) {

        Map<String, String> sameLetter = new HashMap<>();

        for (String elem : list) {

            char charArray = elem.charAt(0);
            String firstLetter = String.valueOf(charArray);

            if (!sameLetter.containsKey(firstLetter)) {

                sameLetter.put(firstLetter, elem);

            } else {

                String value = sameLetter.get(firstLetter);
                value = value + "," + elem;
                sameLetter.put(firstLetter, value);

            }

        }
		
		return sameLetter;
    }

}