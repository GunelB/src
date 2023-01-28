package Day17_Methods;

import java.util.Scanner;

public class Topic3_GB_Example1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter za sentence");
         String Sentence = scan.nextLine();  //need to get all words
        String [] words = Sentence.split(" ");

         for(String MyWord:words){
            boolean isPalindrome = Reverse(MyWord);
             System.out.println("is" +MyWord+"Palindrome = " + isPalindrome);
         }

    }

    public static boolean Reverse(String word) {
        String ReverseString="";
        for (int i = 0; i < word.length(); i++) {
            ReverseString =  word.charAt(i)+ReverseString;
        }

            return ReverseString.equalsIgnoreCase(word);


        }

    }

