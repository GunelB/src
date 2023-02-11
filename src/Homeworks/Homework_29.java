package Homeworks;

import java.util.Scanner;
public class Homework_29 {
    public static void main(String[] args) {

   //Write a method where it takes 2 strings as a parameter and returns true when 2 strings are equal and returns false when they are not equal.
        String word1= "Apple";
        String word2="Juice";
        String word3="peace";
        String word4 ="peace";
        System.out.println(CheckString("peace","peace"));
    }

   public static boolean CheckString(String p_word1, String p_word2) {
        return
               p_word1.equals(p_word2);
   }

   }