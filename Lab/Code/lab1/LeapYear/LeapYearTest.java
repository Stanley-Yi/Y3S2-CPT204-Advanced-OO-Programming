import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearTest {
	
	@Test
    public void testIsLeapYear(){
	    assertEquals(true, LeapYear.isLeapYear(2000));
    }

    @Test
    public void testIsNotLeapYear(){
        assertEquals(false, LeapYear.isLeapYear(1900));
    }
}