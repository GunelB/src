package Day11_Recap;

import java.util.Scanner;

public class Topic4_HA {
    public static void main(String[] args) {
//Write a program that asks the user to enter a number and displays the absolute value of that number.
    /*
    Absolute Value of a number
    4 <= 4
    -9 <= 9

    |4|
    |-9|

    -11 * -1 = 11

    I need to get a value from user
    check if it negative, then multiply with -1
     */
        
    //I need to get a value from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Number = scan.nextInt();
        
        //check if it negative, then multiply with -1
        if (Number < 0){
            Number = Number * -1;
            System.out.println("Number = " + Number);
        }else {
            System.out.println("Number = " + Number);
        }
        

    }
}
