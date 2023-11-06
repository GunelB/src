package Day36_InterviewPracticeNumbers;

public class Topic3_HA_SwapNumbers {
    public static void main(String[] args) {
        // Swapping two variables with using the third variable

        /*
        a = 5;
        b = 77;

        int temp = a;
        a = b;
        b = temp;
         */


        // Swapping two variables without using the third variable
        // (a + b) - a = b


        int a = 5;
        int b = 77;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // do something

        // a = 77;
        // b = 5;

        a = a + b;
        // a = 82;
        // b = 77;

        // b = 5;
        b = a - b;
        // a = 82;
        // b = 5;

        // a = 77;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
