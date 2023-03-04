package Day35_InterviewPractiseString;

public class Topic3_HA_SwapTwoStringWithoutUsingThirdVariable {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Renastech";

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //do something

//        String temp = a;   Swapping two variable with using third variable
//        a = b;
//        b = temp;

        // a = Renastech
        // b = Hello

        // a + b - a = b

        a = a + b;
        // a = HelloRenastech     Length = 14
        // b = Renastech          Length = 9

        // b= Hello

        b = a.substring(0, a.length() - b.length() );

        // a = HelloRenastech   Length = 14
        // b = Hello            Length = 5

        a = a.substring(b.length());
        // a = Renastech
        // b = Hello

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
