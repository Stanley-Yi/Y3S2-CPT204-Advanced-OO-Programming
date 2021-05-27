import org.junit.Test;
import static org.junit.Assert.*;

public class ARBinHeapTest {

    @Test
    public void testEXERCISE() {

        ARBinHeap<Integer> pq = new ARBinHeap<>();
        assertTrue(pq.isEmpty());
        assertEquals(0, pq.size());
        pq.add(6);
        pq.add(3);
        pq.add(9);
        assertEquals(3, (int)pq.getMin());
        pq.add(7);
        pq.add(5);
        pq.add(8);
        pq.add(2);

        Object[] arr = pq.toArray();
        for (int i = 1; i <= pq.size(); i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        assertEquals(2, (int)pq.delMin());

        arr = pq.toArray();
        for (int i = 1; i <= pq.size(); i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
         HeapVisualizer.heapVisualize(pq.toArray());
    }
	
	// add your own test cases below


}
