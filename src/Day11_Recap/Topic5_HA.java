package Day11_Recap;

import java.util.Scanner;

public class Topic5_HA {
    public static void main(String[] args) {
/*
A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that asks the user to enter three integers as angles and
check whether a triangle is valid or not.

ask user 3 times
angle 1
angle 2
angle 3

also we need to calculate total

at the end check if it is equal to 180
 */
        Scanner scan = new Scanner(System.in);
        int Total = 0;
        for (int i = 1; i <=3 ; i++) {
            System.out.printf("Please enter angle %d\n",i);
            int Angle = scan.nextInt();
            Total = Total + Angle;
        }
        if(Total == 180){
            System.out.println("It is a valid triangle");
        } else {
            System.out.println("It is NOT a valid triangle!");
        }
    }
}
