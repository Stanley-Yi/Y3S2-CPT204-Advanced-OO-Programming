import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class AEDequeIteratorTest {

    @Test
    public void test() {

        ARDeque<String> deque = new ARDeque<>();
        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");

        ARDequeIterator<String> iter = new ARDequeIterator<>(deque);

        while (iter.hasNext()) {
            String str = iter.next();
            System.out.print(str + " ");
        }

    }
}
