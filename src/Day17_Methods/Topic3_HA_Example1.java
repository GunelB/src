package Day17_Methods;

import java.util.Scanner;

public class Topic3_HA_Example1 {
    public static void main(String[] args) {
// Write a code where user is being asked to enter a Sentence
// check for each word to see word is palindrome  <- create a method that checks palindrome



        //Write a code where user is being asked to enter a Sentence

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String Sentence = scan.nextLine();

        // I need to get all words
        String[] Words = Sentence.split(" ");

        // for
        // for each

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

        /*
        if (ReversedString.equalsIgnoreCase(Word) ){
            return true;
        }else {
            return false;
        }
         */

        return ReversedString.equalsIgnoreCase(Word);
    }
}
