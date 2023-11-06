package Day38_InterviewPractice;

import java.util.Scanner;

public class Topic6_HA_ReverseNumber {
    public static void main(String[] args) {
        // 159   <- 951
        // 10946 <- 64901

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        Integer Number = scan.nextInt();

        //159     159%10  = 9


        int Reversed = 0;
        while(Number != 0){
            // 1 5 9
            int remainder = Number % 10;   // 159%10 = 9  // 9        0 * 10 + 9
            Reversed = Reversed * 10 + remainder;         // 95       9 * 10 + 5
                                                          // 951      95 * 10 + 1
            // 1 5 9
            Number = Number / 10;
        }

        System.out.println(Reversed);
    }
}
