import org.junit.Test;
import static org.junit.Assert.*;

public class ARListTest {

    @Test
    public void testARList1() {
        ARList1 list = new ARList1();
        assertEquals(0, list.size());
        list.addLast(5);
        list.addLast(2);
        list.addLast(10);
        assertEquals(3, list.size());
        assertEquals(5, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(10, list.get(2));
        assertEquals(10, list.getLast());
        assertEquals(10, list.delLast());
        assertEquals(2, list.delLast());
        assertEquals(5, list.getLast());
    }

    @Test
    public void testARList2() {
        ARList2<String> list = new ARList2<>();
        assertEquals(0, list.size());
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        assertEquals(3, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
        assertEquals("c", list.getLast());
        assertEquals("c", list.delLast());
        assertEquals("b", list.delLast());
        assertEquals("a", list.getLast());
    }
}
