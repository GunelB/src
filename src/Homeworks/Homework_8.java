package Homeworks;
import java.util.Scanner;
public class Homework_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the year!");
        int Year = scan.nextInt();
        if(Year %4==0 && Year%100!=0 ){
            System.out.println("It is a leap year ");
        }else if (Year %100==0) {
            System.out.println("It is not a leap year");
        }else if (Year%400==0) {
        }else{
            System.out.println("It is a leap year");
      /*  System.out.println("Enter the first number");
        int Num1 = scan.nextInt();
        System.out.println("Enter the second number");
        int Num2 = scan.nextInt();
        System.out.println("Enter the third number");
        int Num3 = scan.nextInt();
        if (Num1 > Num2 && Num1 > Num3) {;
            System.out.println("The greatest number is " + Num1);
        } else if(Num2>Num1&& Num2>Num3){
            System.out.println("The greatest number is" +Num2);
        }else{
            System.out.println("The greatest number is"  +Num3);
            */

        }
    }
}
       /* int Max;
        Max = (Num1 > Num2)? Num1 : Num2;*/




        /*System.out.println("Please enter the number that indicates your birth month:");
        int Month;
        Month = scan.nextInt();

        switch (Month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Please enter valid number");
           * /
      }
    }
}


         */