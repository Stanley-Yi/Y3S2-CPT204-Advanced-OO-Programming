/*
 * Lab 14 Part B
 * Class CourseActivity to represent a course activity in a university.
 * A course activity is at least 1 hour long.
 */

public class CourseActivity {

    private String type;            // The type of the course activity.
    private String courseCode;      // The code of the course.
    private int day;                // The day the activity is scheduled on represented in an integer,
                                    //   starting from 1 := Monday until 7 := Sunday.
    private int startTime;          // The starting time of this course activity from 0 to 23.
    private int endTime;            // The ending time of this course activity from 1 to 24.
    private int numStudents;        // The number of students to attend the course activity.
    private String roomCodeNumber;  // The room code number of a lecture hall, a tutorial classroom, or a lab room.

    public CourseActivity(String type, String courseCode, int day, int startTime, int endTime, int numStudents, String roomCodeNumber) {
        this.type = type;
        this.courseCode = courseCode;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numStudents = numStudents;
        this.roomCodeNumber = roomCodeNumber;
    }

    public String getType() {
        return type;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getDay() {
        return day;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public String getRoomCodeNumber() {
        return roomCodeNumber;
    }

}
