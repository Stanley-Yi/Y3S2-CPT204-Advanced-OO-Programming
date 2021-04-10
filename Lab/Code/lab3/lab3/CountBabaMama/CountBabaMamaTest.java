import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.Map.entry;


public class CountBabaMamaTest {

	@Test
	public void test1(){
	    String a = "aba babaa amama ma";
	    int expected = 2;
        assertEquals(expected, CountBabaMama.countBabaMama(a));
    }

	@Test
	public void test2(){
		String a = "bababamamama";
		int expected = 4;
		assertEquals(expected, CountBabaMama.countBabaMama(a));
	}
}
