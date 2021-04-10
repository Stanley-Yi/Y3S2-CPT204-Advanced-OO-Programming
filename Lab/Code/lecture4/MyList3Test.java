import org.junit.Test;
import static org.junit.Assert.*;

public class MyList3Test {

    @Test
    public void testOfEntriesAndEquals() {
        MyList3 three = new MyList3(3, null);
        MyList3 twoThree = new MyList3(2, three);
        MyList3 oneTwoThree = new MyList3(1, twoThree);

        MyList3 list = MyList3.ofEntries(1, 2, 3);
        assertEquals(oneTwoThree, list);

        MyList3 list2 = MyList3.ofEntries(1, 2, 3);
        assertEquals(list, list2);
        assertEquals(list2, oneTwoThree);

        MyList3 list3 = MyList3.ofEntries(3, 2, 1);
        assertNotEquals(oneTwoThree, list3);
        assertNotEquals(list, list3);
    }

    @Test
    public void testSize() {
        MyList3 list = MyList3.ofEntries(1, 2, 3);
        assertEquals(3, list.iterSize());
        assertEquals(3, list.recSize());
    }

    @Test
    public void testGet() {
        MyList3 list = MyList3.ofEntries(1, 2, 3);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }
}
