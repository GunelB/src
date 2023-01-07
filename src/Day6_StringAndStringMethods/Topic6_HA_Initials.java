package Day6_StringAndStringMethods;

import java.util.Scanner;

public class Topic6_HA_Initials {
    public static void main(String[] args) {
        //ObjectType VariableName = new ObjectType(parameter);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String Name = scan.nextLine();
        System.out.println("Please enter your surname");
        String Surname = scan.nextLine();
        // Hayri Aslan
        // H. A.

        // Elizabeth Rebecca
        // E. R.

        // Name = Hayri
        // Surname = Aslan
        String Initials = Name.charAt(0)+". "+Surname.charAt(0)+".";
                // H. A.
        System.out.println("Initials = " + Initials);

        // Alexander Graham Bell
        // A. G. Bell


    }
}
