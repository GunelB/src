package Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_27 {
    public static void main(String[] args) {
        //Write a code where user is being asked to enter a word, find home many 3 character palindrome substrings //are in the given Word and print each one of them ( example : Word :  "BIBOBOBPIPDUD" : BIB , BOB, OBO, //BOB, PIP, DUD" there are 6 Palindrome three Char substring)
        //enter a word/scanner scan
        //how many substring/ number of find palindrome
        //print

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word to see if it is palindrome");
        String word = scan.next();

        int count = 0;
        // "BIBOBOBPIPDUD"
        // 0123456789101112
        for (int i = 0; i <= word.length() - 2; i++) {
            String actualChar = word.substring(i, i + 3);

            palindrome(actualChar);
            boolean isItPalindrome = palindrome(actualChar);
            if (isItPalindrome == true) {
                System.out.println("palindrome is = " + actualChar);
                count++;
            }

        }
        System.out.printf(" %d palindrome =", count);

    }

    public static boolean palindrome(String word) {
        String rev= "";
        for (int i = word.length() - 1; i >= 0; i--) {
            rev = rev + word.charAt(i);

        }
        return word.equalsIgnoreCase(rev);
    }

}





