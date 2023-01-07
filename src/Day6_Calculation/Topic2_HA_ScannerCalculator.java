package Day6_Calculation;

import java.util.Scanner;

public class
Topic2_HA_ScannerCalculator {
    public static void main(String[] args) {
        /*
        let's create a calculator
        lets ask user to enter first number
        lets ask user to enter second number
        lets ask operation
         */

        // create scanner,
        // ask for first number, assign to first number
        // ask for second number and assign it to second number
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number");
        int FirstNumber = scan.nextInt();
        System.out.println("Please enter second number");
        int SecondNumber = scan.nextInt();

        System.out.println("Please choose the operation: \n1 for Multiplication \n2 for division\n3 for addition \n4 for subtraction\n5 for mod ");
        int Operation = scan.nextInt();

        switch (Operation){
            case 1:
                System.out.printf("The result is %d", FirstNumber * SecondNumber);
                break;
            case 2:
                System.out.printf("The result of division is %d", FirstNumber / SecondNumber);
                break;
            case 3:
                System.out.printf("The result of addition is %d", FirstNumber + SecondNumber);
                break;
            case 4:
                System.out.printf("The result of subtraction is %d", FirstNumber - SecondNumber);
                break;
            case 5:
                System.out.printf("The result of mod is %d", FirstNumber % SecondNumber);
                break;
            default:
                System.out.println("Invalid Option");
                break;
                // 10 3   3*3 + 1;
        }


    }
}
