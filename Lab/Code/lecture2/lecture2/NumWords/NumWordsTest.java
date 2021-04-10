import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.Map.entry;


public class NumWordsTest {

    @Test
    public void testNumWords() {
        List<String> list = Arrays.asList("a", "b", "a", "a", "c", "b");
        Map<String, Integer> expected = Map.ofEntries(
                entry("a", 3),
                entry("b", 2),
                entry("c", 1)
        );
        assertEquals(expected, NumWords.numWords(list));
    }
    @Test
    public void testCandyman() {
        List<String> list = Arrays.asList("Candyman", "Candyman", "Candyman", "Candyman", "Candyman");
        Map<String, Integer> expected = Map.ofEntries(
                entry("Candyman", 5)
        );
        assertEquals(expected, NumWords.numWords(list));
    }
    @Test
    public void testEmptyList() {
        List<String> list = Arrays.asList();
        Map<String, Integer> expected = Map.ofEntries(
        );
        assertEquals(expected, NumWords.numWords(list));
    }
    @Test
    public void testSingletonList() {
        List<String> list = Arrays.asList("always");
        Map<String, Integer> expected = Map.ofEntries(
                entry("always", 1)
        );
        assertEquals(expected, NumWords.numWords(list));
    }
    @Test
    public void testEmptyStringAndNumericKeys() {
        List<String> list = Arrays.asList("123", "", "1", "12", "123", "", "123", "12", "");
        Map<String, Integer> expected = Map.ofEntries(
                entry("", 3),
                entry("1", 1),
                entry("12", 2),
                entry("123", 3)
        );
        assertEquals(expected, NumWords.numWords(list));
    }

}
