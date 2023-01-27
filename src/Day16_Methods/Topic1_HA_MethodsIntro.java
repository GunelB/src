package Day16_Methods;

public class Topic1_HA_MethodsIntro {
    public static void main(String[] args) {
 /*
            Define 2 numbers and print sum of them
            define a string variable and print lowercase of it.
            define 2 numbers and print numbers from 1 to sum of them.
            define another string and print lowercase of it
         */

        int a = 5;
        int b = 7;

        System.out.println(a+b);

        //String s1 = "Hello";
        //System.out.println(s1.toLowerCase());
        PrintLowercaseHello();

        //int c = 11;
        //int d = 2;



        int sum = AddTwoNumbers();
        for (int i = 1; i <=sum ; i++) {
            System.out.println(i);
        }

        //String s1 = "Hello";
        //System.out.println(s1.toLowerCase());
        PrintLowercaseHello();

        String s2 = "Whatever";
        System.out.println(s2.toLowerCase());
    }

    // public static ReturnType MethodName (){}
    public static void PrintLowercaseHello (){
        String MyString = "Hi";
        System.out.println(MyString.toUpperCase());
    }

    ///Create a method and this method should return an int
    ///Method name = AddTwoNumbers

    // public static ReturnType MethodName (){}
    public static int AddTwoNumbers(){
        int k = 3;
        int j = 2;
        int result = k + j;
        return result;
    }



}
