package Day6_StringAndStringMethods;

import java.util.Scanner;

public class Topic1_HA_ScannerNext {
    public static void main(String[] args) {
        // nextLine() to get string
        // next() will read your input until it sees a space " "
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 veggies and separate them with space");
        String Veggie1 = scan.next();
        String Veggie2 = scan.next();

        System.out.println("Veggie1 = " + Veggie1);
        System.out.println("Veggie2 = " + Veggie2);

        System.out.println("Please enter your name, surname and age and separate them with space");
        // Hayri Aslan 34
        String Name = scan.next();
        String Surname = scan.next();
        int Age = scan.nextInt();

        System.out.println("Name = " + Name);
        System.out.println("Surname = " + Surname);
        System.out.println("Age = " + Age);

        System.out.printf("Name = %s, Surname = %s, Age = %d", Name, Surname, Age);


        /*
        %s  <- string
        %d  <- numeric
        %f  <- double
         */

    }
}
