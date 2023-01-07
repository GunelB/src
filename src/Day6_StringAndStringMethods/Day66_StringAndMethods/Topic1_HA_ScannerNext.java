package Day66_StringAndMethods;

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
        %c character
        %d decimal (integer) number (base 10)
        %e exponential floating-point number
        %f floating-point number
        %i integer (base 10)
        %o octal number (base 8)
        %s String
        %u unsigned decimal (integer) number
        %x number in hexadecimal (base 16)
        %t formats date/time
        %% print a percent sign
        \% print a percent sign
        \b backspace
        \f next line first character starts to the right of current line last character
        \n newline
        \r carriage return
        \t tab
        \\ backslash
         */

    }
}
