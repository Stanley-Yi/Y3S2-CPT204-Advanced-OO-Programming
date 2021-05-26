import org.junit.Test;
import static org.junit.Assert.*;

public class ALBinHeapTest {

    @Test
    public void testCase01() {

        ALBinHeap<String> pq = new ALBinHeap<>();
        assertTrue(pq.isEmpty());
        assertEquals(0, pq.size());
        pq.add("A", 6);
        pq.add("B", 3);
        pq.add("C", 9);
        assertEquals("B", pq.getMin());
        pq.add("D", 7);
        pq.add("E", 5);
        pq.add("F", 8);
        pq.add("G", 2);

        Object[] arr = pq.toArray();
        for (int i = 1; i <= pq.size(); i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();  // G E B D A C F

        assertEquals("G", pq.delMin());

        arr = pq.toArray();
        for (int i = 1; i <= pq.size(); i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();  // B E F D A C
        HeapVisualizer.heapVisualize(pq.toArray());

    }

    // Add your own test cases



}
