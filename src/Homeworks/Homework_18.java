package Homeworks;

import java.util.Scanner;

public class Homework_18 {
    public static void main(String[] args) {

        //   Write a code where it asks user to enter an integer number
        // - Reverse the given number and print the result
        //       - Example input ( 5678 )
        //     - Example output ( 8765 )

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int Number = scan.nextInt();
        //  5678
        int Rev = 0;

        while (Number != 0) {
            Rev = Rev * 10 + Number % 10;  // 0*10+ 5678 %10 =8 //
            Number = Number / 10;               //5678/10=
        }
        System.out.println("Reverse number is  " + Rev);

    }


    }

