package Day5_SwitchStatement;

import java.util.Scanner;

public class Topic8_HA_NestedIf {
    public static void main(String[] args) {
        /*
        if number is zero just print   +
        if number is even -> if number is less than 50 double it otherwise triple it
        if number is odd  -> if number is less than 70 triple it otherwise divide to 2
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Number = scan.nextInt();

        //if number is zero just print
        if (Number == 0){
            System.out.println("Number = " + Number);
        } else if (Number % 2 == 0){  // if it is even
            //if number is less than 50 double it otherwise triple it
            if (Number < 50){
                Number = Number * 2;
                System.out.println("Number = " + Number);
            } else {
                Number = Number * 3;
                System.out.println("Number = " + Number);
            }
       } else { //if number is odd
            // if number is less than 70 triple it otherwise divide to 2
            // (condition) ? value if it true : value if it is false;
            /*
            if (Number < 70){
                Number = Number * 3;
            }else {
                Number = Number / 2;
            }
            */
            Number = (Number < 70) ? Number * 3 : Number /2;
            // if it is true above line will be equal   Number = Number * 3;
            // if it is false above line will be equal  Number = Number /2;
            System.out.println("Number = " + Number);

        }
    }
}
