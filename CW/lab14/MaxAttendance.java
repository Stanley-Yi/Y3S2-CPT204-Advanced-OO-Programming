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
        int current = 0;
        int max = 0;
        while(!minPQ1.isEmpty()){
            if((minPQ1.getMin().getDay() * 100 + minPQ1.getMin().getStartTime()) < (minPQ2.getMin().getDay() * 100 + minPQ2.getMin().getEndTime())){
                current = current + minPQ1.getMin().getNumStudents();
                minPQ1.delMin();
            }
            else{
                current = current - minPQ2.getMin().getNumStudents();
                minPQ2.delMin();
            }
            if(max < current){
                max = current;
            }

        }
        return max;
    }

}
