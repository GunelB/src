package Day28_Exceptions;

import java.util.Scanner;

public class Topic2_HA_ExceptionsCont {
    public static void main(String[] args) {
        // get 2 numbers from user

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number");
        int FirstNumber = scan.nextInt();

        System.out.println("Please enter second number");
        int SecondNumber = scan.nextInt();


        try {
            int Value = FirstNumber / SecondNumber;

            System.out.println(Value * 5);
        } catch (Exception e){
            System.out.println("Can't divided by 0");
        }


    }
}
