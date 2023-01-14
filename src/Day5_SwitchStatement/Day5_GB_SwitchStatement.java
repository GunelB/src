package Day5_SwitchStatement;

import java.util.Scanner;

public class Day5_GB_SwitchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Age = scan.nextInt();
        switch(Age){
            case 16:
                System.out.println("You are under 18");
                break;
            case 18:
                System.out.println("You are eligible to vote");
                break;
            case 65:
                System.out.println("You are senior citizen");
                break;
            default:
                System.out.println("Please enter valid age");
        }

    }
}
