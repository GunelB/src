package Day12_Recap;

import java.util.Scanner;

public class Topic4_HA {
    public static void main(String[] args) {
/*
// Lottery - Nested if

Let's create a new Lottery system

1- Ask the user's year of birth and create the user's age as variable
2- Create a new int variable name it as myLuckyNumber and assign any number you want (or Random)
3- Ask user to enter his/her lucky number
4- if the User is 18 years old or older, and the user's luckyNumber and your lucky number is matching Print "Congrats you won 1 milyon$$$$$$$"
5- if the user is younger than 18 don't ask the user's lucky number and print "You can not join lottery because of your age , Sorry"
6- if the user is 18 years old or older, and the user's lucky number and your lucky number are not matching Print "Please try again"
 */

        /*
        Please enter your year of birth
        I will enter 1988
        After I enter my birth year, the value of Age = 35      2023-Birth year -> 2023-1988 = 35
        myLuckyNumber = 7
        if the age is less than 18, print "You can not join lottery because of your age , Sorry"
        if the age is greater than or equal 18, Ask user to enter his/her lucky number
            I will check myluckynumber and user's luckynumber
            if it is equal, "Congrats you won 1 million$$$$$$$"
            if it is not equal "Please try again"
         */

        //Please enter your year of birth
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your year of birth");
        int BirthYear = scan.nextInt();  //I will enter 1988

        //After I enter my birth year, the value of Age = 35      2023-Birth year -> 2023-1988 = 35
        int Age = 2023-BirthYear;

        //myLuckyNumber = 7
        int MyLuckyNumber = 7;

        //if the age is less than 18, print "You can not join lottery because of your age , Sorry"
        if (Age < 18){
            System.out.println("You can not join lottery because of your age , Sorry");
        } else {
           //if the age is greater than or equal 18, Ask user to enter his/her lucky number
            System.out.println("Please enter your lucky number");
            int UsersLuckyNumber = scan.nextInt(); // I got user's lucky number

            //I will check myluckynumber and user's luckynumber
            //if it is equal, "Congrats you won 1 million$$$$$$$"
            if (MyLuckyNumber == UsersLuckyNumber){
                System.out.println("Congrats you won 1 million$$$$$$$");
            } else {
                //if it is not equal "Please try again"
                System.out.println("Please try again");
            }
        }


    }
}
