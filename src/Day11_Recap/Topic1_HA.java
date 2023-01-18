package Day11_Recap;

import java.util.Scanner;

public class Topic1_HA {
    public static void main(String[] args) {
/*
1- Ask the user to enter his/her birth year (example: 1997, 1980, 1890);
2- Calculate user's age as a new variable
3- If the user is 19 or older print You can buy liquor.
4- If user is younger than 19,
Print you can't buy liquor now, but you can buy (19-userAge) year later.
(Example user is 16 years old, it should say "you can't buy liquor now, but you can buy 3 years later")
 */
        /*
        please enter your birth year
        i will enter 2000
        I need to calculate the age   => Age = 23
        You can buy a liquor.

        please enter your birth year
        i will enter 16
        you can't buy liquor now. But you can buy 3 years later

        please enter your birth year
        i will enter 14
        you can't buy liquor now. But you can buy 5 years later
         */

        //please enter your birth year
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your birth year");

        //i will enter 2000
        int BirthYear = scan.nextInt();

        //I need to calculate the age   => Age = 23
        int Age = 2023 - BirthYear;

        //If the user is 19 or older print You can buy liquor.
        if(Age >= 19){
            System.out.println("You can buy liquor");
        } else {
            //If user is younger than 19,
            //Print you can't buy liquor now, but you can buy (19-userAge) year later.
            //you can't buy liquor now. But you can buy 5 years later
            /*System.out.println("You can't buy liquor now, but you can buy "+(19-Age)+" years later");*/

            System.out.printf("you can't buy liquor now. But you can buy %d years later",19-Age);

        }

    }
}
