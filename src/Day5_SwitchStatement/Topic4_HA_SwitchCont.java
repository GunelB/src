package Day5_SwitchStatement;

import java.util.Scanner;

public class Topic4_HA_SwitchCont {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int Age = scan.nextInt();

        System.out.println(Age);


        switch (Age){
            case 16:
                System.out.println("You are under 18");
            break;
            case 18:
                System.out.println("You are eligible for vote");
            break;
            case 65:
                System.out.println("You are senior citizen");
            break;
            default:
                System.out.println("Please enter valid age");
            break;
        }
    }
}
