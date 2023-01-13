package Day9_WhileLoop;

import java.util.Scanner;

public class Topic1_HA_Example1 {
    public static void main(String[] args) {
        /*
        Get 2 numbers from user
        count how many numbers we have using for loop
        count the numbers that can divide by 3
         */
        // create scanner
        // inform user for the first number
        // assign it to Start
        // inform user for the second number
        // assign it to End
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number");
        int Start = scan.nextInt();
        System.out.println("Please enter second number");
        int End = scan.nextInt();

        /*
        for(int i = starting; condition(endpoint); iteration(increase or decrease)){
            code block
        }
         */
        int Count = 0;
        // 5,6,7,8,9,10
        for (int i = Start; i <= End ; i++) {
            // count the numbers
            //int Count = 0;  //<- this will set the count to zero everytime code get executed
            if (i % 3 == 0){
                System.out.println(i+" can be divided by 3");
                Count = Count + 1;
            }

        }
        System.out.println("Count = "+Count);

        // 6,9
    }
}
