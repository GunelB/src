package Homeworks;

import java.util.Scanner;

public class Homework_31 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter 1 for Sum, 2 for Subtraction, 3 Multiplication 4 Division");
        int Number= scan.nextInt();
        System.out.println("Enter first number");
        double x = scan.nextDouble();
        System.out.println("Enter second number");
        double y = scan.nextDouble();
        System.out.println(MyValue( Number,x,y));
        //.   When the integer value is 1 it returns to sum of the 2 double numbers, when integer is 2 it returns the subtraction of those 2 double number, when integer value is 3 it returns to the multiplication of those 2 double numbers, and when the integer value is 4 it returns the division of those 2 double numbers When the integer value is 1 it returns to sum of the 2 double numbers, when integer is 2 it returns the subtraction of those 2 double number, when integer value is 3 it returns to the multiplication of those 2 double numbers, and when the integer value is 4 it returns the division of those 2 double numbers
    }
    public static double MyValue(int value3,double value1,double value2 ){
        //write a method where it takes 2 double values and 1 integer value.
        double result=0;

        if (value3==1){
            return result = value1+value2;
        } else if (value3 == 2)
        {
            return result = value1-value2;
        } else if (value3 == 3)
        {
            return result = value1*value2;
        } else {

            return result = value1/value2;
        }
    }

}
