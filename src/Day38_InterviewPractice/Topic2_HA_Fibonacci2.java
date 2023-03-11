package Day38_InterviewPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Topic2_HA_Fibonacci2 {
    public static void main(String[] args) {
        //if we want to print fibonacci numbers between 89 - 10946

        ArrayList<Integer> Numbers = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the minimum value");
        int min = scan.nextInt();

        System.out.println("Please enter the maximum value");
        int max = scan.nextInt();

        int a = 0;
        int b = 1;

        int Nextone = a + b;

        while(Nextone <= max){
            if (Nextone >= min){
                Numbers.add(Nextone);
            }

            a = b;
            b = Nextone;
            Nextone = a + b;

        }

        System.out.println(Numbers);
    }
}
