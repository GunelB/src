package Day12_Recap;

import java.util.Scanner;

public class Topic3_GB {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int Number=0;
        int Total=0;
        while (Number>0) {

            int remainder = Number % 10;
            Total = Total + remainder;

        }

    }
}
//Create a Java Program to sum Number of Digits in an Integer
/*
159 => 15/ 159/10 = 15 9 rem
2223 => 9
999 => 27
5123 => 11
 */