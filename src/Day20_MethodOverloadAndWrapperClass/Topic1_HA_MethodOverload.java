package Day20_MethodOverloadAndWrapperClass;

import java.util.Arrays;

public class Topic1_HA_MethodOverload {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        int Sum = Add(a,b);

        System.out.println("Sum = " + Sum);

        double c = 1.1;
        double d = 2.5;

        double Sum2 = Add(c,d);

        System.out.println("Sum2 = " + Sum2);

        int Sum3 = Add(5);

        String s1 = "Test";
        String s2 = "123";

        System.out.println(Add(s1,s2));
    }

    public static int Add(int param1, int param2){ // int int
        return param1 + param2;
    }

    // Method Overload
    // 1 - The method name should be same
    // 2 - parameter signature should be different

    // What is different between method overload and method override
    public static double Add(double number1, double number2){  //double double
        return number1+number2;
    }

    public static int Add(int anything){  // int
        return anything + 1;  //++param1
    }

    public static String Add(String param1, String param2){ //String String
        return param1+param2;
    }
    // The below method overload is not correct as it has same name and same parameter signature.
//    public static String Add(String param1, String param2){ //String String
//        return param1+" "+param2;
//    }
    /*
    private void Add(String param1){ // String

    }

    protected void Add(String s){ //String

    }

     */





}
