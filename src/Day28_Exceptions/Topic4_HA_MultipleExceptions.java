package Day28_Exceptions;

import java.util.Scanner;

public class Topic4_HA_MultipleExceptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number");
        int FirstNumber = scan.nextInt();

        System.out.println("Please enter second number");
        int SecondNumber = scan.nextInt();

        try {
            int Value = FirstNumber / SecondNumber;
            System.out.println(Value);
        } catch (ArithmeticException e){
            System.out.println("Can't divide by 0");
        }


        int[] MyArray = {1,5,9,6};
                //       0 1 2 3

        System.out.println("Please enter an index");
        int index = scan.nextInt();

        try {
            System.out.println(MyArray[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error on line 30");
        }
    }
}
