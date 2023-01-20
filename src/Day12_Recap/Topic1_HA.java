package Day12_Recap;

import java.util.Random;
import java.util.Scanner;

public class Topic1_HA {
    public static void main(String[] args) {
        /*
        Guessing game
        we will create a random integer between 1-100

        ask user to guess a number
        check the number
        if it is higher than my random value, It is higher, go lower
        if it is lower than my random value, It is lower, go higher
        if user guess the correct number, Congrat!

         */

        /*
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

        //Let say our random value = 35
        Random random = new Random();
        int MyRandomNumber = random.nextInt(100) + 1;
        System.out.println("MyRandomNumber = " + MyRandomNumber);

        //Please enter a number
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Guess = scan.nextInt();

        boolean DidUserGuessIt = false;

        while (DidUserGuessIt == false){
            //if I enter 55
            //It is higher, go lower
            //55 <- Guess
            //35 <- MyRandomNumber
            if (Guess > MyRandomNumber){
                System.out.println("It is higher, go lower");
                DidUserGuessIt = false;
                Guess = scan.nextInt(); //if I enter 40
            } else if (Guess < MyRandomNumber) {
                //if I enter 30
                //It is lower, go higher
                System.out.println("It is lower, go higher");
                DidUserGuessIt = false;
                Guess = scan.nextInt();
            } else {
                //if I enter 35
                //Congrat!
                System.out.println("Congrat!");
                DidUserGuessIt = true;
            }

        }

    }
}
