package Day28_Exceptions;

import java.util.Scanner;

public class Topic8_GB_Finally {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
              int a = scan.nextInt();
        try {
            int value = 10/a;
            System.out.println("value");
            //code
        } catch (ArithmeticException e) {
            System.out.println("exception");
        } finally {
            System.out.println("it will get executed");
        }
    }
}