package Day31_Maps;

import java.util.ArrayList;

public class Topic1_HA_IntroToMaps {
    public static void main(String[] args) {
        ArrayList<String> MyEmployeeInformation = new ArrayList<>();

        MyEmployeeInformation.add("Derya");
        MyEmployeeInformation.add("Bali");
        MyEmployeeInformation.add("18");
        MyEmployeeInformation.add("90000");

        PrintEmployee(MyEmployeeInformation);
    }

    //Create a method to show full name and age

    //parameters  1  - ArrayList<String>
    //returntype void
    //PrintEmployee

    //PublicPrivateProtectedDefault StaticOrNot ReturnType MethodName(Param1Type Param1Name,....)

    public static void PrintEmployee(ArrayList<String> p_Information){
        System.out.println("Full name = "+p_Information.get(1)+" "+p_Information.get(2));
        System.out.println("Age = "+p_Information.get(3));
    }
}
