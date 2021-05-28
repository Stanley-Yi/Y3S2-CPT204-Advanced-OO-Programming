import java.util.ArrayList;

public class MaxAttendance {

    private ALBinHeap<CourseActivity> minPQ1;
    private ALBinHeap<CourseActivity> minPQ2;
	

    // LAB 14 PART B MAX ATTENDANCE

    public MaxAttendance(ArrayList<CourseActivity> activities) {
        this.minPQ1=new ALBinHeap<CourseActivity>();
        this.minPQ2=new ALBinHeap<CourseActivity>();
        for(CourseActivity activity:activities){
            minPQ1.add(activity, activity.getDay() * 100 + activity.getStartTime());
            minPQ2.add(activity,activity.getDay() * 100 + activity.getEndTime());
        }

    }
    public int maxAttendance() {
        int max = 0;
        int tempMax;
        while(!minPQ2.isEmpty()){
            tempMax = 0;
            CourseActivity endActivity = minPQ2.delMin();
            while(!minPQ1.isEmpty() && minPQ1.getMin().getDay() == endActivity.getDay() && minPQ1.getMin().getStartTime() < endActivity.getEndTime()){
                CourseActivity startActivity = minPQ1.delMin();
                tempMax += startActivity.getNumStudents();
            }
            if(tempMax > max)
                max = tempMax;
        }
        return max;
    }

}
