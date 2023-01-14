package Day10_NestedLoops;

import java.util.Scanner;

public class Topic2_HA_Example {
    public static void main(String[] args) {
        //Accept 5 numbers from the user and display their average.

        /*
        you need plan your solution, what to do

        accept number in the loop

        ask for the number
        average = total / HowManyNumbers
        i need total
        store the total in a variable

        5 3 9 14 9  = 40/5 = print 8

        image user will enter above number

        please enter a number
        I entered 5
        now my total will become 5

        please enter a number
        i entered 3
        now my total will become 8

        please enter a number
        i entered 9
        now my total wil become 17

        please enter a number
        i entered 14
        now my total will become 31

        please enter a number
        i entered 9
        now total will become 40

        after this I should print 40/5 = 8

         */

        Scanner scan = new Scanner(System.in);
        int Total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("please enter a number");
            int Number = scan.nextInt();
            Total = Total + Number;
            System.out.println("now total will become "+Total);
        }
        System.out.println("Average = "+ Total / 5);
    }
}
