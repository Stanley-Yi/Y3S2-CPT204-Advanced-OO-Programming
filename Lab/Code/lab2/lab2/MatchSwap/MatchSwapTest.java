import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;


public class MatchSwapTest {
	
    @Test
    public void testCase_1() {
        List<String> list = Arrays.asList("apple", "avocado");
        List<String> expected = Arrays.asList("avocado", "apple");
        assertEquals(expected, MatchSwap.matchSwap(list));
    }

    @Test
    public void testCase_2() {
        List<String> list = Arrays.asList("ab", "ac", "ad", "ae", "af");
        List<String> expected = Arrays.asList("ac", "ab", "ae", "ad", "af");
        assertEquals(expected, MatchSwap.matchSwap(list));
    }

    @Test
    public void testCase_3() {
        List<String> list = Arrays.asList("ap", "bp", "cp", "aq", "cq", "bq");
        List<String> expected = Arrays.asList("aq", "bq", "cq", "ap", "cp", "bp");
        assertEquals(expected, MatchSwap.matchSwap(list));
    }

    @Test
    public void testCase_4() {
        List<String> list = Arrays.asList("dfg", " ss", "", " dfd", "daa", " ", " ddd");
        List<String> expected = Arrays.asList("daa", " dfd", "", " ss", "dfg", " ddd", " ");
        assertEquals(expected, MatchSwap.matchSwap(list));
    }
	
}