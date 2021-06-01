import org.junit.Test;
import static org.junit.Assert.*;

public class ExtractVowelTest {
    @Test
    public void testExtractVowels() {
        String str = "i love you 3000";
        assertEquals("ioeou", ExtractVowel.extractVowel(str));
        String s = "aiueo";
        assertEquals("aiueo", ExtractVowel.extractVowel(s));
    }
    
	// add your own test cases
	
	
	
}
