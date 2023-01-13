package Day9_WhileLoop;

import java.util.Scanner;

public class Topic7_GB_WhileLoopExample2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");

        int Number1 = scan.nextInt();
        System.out.println("Enter next number");
        int Number2 = scan.nextInt();
        int i = Number1;
        int Sum = 0;
        while(i <= Number2){
            Sum = Sum +i;
            i++;
        }
    }

}
