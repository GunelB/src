package Day16_Methods;

public class Topic2_GB_MethodsCont {
    public static void main(String[] args) {
        String MyName ="Eren";
        int MyNewValue = 5;
        int ResultOfTheMethod = MakeItDouble(MyNewValue);
        System.out.println("ResultOfTheMethod = " + ResultOfTheMethod);
        PrintMyNameANdMyAge("Eren,",22);

    }
    ///create a method which not returnin anything
    ///Method name= PrintMyName
    ///it should take a string a parameter
    //public static ReturnType MethodName( ParameterType ParameterName){}
    public static int MakeItDouble (int GivenValue){
       int MyReturnValue= 2*GivenValue;
        return MyReturnValue;
    }
    /// Create a method that returns nothing
    ///method name =PrintMyNameAndMyAge
    ///this method will take 2 parameters.1string and 2 int
    public static void PrintMyNameANdMyAge(String YourName,int YourAge){
        System.out.println("My nameis:" +YourName);
        System.out.printf("I am %d years old",YourAge);
    }

}
