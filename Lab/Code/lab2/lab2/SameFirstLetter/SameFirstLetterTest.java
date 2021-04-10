import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.Map.entry;


public class SameFirstLetterTest {

    @Test
    public void testTwoAppends() {
        List<String> list = Arrays.asList("alice", "bob", "apple", "banana");
        Map<String, String> expected = Map.ofEntries(
                entry("a", "alice,apple"),
                entry("b", "bob,banana")
        );
        assertEquals(expected, SameFirstLetter.sameFirstLetter(list));
    }
    @Test
    public void testThreeAppends() {
        List<String> list = Arrays.asList("after", "all", "this", "time", "always");
        Map<String, String> expected = Map.ofEntries(
                entry("a", "after,all,always"),
                entry("t", "this,time")
        );
        assertEquals(expected, SameFirstLetter.sameFirstLetter(list));
    }
    
	
	
	
	
}