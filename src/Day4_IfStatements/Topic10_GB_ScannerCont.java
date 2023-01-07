package Day4_IfStatements;

import java.util.Scanner;

public class Topic10_GB_ScannerCont {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Age");
        int Age = scan.nextInt();
        scan.nextLine();
        System.out.println("Please enter your favourite team");
        String FavouriteTeam = scan.nextLine();
        System.out.println("Your age is " +Age+"and your favourite team " + FavouriteTeam );


    }
}
