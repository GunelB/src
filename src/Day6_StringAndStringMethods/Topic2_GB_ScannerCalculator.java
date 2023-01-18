package Day6_StringAndStringMethods;
import java.util.Scanner;

 public class Topic2_GB_ScannerCalculator {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Type the first number");
         int FirstNumber = scan.nextInt();
         System.out.println("Type the second number");
         int SecondNumber = scan.nextInt();

         System.out.println("Please choose the operations:\n1 for Multiplication \n2 for division\n3 for addition \n4 for subtraction\5 for mod");
         int Operation = scan.nextInt();
         switch (Operation) {
             case 1:
                 System.out.printf("The result is %d", FirstNumber * SecondNumber);
                 break;
             case 2:
                 System.out.printf("The result of division is %d", FirstNumber / SecondNumber);
                 break;
             case 3:
                 System.out.printf("The result of addition is %d", FirstNumber + SecondNumber);
                 break;
             default:
                 System.out.println("Invalid operation");
                 break;
         }
     }
 }
