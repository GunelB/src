package Day12_Recap;

import java.util.Scanner;

public class Topic3_HA {
    public static void main(String[] args) {
//Create a Java Program to sum Number of Digits in an Integer
/*
159 => 15     1+5+9=15
2223 => 9     2+2+2+3=9
999 => 27     9+9+9=27
5123 => 11    5+1+2+3=11
 */

        /*
        159
        159 / 10  = 15 as result and 9 as remainder  <- 15*10 + 9
        15 / 10 = 1 as result and 5 as remainder     <- 1*10 + 5
        1 / 10 = 0 as result and 1 as remainder      <- 0*10 + 1

        160
        160 / 10 = 16 as result and 0 as remainder

        I need to get remainder and add into Total
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Number = scan.nextInt();
        int Total = 0;
        while (Number > 0){
           // 56 => 5 + 6 = 11
           // 123 => 1 + 2 + 3 = 6
           // 95601 => 9+5+6+0+1 = 21
            int Remainder = Number % 10; //<- this will give me the remainder for ex if Number=159, it will give me 9
            Total = Total + Remainder;
            Number = Number / 10;
        }
        System.out.println("Total = " + Total);
    }
}
