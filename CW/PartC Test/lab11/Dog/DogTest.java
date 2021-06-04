import org.junit.Test;
import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void testDog_1() {
        Dog d1 = new Dog("Baobei", 5);
        Dog d2 = new Dog("Baobei", 5);
        Dog d3 = new Dog("Jiaozi", 7);
        assertEquals(d1, d2);
        assertNotEquals(d1, d3);
    }
	
	// add your own test cases below
	
	
	
	
	
}
