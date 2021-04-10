import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;


public class SubsetSumTest {

    @Test
    public void testTrueSubsetSum() {
        List<Integer> list = Arrays.asList(2, 5, 8);
        assertEquals(true, SubsetSum.subsetSum(list, 7));
        assertEquals(true, SubsetSum.subsetSum(list, 8));
        assertEquals(true, SubsetSum.subsetSum(list, 10));
        assertEquals(true, SubsetSum.subsetSum(list, 13));
        assertEquals(true, SubsetSum.subsetSum(list, 15));
        assertEquals(true, SubsetSum.subsetSum(list, 0));
    }
    @Test
    public void testFalseSubsetSum() {
        List<Integer> list = Arrays.asList(2, 5, 8);
        assertEquals(false, SubsetSum.subsetSum(list, 1));
        assertEquals(false, SubsetSum.subsetSum(list, 12));
        assertEquals(false, SubsetSum.subsetSum(list, 14));
        assertEquals(false, SubsetSum.subsetSum(list, 16));
    }
    @Test
    public void testEmptyList() {
        List<Integer> list = Arrays.asList();
        assertEquals(true, SubsetSum.subsetSum(list, 0));
        assertEquals(false, SubsetSum.subsetSum(list, 1));
    }
    @Test
    public void testSingletonList() {
        List<Integer> list = Arrays.asList(1);
        assertEquals(true, SubsetSum.subsetSum(list, 0));
        assertEquals(true, SubsetSum.subsetSum(list, 1));
        assertEquals(false, SubsetSum.subsetSum(list, 2));
    }
    @Test
    public void testManyElms() {
        List<Integer> list = Arrays.asList(-10, 10, 0, 0, -1, 1);
        assertEquals(true, SubsetSum.subsetSum(list, 0));
        assertEquals(true, SubsetSum.subsetSum(list, 1));
        assertEquals(true, SubsetSum.subsetSum(list, -1));
        assertEquals(true, SubsetSum.subsetSum(list, -11));
        assertEquals(false, SubsetSum.subsetSum(list, -12));
    }

}
