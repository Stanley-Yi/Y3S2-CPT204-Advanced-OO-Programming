import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;


public class CountBabaMamaTest {

    @Test
    public void test1() {

        assertEquals(2, CountBabaMama.countBabaMama("aba babaa amama ma"));
    }
    @Test
    public void test2() {

        assertEquals(4, CountBabaMama.countBabaMama("bababamamama"));
    }

    // add your own test cases




}
