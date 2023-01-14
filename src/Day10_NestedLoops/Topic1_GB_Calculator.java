package Day10_NestedLoops;

import java.util.Scanner;

public class Topic1_GB_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please make a selection: 1 for Add,2 for sub,3 for div,4 for mult");
        int Selection = scan.nextInt();

        while(1<=Selection && Selection <=4){
            System.out.println("Please enter first number");
            int Number1 = scan.nextInt();
            System.out.println("Please enter second");
            int Number2 = scan.nextInt();

            if(Selection==1){
                System.out.printf("The result is %d",Number1+Number2);

            }else if (Selection ==2){
                System.out.printf("The result is %d",Number1-Number2);
            }else if(Selection==3){
                System.out.printf("The result is %d",Number1 / Number2);
            }else if(Selection==4){
                System.out.printf("The result is %d",Number1*Number2);

            }

        }
    }
}
