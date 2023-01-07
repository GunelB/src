package Day5_SwitchStatement;

import java.util.Scanner;

public class Topic8_GB_NestedIf {
    public static void main(String[] args) {
        // if number is zero just print
        //if numb is even and less than 50
        //en -> if number is less than 50 double it otherwise triple it
//if number is odd  -> if number is less than 70 triple it otherwise divide to 2

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int Number = scan.nextInt();
        if(Number == 0){
            System.out.println("Number = " +Number);
        }else if(Number % 2 == 0){
            Number = Number *2;
            if(Number < 50){
                Number = Number *2;


            }
        }
    }
}
