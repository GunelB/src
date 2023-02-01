package Day19_Methods;

import java.util.Scanner;

public class Topic2_HA_PrimeNumbers {
    public static void main(String[] args) {
/*
Given two numbers  a and b as interval range, the task is to find the prime numbers in between this interval.

Examples:

Input : a = 1, b = 10
Output : 2, 3, 5, 7

1 - no
2 - yes, so print it
3 - yes, so print it
4 - no
5 - yes, so print it
6 - no
7 - yes, so print it
8 - no
9 - no
10 - no

Input : a = 10, b = 20
Output : 11, 13, 17, 19
 */


        /*
        I need to get 2 numbers from user
        start from a up to b, check each number if it is prime
         */

        //I need to get 2 numbers from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a : ");
        int a = scan.nextInt();

        System.out.println("Please enter b : ");
        int b = scan.nextInt();

        //start from a up to b, check if it is prime
        for (int i = a; i <= b; i++) {
            // i need to check if it is prime. If it is prime, i will print it
            // Create a method to check if it is prime
            // Parameters 1 parameter, int
            // ReturnType boolean
            boolean IsItPrimeNumber = CheckPrimeNumber(i);
            //If it is prime, i will print it
            if (IsItPrimeNumber == true){
                System.out.println(i+" is a prime number");
            }

        }
    }


    public static boolean CheckPrimeNumber (int Number){
        // i need to check if it is prime. If yes, return true, if not return false
        // 7
        // 7/1   or 7/7
        /*
        7/2   check the remainder, if it is greater than 0, continue
        7/3   check the remainder, if it is greater than 0, continue
        7/4   check the remainder, if it is greater than 0, continue
        7/5   check the remainder, if it is greater than 0, continue
        7/6   check the remainder, if it is greater than 0, continue

        6/2   check the remainder, it is equals 0, it is not a prime number, stop

        9/2   check the remainder, it is greater than 0, continue
        9/3   check the remainder, it is equals to 0, stop
         */
        boolean IsItPrimeNumber = true;


        /*
        if it is less than and equals 1, it is not a prime number
         */

        if (Number <= 1){
            IsItPrimeNumber = false;
        }

        for (int i = 2; i <= Number - 1 ; i++) {
            int Remainder = Number % i;  // i=2

            if (Remainder == 0){
                IsItPrimeNumber = false;
                break;
            }

        }

        return IsItPrimeNumber;
    }
}
