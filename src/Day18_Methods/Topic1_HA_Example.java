package Day18_Methods;

import java.util.Scanner;

public class Topic1_HA_Example {
    public static void main(String[] args) {
/*
Write a code  with following instructions:
1) Ask user to enter a sentence
2) check each word in the sentence to see how many 'l', 'a' and 'b' characters in the each word
 */

        /*
        1) Ask user to enter a sentence
            a- I need to create Scanner to get a sentence from user
            b- I need to inform the user
            c- I need to assign it to a String variable (nextLine)
         */
        //a- I need to create Scanner to get a sentence from user
        Scanner scan = new Scanner(System.in);

        //b- I need to inform the user
        System.out.println("Please enter a sentence");

        //c- I need to assign it to a String variable (nextLine)
        String MySentence = scan.nextLine();

        /*
        Sentence = Today is so cold
        2) check each word in the sentence to see how many 'l', 'a' and 'b' characters in the each word
            a- I need to split my sentence into words
            b- iterate each word  (for or for each)
            c- I need to calculate how many 'l' I have
            d- I need to calculate how many 'a' I have
            e- I need to calculate how many 'b' I have
         */

        //a- I need to split my sentence into words
        // DataType [] VariableName = {Values}
        String [] MyWords = MySentence.split(" ");

//        b- iterate each word  (for or for each)
//        for (DataTypeofEachElementInArray VariableName : ArrayVariableName){}
        for (String Word : MyWords ){
//            c- I need to calculate how many 'l' I have  <- create a method
            int HowMany_l = Calculate_l(Word);
            int HowMany_a = Calculate_a(Word);
            int HowMany_b = Calculate_b(Word);

            System.out.println("Word = "+Word);
            System.out.println("HowMany_l = " + HowMany_l);
            System.out.println("HowMany_a = " + HowMany_a);
            System.out.println("HowMany_b = " + HowMany_b);
        }

    }

    //calculate how many 'l' I have in a word
    //Create a method
    // Parameters 1 String Parameter - Word
    // ReturnType int
    // public static ReturnType MethodName (Param1Type Param1Name)

    public static int Calculate_l (String MyWord){
//        calculate how many 'l'
        // MyWord = Today
        int Count = 0;
        for (int i = 0; i < MyWord.length(); i++) {
            //i=0
            if ( MyWord.charAt(i) == 'l'  ){
                Count = Count + 1;
            }
        }
        return Count;
    }

    // d- I need to calculate how many 'a' I have
    public static int Calculate_a (String MyWord){
//        calculate how many 'a'
        // MyWord = Today
        int Count = 0;
        for (int i = 0; i < MyWord.length(); i++) {
            //i=0
            if ( MyWord.charAt(i) == 'a'  ){
                Count = Count + 1;
            }
        }
        return Count;
    }

    //e- I need to calculate how many 'b' I have
    public static int Calculate_b (String MyWord){
//        calculate how many 'b'
        // MyWord = Today
        int Count = 0;
        for (int i = 0; i < MyWord.length(); i++) {
            //i=0
            if ( MyWord.charAt(i) == 'b'  ){
                Count = Count + 1;
            }
        }
        return Count;
    }
}
