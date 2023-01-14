package Day10_NestedLoops;

import java.util.Scanner;

public class Topic1_HA_Calculator {
    public static void main(String[] args) {
        /*
        write a calculator program where it will do following:
        1- User will be asked to make a decision:  1 for Add, 2 for Sub, 3 for Div, 4 for Mult,
        any other numbers to exit.
        2- We should ask for 2 numbers
        3- Perform the calculation
        use while loop
         */

        // create scanner
        //we will read 3 integer values
        // Selection, Number1 and Number2 variables

        Scanner scan = new Scanner(System.in);
        System.out.println("Please make a selection : 1 for Add, 2 for Sub, 3 for Div, 4 for Mult");

        int Selection = scan.nextInt();

        // if selection is 1 or 2 or 3 or 4, do something

//      while (Selection == 1 || Selection ==2 || Selection == 3 || Selection == 4){ <- same with below
        //        1<=Selection<=4


        while (1 <= Selection && Selection <=4){

            System.out.println("Please enter first number");
            int Number1 = scan.nextInt();
            System.out.println("Please enter second number");
            int Number2 = scan.nextInt();
            if (Selection == 1){
                System.out.printf("The result is %d", Number1 + Number2 );
            } else if (Selection == 2){
                System.out.printf("The result is %d", Number1 - Number2 );
            } else if (Selection == 3){
                System.out.printf("The result is %d", Number1 / Number2 );
            } else if (Selection == 4) {
                System.out.printf("The result is %d", Number1 * Number2 );
            }
            System.out.println("");

            System.out.println("Please make a selection : 1 for Add, 2 for Sub, 3 for Div, 4 for Mult");

            Selection = scan.nextInt();


        }

    }
}
