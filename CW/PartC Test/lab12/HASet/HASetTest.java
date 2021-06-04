import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import static org.junit.Assert.*;

public class HASetTest {

    @Test
    public void testSet_1() {
        HASet<String> set = new HASet<>();
        set.add("a");
        assertTrue(set.contains("a"));
        assertEquals(1, set.size());
        assertFalse(set.contains("b"));

        set.add("a");
        assertTrue(set.contains("a"));
        assertEquals(1, set.size());
    }

    @Test
    public void testSet_2() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        List<String> list2 = new ArrayList<>();
        list2.add("a");
        HASet<List<String>> set = new HASet<>();

        set.add(list1);
        set.add(list2);
        assertEquals(1, set.size());

        List<String> list3 = new ArrayList<>();
        list3.add("a");
        assertTrue(set.contains(list3));
    }

    @Test
    public void testComparator_1() {
        Comparator<HASet<String>> sizeComp = new HASet<String>().getSizeComparator();
        HASet<String> set1 = new HASet<>();
        set1.add("a");
        set1.add("b");
        HASet<String> set2 = new HASet<>();
        set2.add("c");
        assertTrue(sizeComp.compare(set1, set2) > 0);
        set2.add("d");
        assertEquals(0, sizeComp.compare(set1, set2));
    }

}
