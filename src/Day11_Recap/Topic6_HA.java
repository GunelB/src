package Day11_Recap;

import java.util.Scanner;

public class Topic6_HA {
    public static void main(String[] args) {
// Ask user to enter a Word by using scanner
// print last char of the word with the word
// if I enter Java it should print "Last char is a for Java"
// if I enter Renastech it should print "Last char is h for Renastech"


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String Word = scan.next();

        /*
        Java  <- length = 4  so to get 3 -> Length - 1
        0123
        Renastech<- length = 9 so to get 8 -> length - 1
        012345678
         */

        // Word.charAt(Word.length()-1) <- this will give me the last char

        //                "Last char is h for Renastech"
        System.out.printf("Last char is %s for %s",Word.charAt(Word.length()-1),Word );
    }
}
