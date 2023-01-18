package Day11_Recap;

import java.util.Scanner;

public class Topic8_HA {
    public static void main(String[] args) {
/*
// Tip Calculator  [if-else]

Jane wants to build a very simple tip calculator for whenever he goes eating in a restaurant.
In his country, it's usual to tip 15% if the bill value is between 99 and 280.
If the value is different, the tip is 20%.

Print as the string to the console containing the bill value, the tip, and the final value (bill + tip).

Example: "The bill was 275, the tip was 41.25, and the total value 316.25

Data to test 97 ,100, 275 , 25

 */

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the bill value");
    int Bill = scan.nextInt();

    double Tip = 0;
    // 99<=Bill<=280
    if (99<=Bill && Bill<=280){
        Tip = Bill * 0.15;
    }else {
        Tip = Bill * 0.20;
    }
//                     The bill was 275, the tip was 41.25, and the total value 316.25
    System.out.printf("The bill was %d, the tip was %f, and the total value %f", Bill, Tip, Bill + Tip );


    }
}
