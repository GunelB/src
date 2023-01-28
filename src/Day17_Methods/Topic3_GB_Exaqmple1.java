package Day17_Methods;

import java.util.Scanner;

public class Topic3_GB_Exaqmple1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter za sentence");
         String Sentence = scan.nextLine();  //need to get all words
        String [] words = Sentence.split(" ");

         for(String MyWords:words){
       //      boolean isPalindrome = Reverse();

         }
    }


    public static boolean Reverse(String word) {
        String ReverseString="";
        for (int i = 0; i < word.length(); i++) {
            ReverseString = ReverseString+ word.charAt(i);
        }

            return ReverseString.equalsIgnoreCase(word);


        }

    }

