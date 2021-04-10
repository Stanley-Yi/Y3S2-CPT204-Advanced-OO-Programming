import org.junit.Test;
import static org.junit.Assert.*;

public class SLListTest {

    @Test
    public void testCopyConstructor() throws EmptySLListException {
        SLList<String> list = new SLList<>();
        list.addFirst("a");
        SLList<String> copyList = new SLList<>(list);
        assertEquals("a", copyList.getFirst());
        list.addFirst("x");
        assertEquals("a", copyList.getFirst());
        copyList.addFirst("y");
        assertEquals("x", list.getFirst());
        assertEquals("y", copyList.getFirst());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentExceptionNullCopy() throws EmptySLListException {
        SLList<String> listStr1 = null;
        SLList<String> listStr2 = new SLList<>(listStr1);
    }

}
