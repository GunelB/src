package Day25_ClassesandInheritance;

import java.util.ArrayList;

public class Students {
    //fields
    String Name;
    String Number;
    ArrayList<Double> HomeworkResults;

    //constructor instead of Arraylist
    public Students() {
        HomeworkResults = new ArrayList<>();

    }

    public void AddHomeworkResult(double p_1) {
        HomeworkResults.add(p_1);
    }

    public double GetMean() {
        double Total = 0;
        for (Double result: HomeworkResults){
            Total = Total+ result;
        }
            return Total / HomeworkResults.size();

    }
}
