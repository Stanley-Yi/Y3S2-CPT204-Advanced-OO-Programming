import org.junit.Test;
import static org.junit.Assert.*;

public class HAMapTest {

    @Test
    public void testHAMap_1() {
        HAMap<String, Integer> map = new HAMap<>();
        assertFalse(map.containsKey("a"));
        map.put("a", 1);
        assertTrue(map.containsKey("a"));
        assertEquals(1, (int) map.get("a"));
        assertEquals(1, map.size());
        map.put("b", 2);
        map.put("c", 3);
        map.remove("a", 1);
        for (String key : map) {
            System.out.println("(" + key + ", " + map.get(key) + ")");
        }
        map.clear();
        assertEquals(0, map.size());
        assertFalse(map.containsKey("b"));
        assertFalse(map.containsKey("c"));
    }

    
	// add your own test cases below
	
	
	
	
	
	
}
