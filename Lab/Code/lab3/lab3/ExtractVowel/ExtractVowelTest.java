import org.junit.Test;
import static org.junit.Assert.*;

public class ExtractVowelTest {
    @Test
    public void testExtractVowels() {
        String str = "i love you 3000";
        assertEquals("ioeou", ExtractVowel.extractVowel(str));
    }
    
	// add your own test cases

    @Test
    public void testExtractVowels1() {
        String str = "aiueo";
        assertEquals("aiueo", ExtractVowel.extractVowel(str));
    }
	
}
