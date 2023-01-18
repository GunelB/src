package Day11_Recap;

import java.util.Scanner;

public class Topic2_HA {
    public static void main(String[] args) {
//create a java program that will check if number is divisible by 2 and 5 same time

        /*
        please enter a number
        if I enter 10
        10 is divisible by 2 and 5 same time

        please enter a number
        if I enter 88
        88 is not divisible by 2 and 5 same time
         */

        //please enter a number
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");

        //if I enter 10
        int Number = scan.nextInt();

        //10 is divisible by 2 and 5 same time
        /*
        divisible by 2  <- Number % 2 == 0
        divisible by 5  <- Number % 5 == 0
         */
        if (Number % 2 == 0 && Number % 5 == 0){
            System.out.printf("%d is divisible by 2 and 5 same time",Number);
        } else {
            System.out.printf("%d is not divisible by 2 and 5 same time", Number);
        }

        /*
        Ternary operator <- for lazy people
        (condition) ? the code for true will be here : the code for false will come here

        (Number % 2 == 0 && Number % 5 == 0) ? System.out.printf("%d is divisible by 2 and 5 same time",Number) : System.out.printf("%d is not divisible by 2 and 5 same time", Number);


         */

        boolean CanBeDivided = (Number % 2 == 0 && Number % 5 == 0) ? true : false;


    }
}
