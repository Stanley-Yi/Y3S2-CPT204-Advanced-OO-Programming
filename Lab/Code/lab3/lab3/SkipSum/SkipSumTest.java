import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SkipSumTest {

    @Test
    public void test1(){
        assertTrue(SkipSum.skipSum(Arrays.asList(2, 5, 10, 6), 12));
    }

    @Test
    public void test2(){
        assertFalse(SkipSum.skipSum(Arrays.asList(2, 5, 10, 6), 7));
    }

    @Test
    public void test3(){
        assertFalse(SkipSum.skipSum(Arrays.asList(2, 5, 10, 6), 16));
    }
}
