package Day9_WhileLoop;

import java.util.Scanner;

public class Topic7_HA_WhileLoopExample2 {
    public static void main(String[] args) {
        /*
        get 2 numbers from user
        print the sum of all numbers
        please use while loop
        for example
        if I enter 1 and 5
        the numbers between 1 and 5 are 1 2 3 4 5
        I should print 15
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number");
        int Number1 = scan.nextInt();
        System.out.println("Please enter second number");
        int Number2 = scan.nextInt();

        // 1 2 3 4 5
        int i = Number1;
        int Sum = 0;
        while (i <= Number2){
            // I need to add numbers
            // i = 1
            Sum = Sum + i;
            i++;
        }
        System.out.println("Sum = " + Sum);

    }
}
