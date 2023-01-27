package Day16_Methods;

public class Topic3_HA_Methods {
    public static void main(String[] args) {
        SumTwoNumbersandPrintThem(10,20);

        SumTwoNumbersandPrintThem(30,55);
    }


    /// Create a method which takes 2 int as parameter
    /// MethodName SumTwoNumbersandPrintThem
    /// No Return Type
    //public static ReturnType MethodName (Param1Type Param1Name, Param2Type Param2Name........)

    public static void SumTwoNumbersandPrintThem(int Number1, int Number2){
        int Sum = Number1 + Number2;
        System.out.println("Sum = " + Sum);
    }



}
