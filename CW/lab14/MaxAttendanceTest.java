import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class MaxAttendanceTest {

    // Constructs an ArrayList of CourseActivity
	
    private ArrayList<CourseActivity> createSchedule(int[] days, int[] startTimes, int[] endTimes, int[] studentNumbers) {
        ArrayList<CourseActivity> schedule = new ArrayList<>();
        for (int i = 0; i < startTimes.length; i++) {
            schedule.add(new CourseActivity("", "", days[i], startTimes[i], endTimes[i], studentNumbers[i], ""));
        }
        return schedule;
    }

    @Test
    public void testCase() {
        int[] days = {1, 1, 1, 2};
        int[] startTimes = {10, 14, 15, 9};
        int[] endTimes = {11, 16, 17, 11};
        int[] studentNumbers = {10, 25, 15, 35};
        MaxAttendance maxAtt = new MaxAttendance(createSchedule(days, startTimes, endTimes, studentNumbers));
        assertEquals(40, maxAtt.maxAttendance());
    }

    // Add your own test cases
    @Test
    public void testCase01() {
        int[] days = {1, 2, 3};
        int[] startTimes = {9, 9, 9};
        int[] endTimes = {11, 11, 11};
        int[] studentNumbers = {35, 120, 1};

        MaxAttendance maxAtt = new MaxAttendance(createSchedule(days, startTimes, endTimes, studentNumbers));
        assertEquals(120, maxAtt.maxAttendance());
    }

    // Add your own test cases
    @Test
    public void testCase02() {
        int[] days = {1, 1, 1, 1};
        int[] startTimes = {9, 9, 9, 9};
        int[] endTimes = {11, 12, 13, 14};
        int[] studentNumbers = {1, 2, 3, 4};

        MaxAttendance maxAtt = new MaxAttendance(createSchedule(days, startTimes, endTimes, studentNumbers));
        assertEquals(10, maxAtt.maxAttendance());
    }

    @Test
    public void testCase03() {
        int[] days = {1};
        int[] startTimes = {9};
        int[] endTimes = {11};
        int[] studentNumbers = {1};

        MaxAttendance maxAtt = new MaxAttendance(createSchedule(days, startTimes, endTimes, studentNumbers));
        assertEquals(1, maxAtt.maxAttendance());
    }
    @Test
    public void testCase04() {
        int[] days = {1,1,1,2};
        int[] startTimes = { 10,14,15,9};
        int[] endTimes = {11,16,17,11};
        int[] studentNumbers = {10,25,15,35};

        MaxAttendance maxAtt = new MaxAttendance(createSchedule(days, startTimes, endTimes, studentNumbers));
        assertEquals(40, maxAtt.maxAttendance());
    }
    @Test
    public void testCase05() {
        int[] days = {1, 1, 1, 1,1};
        int[] startTimes = {10, 11, 14, 15,15};
        int[] endTimes = {12, 13,16, 17, 18};
        int[] studentNumbers = {30, 15, 25, 15,10};
        MaxAttendance maxAtt = new MaxAttendance(createSchedule(days, startTimes, endTimes, studentNumbers));
        assertEquals(50, maxAtt.maxAttendance());
    }

    @Test
    public void testCase06() {
        int[] days = {1, 1, 1, 1,1, 2, 2, 2, 2};
        int[] startTimes = {10, 11, 14, 15,15,1,2,3,4};
        int[] endTimes = {12, 13,16, 17, 18,23, 5, 5, 5};
        int[] studentNumbers = {30, 15, 25, 15,10, 30, 10, 10, 10};
        MaxAttendance maxAtt = new MaxAttendance(createSchedule(days, startTimes, endTimes, studentNumbers));
        assertEquals(60, maxAtt.maxAttendance());
    }

    @Test
    public void testCase07() {
        int[] days = {1};
        int[] startTimes = {10};
        int[] endTimes = {12};
        int[] studentNumbers = {30};
        MaxAttendance maxAtt = new MaxAttendance(createSchedule(days, startTimes, endTimes, studentNumbers));
        assertEquals(30, maxAtt.maxAttendance());
    }

    @Test
    public void testCase08() {
        int[] days = {1,2,3,4,5,6,7};
        int[] startTimes = {10,11,12,13,14,15,16};
        int[] endTimes = {11,12,13,14,15,16,17};
        int[] studentNumbers = {10,20,30,40,50,60,70};
        MaxAttendance maxAtt = new MaxAttendance(createSchedule(days, startTimes, endTimes, studentNumbers));
        assertEquals(70, maxAtt.maxAttendance());
    }

    @Test
    public void testCase09() {
        int[] days = {1,1,1,1};
        int[] startTimes = {10,11,9,10};
        int[] endTimes = {12,13,12,11};
        int[] studentNumbers = {11,22,33,5};
        MaxAttendance maxAtt = new MaxAttendance(createSchedule(days, startTimes, endTimes, studentNumbers));
        assertEquals(66, maxAtt.maxAttendance());
    }

    @Test
    public void testCase10() {
        int[] days = {1,1,1,1};
        int[] startTimes = {9,10,11,12};
        int[] endTimes = {10,11,12,13};
        int[] studentNumbers = {11,22,33,5};
        MaxAttendance maxAtt = new MaxAttendance(createSchedule(days, startTimes, endTimes, studentNumbers));
        assertEquals(33, maxAtt.maxAttendance());
    }

    @Test
    public void testCase11() {
        int[] days = {1, 1, 1, 1, 1, 1};
        int[] startTimes = {9,9,9,9, 9 ,9};
        int[] endTimes = {10,11,12,13, 14, 15};
        int[] studentNumbers = {1, 2, 3, 4, 5, 6};
        MaxAttendance maxAtt = new MaxAttendance(createSchedule(days, startTimes, endTimes, studentNumbers));
//        assertEquals(21, maxAtt.maxAttendance());
        maxAtt.maxAttendance();
    }
}
