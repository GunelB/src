package Day9_WhileLoop;

import java.util.Scanner;

public class Topic1_GB_Example1 {
    //Get 2 numbers from user
   // count how many numbers we have using for loop
   // count the numbers that can divide by 3
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number 1");
        int Start = scanner.nextInt();
        System.out.println("Enter number 2");
        int End = scanner.nextInt();
        int Count = 0;
        for (int i = Start; i<= End; i++){
            Count = Count + 1;
        }
        System.out.println("Count="+Count);
    }
}
