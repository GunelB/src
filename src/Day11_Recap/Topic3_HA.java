package Day11_Recap;

import java.util.Scanner;

public class Topic3_HA {
    public static void main(String[] args) {
//Write a Java program that takes 4 numbers as input to calculate and print the average of the numbers.
    /*
    please enter number 1
    I will enter 10

    please enter number 2
    I will enter 25

    please enter number 3
    I will enter 40

    please enter number 4
    I will enter 50
     */
/*
        Scanner scan = new Scanner(System.in);
        //please enter number 1
        System.out.println("please enter number 1");
        int Number1 = scan.nextInt();

        //please enter number 2
        System.out.println("please enter number 2");
        int Number2 = scan.nextInt();

        //please enter number 3
        System.out.println("please enter number 3");
        int Number3 = scan.nextInt();

        //please enter number 4
        System.out.println("please enter number 4");
        int Number4 = scan.nextInt();

        //average   <- Total / HowManyNumbers
        double Total = Number1+Number2+Number3+Number4;

        double Average = Total / 4;
        System.out.println("Average = " + Average);
*/

        Scanner scan = new Scanner(System.in);
        double Total = 0;
        for(int i=1; i<=4 ; i++ ) {
            System.out.printf("please enter number %d\n",i);
            int Number = scan.nextInt();
            Total = Total + Number;
            /*
            Total = total + Number;
            Total = total + Number;
            Total = total + Number;
            Total = total + Number;
             */
            System.out.println("Total = " + Total);
        }

        double Average = Total / 4;
        System.out.println("Average = " + Average);

    }
}
