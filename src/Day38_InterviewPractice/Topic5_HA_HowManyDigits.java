package Day38_InterviewPractice;

import java.util.Scanner;

public class Topic5_HA_HowManyDigits {
    public static void main(String[] args) {
//        159   it should print 3
//        10946 it should print 5

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Number = scan.nextInt();

//        159   =   1*100 + 5*10 + 9
        /*
            159 / 10 = 15
            15  / 10 = 1
            1   / 10 = 0
         */

        int HowManyDigits = 0;
        while (Number != 0){
            Number = Number / 10;
            HowManyDigits++;
        }
        System.out.println(HowManyDigits);
    }
}
