package Day11_Recap;

import java.util.Scanner;

public class Topic4_GB {
    public static void main(String[] args) {
        //absolute number 4<=4  -9<=9
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter aa number");
        int input = scan.nextInt();
        if (input > 0) {
            System.out.println("absolute number" + input);

        } else if (input < 0) {
            input = input * -1;
            System.out.println("no ordinary" + input);

        }
    }
    }