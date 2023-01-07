package Selfwork_task;

import java.util.Scanner;

public class try1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
       /* System.out.println("Enter length");
        System.out.println("Please enter your grade");
        int Grade = scan.nextInt();
        if(Grade < 25){
            System.out.println("Your Grade = " +Grade+ "and your letter grade is F");

        }else if (Grade >=25 && Grade<45){
            System.out.println("Your Grade = "+Grade+  "and your letter grade isD");
        }else if(Grade>45 && Grade <50){
            System.out.println("Your grade is D");

        }else if(Grade <=50 && Grade < 60){
            System.out.println("Your Grade is C"); */


        Scanner Scan = new Scanner(System.in);
        System.out.println("Please enter your Bill amount");
        int Bill = scan.nextInt();
        double Discount = (Bill > 10000)? Bill - (Bill*(10.0/100)): Bill -(Bill * (5.0/100));
        System.out.println("your bill amount is " + Discount);

        }
    }

