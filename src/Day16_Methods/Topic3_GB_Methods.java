package Day16_Methods;

public class Topic3_GB_Methods {
    public static void main(String[] args) {

SumTwoNumbersAndPrintThem(10,20);
SumTwoNumbersAndPrintThem(23,32);
    }
    // public static ReturnType methodName ()
    ///Create a method which takes 2 int as parameter
    ///methodname:  SumTwoNumbers print(instead of void)
    ///no return type(that means void)

    public static void  SumTwoNumbersAndPrintThem(int Number1,int Number2){
        int Sum =Number1+ Number2;
        System.out.println("Sum = " + Sum);

    }
}
