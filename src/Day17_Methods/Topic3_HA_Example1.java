package Day17_Methods;

import java.util.Scanner;

public class Topic3_HA_Example1 {
    public static void main(String[] args) {
// Write a code where user is being asked to enter a Sentence
// check for each word to see word is palindrome  <- create a method that checks palindrome

        /*
        Create a method that will check if the word is palindrome
        Parameters 1- String because I need the Word to check it
        ReturnType boolean

         */

        /*
        Write a code where user is being asked to enter a Sentence
        I will use Scanner
        I'll inform the user
        I'll get the sentence with nextLine

         */


        //Write a code where user is being asked to enter a Sentence

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String Sentence = scan.nextLine();

        /*
        check for each word to see word is palindrome
        I need to get each word from sentence
        I need to check each word if it is palindrome
         */

        // I need to get all words
        // Hello World This is Java
        String[] Words = Sentence.split(" ");

        // for
        // for each
//I need to check each word if it is palindrome
        for (String MyWord : Words ){
            boolean isPalindrome = CheckPalindrome(MyWord);
            System.out.println("is "+MyWord+" Palindrome : "+isPalindrome);
        }


    }
//palindrome
    // Madam - madaM
    // Radar - radaR
    // Mom   - moM
    // Dad   - daD
    // ROtator - rotatOR

    //create a method that checks palindrome
    // Parameters <- 1 String Parameter
    // Return Type <- boolean
    // public static ReturnType MethodName (Param1Type Param1Name)

    public static boolean CheckPalindrome (String Word){
        //check if it is palindrome
        // Madam
        //   M
        // a M
        // d aM
        // a daM
        // m adaM

        String ReversedString = "";
        for (int i = 0; i < Word.length(); i++) {
            ReversedString = Word.charAt(i) + ReversedString;
        }
        // Word = Madam
        // ReversedString = madaM
        /*
        boolean isPalindrome;

        if (ReversedString.equalsIgnoreCase(Word) == true){
            isPalindrome = true;
        }else {
            isPalindrome = false;
        }

         */

        boolean isPalindrome = ReversedString.equalsIgnoreCase(Word); // this line is same with above if block
        return isPalindrome;

    }
}
