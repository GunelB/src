package Day16_Methods;

import java.util.Arrays;

public class Topic2_HA_MethodsCont {
    public static void main(String[] args) {
        String MyName = "Eren";

        PrintMyName(MyName);

        int MyNewValue = 5;
        int ResultOfTheMethod = MakeItDouble(MyNewValue);

        System.out.println("ResultOfTheMethod = " + ResultOfTheMethod);

        PrintMyNameandMyAge("Eren",22);

        PrintMyNameandMyAge("Oznur", 18);
    }

    ///Create a method which not returning anything
    /// Method name = PrintMyName
    /// it should take a string as parameter

    //public static ReturnType MethodName ( ParameterType ParameterName ){}
    public static void PrintMyName ( String param1  ){
        System.out.println(param1);
    }

    /// create a method that takes 1 int parameter
    /// method name is MakeItDouble
    /// it will return 2* given value (int)

    //public static ReturnType MethodName ( ParameterType ParameterName ){}
    public static int MakeItDouble (int GivenValue){
        int MyReturnValue = 2*GivenValue;

        return MyReturnValue;
    }


    /// Create a method that returns nothing
    /// Method name = PrintMyNameandMyAge
    /// this method will take 2 parameters. 1- String and 2- int

    // public static ReturnType MethodName (Parameter1Type Parameter1Name, Parameter2Type Parameter2Name, ....... )
    public static void PrintMyNameandMyAge(String YourName, int YourAge ){
        System.out.println("Hello, My Name is : "+YourName);
        System.out.printf("I am %d years old\n",YourAge);
        //System.out.println("I am "+YourAge+ "years old");
    }
}
