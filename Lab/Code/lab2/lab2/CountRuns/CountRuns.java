import java.util.List;

public class CountRuns {

    /**
     * Count the number of runs in a list.
     * For example, countRuns([1, 2, 2, 2, 3]) = 1.
     * @param list is a list of integers.
     * @return the number of runs in list.
     */
    public static int countRuns(List<Integer> list) {


        int runs = 0;
        boolean isRun = false;
        for(int i = 0;i<list.size()-1;i++){
            while(i<list.size()-1&&list.get(i)==list.get(i+1)){
                i++;
                isRun=true;
            }
            if(isRun){
                runs++;
            }

            isRun=false;
        }
        return runs;
    }
}