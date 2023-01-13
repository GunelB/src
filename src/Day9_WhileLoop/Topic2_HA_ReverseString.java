package Day9_WhileLoop;

import java.util.Scanner;

public class Topic2_HA_ReverseString {
    public static void main(String[] args) {
        /*
        write a code where user is being asked to enter a string.
        reverse that string and print it

        Ugur    <- rugU         Length = 4
        0123
        Elizabeth <- htebazilE  Length = 9
        012345678
        Radar <- radaR          Length = 5
        01234
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word that you want to reverse");
        String Word = scan.next();

        char FirstChar = Word.charAt(0);
        System.out.println("The first character is "+FirstChar);
        char LastChar = Word.charAt(Word.length()-1);
        System.out.println("The last character is "+LastChar);

/*
upwards   1,2,3,4,5,6,7,8,9,10
        for (int i = 0; i <= 10; i++) {

        }
        */

        /*
downwards 10,9,8,7,6,5,4,3,2,1,0
        for (int i = 10; i >=0; i--) {

        }
         */


        /*
             Ugur     ->    r
                            r u
                            ru g
                            rug U
         */
        String Reverse= "";
        for (int i = Word.length()-1; i >= 0 ; i--) {
            Reverse = Reverse + Word.charAt(i);
            /*
            i = 3   ->      ""  + "r"    -> Reverse = "r"
            i = 2   ->      "r" + "u"    -> Reverse = "ru"
            i = 1   ->      "ru"+ "g"    -> Reverse = "rug"
            i = 0   ->      "rug"+"U"    -> Reverse = "rugU"
            i =-1  -> the condition became false, we done with for loop
             */
        }

        System.out.println("The reverse of the Word is "+Reverse);



    }
}
