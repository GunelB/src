package Homeworks;

import java.util.Scanner;

public class Team_work_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        -b +- sqrt b2 - 4ac
        2a

        a1 b5 c2
         */
        System.out.println("Input a:");
        double a = scan.nextDouble();
        System.out.println( "Input b:");
        double b = scan.nextDouble();
        System.out.println("Input c:");
        double c = scan.nextDouble();
        double result = b*b-4*a*c;
        if(result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / 2.0 * a;
            double r2 = (-b - Math.pow(result, 0.50)) / 2.0 * a;
            System.out.println("The roots are" + r1 + +r2);
        }else if (result < 0.0) {
            double r1= -b /( 2.0 * a);
            System.out.println("The root is " + r1);
        }else {
            System.out.println("no real root");

            }
            }


        }




