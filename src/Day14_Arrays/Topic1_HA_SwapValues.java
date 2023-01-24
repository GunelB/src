package Day14_Arrays;

public class Topic1_HA_SwapValues {
    public static void main(String[] args) {
        int a = 1;
        int b = 99;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /*
        I want to do something and I want to assign the value of b to a
        and the value of a to be

        a = 7
        b = 5
         */

        // a = 5 and b = 7
        //a = b; // a = 7 and b = 7   we lost 5. this is not correct

        // I need to save 5 in somewhere
        // a = 5 and b = 7
        int temp = a; // a = 5, b = 7, temp = 5;
        a = b;  // a = 7, b= 7, temp = 5
        b = temp; // a = 7, b = 5, temp =5

        /*
        int temp = a
        a = b
        b = temp
         */

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
