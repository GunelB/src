package Day4_IfStatements;

import java.util.Scanner;

public class Topic9_scannerCont {
    public static void main(String[] args) {
        //get user name and surname

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name and surname and hit enter");
        String FullName = scan.nextLine();

        System.out.println("Welcome "+FullName);
        System.out.println("Please enter your job");
        String Job = scan.nextLine();
        System.out.println("Your job is " + Job);
    }
}
