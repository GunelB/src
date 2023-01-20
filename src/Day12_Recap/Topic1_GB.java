package Day12_Recap;

import java.util.Random;
import java.util.Scanner;

public class Topic1_GB {
    public static void main(String[] args) {

        Random random = new Random();
        int MyRandomNumber = random.nextInt(100) + 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Guess = scan.nextInt();
        boolean DidUserGuessIt = false;
        while (DidUserGuessIt == false) {
            if (Guess > MyRandomNumber) {
                System.out.println("It is higher,go lower");
                DidUserGuessIt = false;
                Guess = scan.nextInt();
            } else if (Guess < MyRandomNumber) {
                System.out.println("It is lower ,go higher");
                DidUserGuessIt = false;
                Guess = scan.nextInt();

            } else {
                System.out.println("Congrats");
                DidUserGuessIt = true;
            }
        }
    }
}
/*
Guessing game
we will create a random integer between 1-100

ask user to guess a number
check the number
if it is higher than my random value, It is higher, go lower
if it is lower than my random value, It is lower, go higher
if user guess the correct number, Congrat!

 *//*
Let say our random value = 35
Please enter a number
if I enter 55
It is higher, go lower
if I enter 40
It is higher, go lower
if I enter 30
It is lower, go higher
if I enter 35
Congrat!
exit from application
 */
