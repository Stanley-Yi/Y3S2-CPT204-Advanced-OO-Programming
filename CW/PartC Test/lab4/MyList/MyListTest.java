import org.junit.Test;
import static org.junit.Assert.*;

public class MyListTest {

    // SQUARE TESTS

    @Test
    public void testIterativeSquareMutateMyList() {
        MyList list = MyList.ofEntries(1, 2, 3);
        MyList.iterSquareMutList(list);
        assertEquals(MyList.ofEntries(1, 4, 9), list);
    }

    @Test
    public void testEmptyIterSquareMutate() {
        MyList list = MyList.ofEntries();
        MyList.iterSquareMutList(list);
        assertEquals(MyList.ofEntries(), list);
    }

    @Test
    public void testRecursiveSquareMutateMyList() {
        MyList list = MyList.ofEntries(1, 2, 3);
        MyList.recSquareMutList(list);
        assertEquals(MyList.ofEntries(1, 4, 9), list);
    }

    @Test
    public void testIterativeSquareImmutateMyList() {
        MyList list1 = MyList.ofEntries(1, 2, 3);
        MyList list2 = MyList.iterSquareList(list1);
        assertEquals(MyList.ofEntries(1, 2, 3), list1);
        assertEquals(MyList.ofEntries(1, 4, 9), list2);
    }

    @Test
    public void testRecursiveSquareImmutateMyList() {
        MyList list1 = MyList.ofEntries(1, 2, 3);
        MyList list2 = MyList.recSquareList(list1);
        assertEquals(MyList.ofEntries(1, 2, 3), list1);
        assertEquals(MyList.ofEntries(1, 4, 9), list2);
    }
	
	// add your own test cases
	
	
	
	
	


    // CATENATE TESTS

    // ITER MUTATE

    @Test
    public void testIterativeCatenateMutateMyList() {
        MyList list1 = MyList.ofEntries(1, 2, 3);
        MyList list2 = MyList.ofEntries(4, 5, 6);
        MyList exp = MyList.ofEntries(1, 2, 3, 4, 5, 6);
        assertEquals(exp, MyList.iterCatMutList(list1, list2));
        assertEquals(MyList.ofEntries(1, 2, 3, 4, 5, 6), list1);
    }

    @Test
    public void testEmptyIterMutate() {
        MyList list1 = MyList.ofEntries();
        MyList list2 = MyList.ofEntries();
        MyList exp = MyList.ofEntries();
        assertEquals(exp, MyList.iterCatMutList(list1, list2));
        assertEquals(MyList.ofEntries(), list1);
    }

    @Test
    public void testAEmptyIterMutate() {
        MyList list1 = MyList.ofEntries();
        MyList list2 = MyList.ofEntries(5);
        MyList exp = MyList.ofEntries(5);
        assertEquals(exp, MyList.iterCatMutList(list1, list2));
        assertEquals(MyList.ofEntries(), list1);
    }

    @Test
    public void testBEmptyIterMutate() {
        MyList list1 = MyList.ofEntries(5);
        MyList list2 = MyList.ofEntries();
        MyList exp = MyList.ofEntries(5);
        assertEquals(exp, MyList.iterCatMutList(list1, list2));
        assertEquals(MyList.ofEntries(5), list1);
    }
	
	// add your own test cases
	
	
	
	
	
	
    // REC MUTATE

    @Test
    public void testRecursiveCatenateMutateMyList() {
        MyList list1 = MyList.ofEntries(1, 2, 3);
        MyList list2 = MyList.ofEntries(4, 5, 6);
        MyList exp = MyList.ofEntries(1, 2, 3, 4, 5, 6);
        assertEquals(exp, MyList.recCatMutList(list1, list2));
        assertEquals(MyList.ofEntries(1, 2, 3, 4, 5, 6), list1);
    }
	
	// add your own test cases
	
	
	
	
	

    // ITER IMMUTATE

    @Test
    public void testIterativeCatenateImmutateMyList() {
        MyList list1 = MyList.ofEntries(1, 2, 3);
        MyList list2 = MyList.ofEntries(4, 5, 6);
        MyList exp = MyList.ofEntries(1, 2, 3, 4, 5, 6);
        assertEquals(exp, MyList.iterCatList(list1, list2));
        assertEquals(MyList.ofEntries(1, 2, 3), list1);
    }
	
	// add your own test cases
	
	
	

    
    
    // REC IMMUTATE

    @Test
    public void testRecursiveCatenateImmutateMyList() {
        MyList list1 = MyList.ofEntries(1, 2, 3);
        MyList list2 = MyList.ofEntries(4, 5, 6);
        MyList exp = MyList.ofEntries(1, 2, 3, 4, 5, 6);
        assertEquals(exp, MyList.recCatList(list1, list2));
        assertEquals(MyList.ofEntries(1, 2, 3), list1);
    }

    // add your own test cases
	
	
	
	


}
