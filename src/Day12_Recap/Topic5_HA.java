package Day12_Recap;

public class Topic5_HA {
    public static void main(String[] args) {
//Create a Java Program to Display Alphabets (A to Z) using loop

        /*
        A
        B
        C
        D
        ....
         */
        // primitive type casting
        /*
        int a = 65;
        char ch = (char)a;

        byte b =  (byte) a;
        char ch2 = (char) b;

         */


        for (int i = 65; i <= 90 ; i++) {
            char MyChar = (char) i;
            System.out.println(MyChar);
        }

        //Create a Java Program to Display Alphabets (a to z) using loop

        for (int i = 97; i <= 122 ; i++) {
            char MyChar = (char) i;
            System.out.println(MyChar);
        }
    }
}
