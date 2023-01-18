package Day11_Recap;

import java.util.Scanner;

public class Topic3_GB {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double Total=0;
        for (int i = 1; i <=4 ; i++) {
            System.out.printf("%d\n",i);
        int Number = scan.nextInt();
        Total=Total+Number;
            System.out.println("Total="+Total);
        }

    }
}
