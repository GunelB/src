package Day7_ForLoop;

import java.util.Scanner;

public class Topic1_HA_StringMethodsExample {
    public static void main(String[] args) {
        /*
        Write a program to check if the letter 'e' is present in the given word
         */
        // create scanner
        // inform user
        // assign it to
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String Word = scan.nextLine();

        System.out.println(Word.contains("e"));



    }
}
