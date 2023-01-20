package Day12_Recap;

import java.util.Scanner;

public class Topic4_GB {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your year of birth");
        int BirthYear = scan.nextInt(); //will enter 88
        int Age =2023-1988;
        int MyLuckyNumber= 7;
        if(Age<18){
            System.out.println("You cannot join");
        } else {
            System.out.println("Enter your lucky number");
            int UsersLuckyNumber= scan.nextInt();
            if (MyLuckyNumber==UsersLuckyNumber){
                System.out.println("You won a million");
            }else{

            }
        }

    }
}
/*
// Lottery - Nested if

Let's create a new Lottery system

1- Ask the user's year of birth and create the user's age as variable//scanner
2- Create a new int variable name it as myLuckyNumber and assign any number you want//int =myLuckyNumber=7
3-Ask user to enter his/her lucky number/sout
4- if the User is 18 years old or older, and the user's luckyNumber and your lucky number is matching Print "Congrats you won 1 milyon$$$$$$$ "
5- if the user is younger than 18 don't ask the user's lucky number and print "You can not join lottery because of your age , Sorry"
6- if the user is 18 years old or older, and the user's lucky number and your lucky number are not matching Print "Please try again"
 */
//if