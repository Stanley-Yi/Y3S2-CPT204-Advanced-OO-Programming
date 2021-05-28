import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearTest {

    @Test
    public void test() {
        boolean ans = LeapYear.isLeapYear(2020);
        assertTrue(ans);

        boolean ans2 = LeapYear.isLeapYear(2019);
        assertFalse(ans2);
    }
	
    
}