package Day12_Recap;

import java.util.Scanner;

public class Topic2_GB {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter number");
        int Number = scan.nextInt();
        int count=1;
        while (Number/10>0){
            count++;
            Number =Number/10;
        }
        System.out.println("count="+count);
    }
}
