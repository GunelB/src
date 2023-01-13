package Day9_WhileLoop;

import java.util.Scanner;

public class Topic6_HA_WhileLoopExample {
    public static void main(String[] args) {
        /*
        write a code get a number from user
        find how many odd number we have between 0 and the given number using while loop
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Number = scan.nextInt();
        
        int i = 0;
        int Count = 0;
        // 1,3,5,7,9......
        while (i <= Number){
            if (i % 2 == 1){ // if it is an odd number   1 = 0*2 + 1      3 = 1*2 + 1
            //if (i % 2 != 0){  <- this is same with above if.
                System.out.println("i = " + i);
                Count = Count + 1;
            }
            i++;
        }
        System.out.println("Count = " + Count);
/*
the below code is same with above. In here we used for loop, above we used while loop
        for (int i = 0; i <= 10; i++) {
            
        }
 */

    }
}
