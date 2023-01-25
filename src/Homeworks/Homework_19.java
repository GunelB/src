package Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_19 {
    public static void main(String[] args) {
     //   Write a code which asks user to enter a String and removes all the duplicate characters from //the String and prints the result
    //    ex. "AAAAAVVVCCDDAA" ==> "AVCD"


        Scanner scan= new Scanner(System.in);
        System.out.println("Enter word with double letters each");
        //AADDCC
        String word= scan.nextLine();
        int count;
        char string[]= word.toCharArray();
        for (int i = 0; i < string.length; i++) {
            count=1;
            for (int j =i+1; j < string.length; j++) {
                if (string[i] == string[j]) {
                    count++;
                    string[j]='0';
                }
            }
            if (count>1 && string[i] !='0'){
                System.out.println(string[i]);
            }
                    }




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
 //    Str

        //}
        //}
        //System.out.println(output);