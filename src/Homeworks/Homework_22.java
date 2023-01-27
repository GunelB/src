package Homeworks;

import java.util.Scanner;

public class Homework_22 {
    public static void main(String[] args) {

      //  A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.Write a program to check given number is an Armstrong number or not
        //enter three integer
        //intfor sum
        //string for equal
        //if or not

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter three digit numbers");
        int Number1 =scan.nextInt();
        int Total= 0;
        int Number2 =Number1;
        while(Number2 > 0){
            int remainder = Number2 %10;
            Total=Total+(remainder*remainder*remainder);
             Number2 = Number2/10;
        }
            System.out.println("Total is  " +Total);
            if(Number1==Total){
                System.out.println("It is an Armstrong number");
            } else {
                System.out.println("It is not an Armstrong number");
            }



    }
}
