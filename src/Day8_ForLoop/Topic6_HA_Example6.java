package Day8_ForLoop;

import java.util.Scanner;

public class Topic6_HA_Example6 {
    public static void main(String[] args) {
       /*
       Write a program to print table of a number in the following format.

        for example if I input 7
        7 * 1 = 7
        7 * 2 = 14
        7 * 3 = 21
        7 * 4 = 28
        7 * 5 = 35
        7 * 6 = 42
        7 * 7 = 49
        7 * 8 = 56
        7 * 9 = 63
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between 1-9");
        int MyNumber = scan.nextInt();

        for (int i = 1; i <=9 ; i++) {
            System.out.printf("%d * %d = %d\n", MyNumber, i, MyNumber*i);
        }
    }
}
