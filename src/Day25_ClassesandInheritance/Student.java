package Day25_ClassesandInheritance;

import java.util.ArrayList;

public class Student {
    // Fields

    String Name;
    String Number;

    ArrayList<Double> HomeworkResults;

    // Create a constructor and initialize everything in there
    public Student(){
        HomeworkResults = new ArrayList<>();
    }

    //AddHomeworkResult : This method will add a result to arraylist
    // Parameters      1 double
    // Return Type  void
    // PublicPrivateProtectedDefault StaticOrNot ReturnType MethodName
    public void AddHomeworkResult(double p_Result){
        HomeworkResults.add(p_Result);
    }

    //GetMean : This method will calculate Mean and return it
    // Parameters  0
    // Return Type double
    // Total / Size

    // PublicPrivateProtectedDefault StaticOrNot ReturnType MethodName
    public double GetMean(){
        double Total = 0;
        for (Double result : HomeworkResults ){
            Total = Total + result;
        }

        return Total / HomeworkResults.size();
    }

}
