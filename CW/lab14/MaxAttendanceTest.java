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
    public void testCase01() {
        int[] days = {1, 1, 1, 2};
        int[] startTimes = {10, 14, 15, 9};
        int[] endTimes = {11, 16, 17, 11};
        int[] studentNumbers = {10, 25, 15, 35};
        MaxAttendance maxAtt = new MaxAttendance(createSchedule(days, startTimes, endTimes, studentNumbers));
        assertEquals(40, maxAtt.maxAttendance());
    }

    // Add your own test cases



}
