package Day12_Recap;

import java.util.Scanner;

public class Topic2_HA {
    public static void main(String[] args) {
//Create a Java Program to Count Number of Digits in an Integer
        /*
        159 => 3 digits
        123456 => 6 digits
        1 => 1 digits
        0123 => 123 -> 3 digits
        9462135484
         */

        /*
        Number<10 = 1 digit, Number <100 = 2 digits
        159
        159 / 10  = 15 as result and 9 as remainder  <- 15*10 + 9
        15 / 10 = 1 as result and 5 as remainder     <- 1*10 + 5
        1 / 10 = 0 as result and 1 as remainder      <- 0*10 + 1
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Number = scan.nextInt();

        int count = 1;
        // if I enter a number between 0-9 the result of above will be false
        while (Number / 10 > 0){
            count++;
            Number = Number / 10;
        }

        System.out.println("count = " + count);
    }
}
