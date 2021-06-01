import java.util.ArrayList;

public class MaxAttendance {

    private ALBinHeap<CourseActivity> minPQ1;
    private ALBinHeap<CourseActivity> minPQ2;


    // LAB 14 PART B MAX ATTENDANCE

    public MaxAttendance(ArrayList<CourseActivity> activities) {
        this.minPQ1=new ALBinHeap<CourseActivity>();
        this.minPQ2=new ALBinHeap<CourseActivity>();
        for(CourseActivity activity:activities){
            minPQ1.add(activity, activity.getDay()*100+activity.getStartTime());
            minPQ2.add(activity,activity.getDay()*100+activity.getEndTime());
        }

    }
    public int maxAttendance() {
//        int max = 0;
//        int tempMax;
//        while(!minPQ2.isEmpty()){  // n
//            tempMax = 0;
//            CourseActivity endActivity = minPQ2.delMin();
//            ArrayList<CourseActivity> addBackList = new ArrayList<>();
//
//            while(!minPQ1.isEmpty() && minPQ1.getMin().getDay() == endActivity.getDay() && minPQ1.getMin().getStartTime() < endActivity.getEndTime()){
//                CourseActivity startActivity = minPQ1.delMin();
//                tempMax += startActivity.getNumStudents();
//                if(startActivity.getEndTime() > endActivity.getEndTime()) {
//                    addBackList.add(startActivity);
//                }
//            }
//
//            if(!addBackList.isEmpty()){
//                for (CourseActivity addBackActivity : addBackList) {  //
//                    minPQ1.add(addBackActivity,addBackActivity.getDay() * 100 + addBackActivity.getStartTime());
//                }
//            }
//
//            if(tempMax>max) {
//                max = tempMax;
//            }
//
//        }
//
//        return max;

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
