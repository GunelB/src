package Homeworks;

import java.util.Scanner;

public class Homework_19 {
    public static void main(String[] args) {
     //   Write a code which asks user to enter a String and removes all the duplicate characters from //the String and prints the result
    //    ex. "AAAAAVVVCCDDAA" ==> "AVCD"


        Scanner scan= new Scanner(System.in);
        System.out.println("Enter word with double letters each");
        //AAAAVVVVCCDDDAAA
        String word = scan.next();
        String newWord = "" + word.charAt(0);
        for (int index = 0; index < word.length(); index++) {
   //         if (!newWord.contains(String.valueOf(word.charAt(i))));
     //       newWord= newWord += word.charAt(i);
        }
        System.out.println(newWord);

    }
}

//    String s = "abcdabd";
//        String temp = "" + s.charAt(0);
//
//        for (int i = 1; i < s.length(); i++) {
//            if (!temp.contains(String.valueOf(s.charAt(i))))
//                temp = temp + s.charAt(i);
//        }
//        System.out.println(temp);
//    }
 //    String input = "AAAB";
   // String output = "";
    //for (int index = 0; index < input.length(); index++) {
      //  if (input.charAt(index % input.length()) != input
        //.charAt((index + 1) % input.length())) {

        //output += input.charAt(index);

        //}
        //}
        //System.out.println(output);