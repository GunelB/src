package Day35_InterviewPractiseString;

import java.util.Arrays;

public class Topic4_HA_Anagram {
    public static void main(String[] args) {
        // Listen - Silent
        // Players - Parsley
        // Triangle - Integral
        // Needs - Dense
        // Team - Meat

        // get lowercase of them        team - meat
        // sort them                    aemt - aemt
        // check them

        System.out.println(CheckAnagram("Team", "Meat"));
    }

    public static boolean CheckAnagram(String Word1, String Word2){
        // if the length of both of them are not equal, they can't be anagram
        if (Word1.length() != Word2.length()   ){
            return false;
        } else {
            // get lowercase of them
            Word1 = Word1.toLowerCase();
            Word2 = Word2.toLowerCase();

            // sort them

            // to able to sort them, we need to create something numeric
            // we can't sort string
            char[] Word1Array = Word1.toCharArray(); // T= 84   Enter = 13  A= 65
            char[] Word2Array = Word2.toCharArray();
            Arrays.sort(Word1Array);
            Arrays.sort(Word2Array);

            // check them
            return Arrays.equals(Word1Array, Word2Array);
        }
    }
}
