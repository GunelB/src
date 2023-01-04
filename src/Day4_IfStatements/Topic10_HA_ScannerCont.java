package Day4_IfStatements;

import java.util.Scanner;

public class Topic10_HA_ScannerCont {
    public static void main(String[] args) {
        // lets get users age and favorite team
        Scanner scan = new Scanner(System.in);

        // i will get user's age
        System.out.println("Please enter your Age");
        int Age = scan.nextInt();

        scan.nextLine(); // this is a band aid

        // lets get user's favorite team
        System.out.println("Please enter your favorite team");
        String FavoriteTeam = scan.nextLine();

        System.out.println("Your age is "+Age+" and your favorite team is "+FavoriteTeam);
    }
}
