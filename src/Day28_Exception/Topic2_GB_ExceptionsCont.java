package Day28_Exception;

import java.util.Scanner;

public class Topic2_GB_ExceptionsCont {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter yr number");
        int FirstNumber = scan.nextInt();
        System.out.println("enter second numb");
        int SecondNumber = scan.nextInt();
        try {
            int value = FirstNumber / SecondNumber;
            System.out.println(value * 5);
        } catch (Exception e) {
            System.out.println("Cant divided by 0");
        }
    }
}