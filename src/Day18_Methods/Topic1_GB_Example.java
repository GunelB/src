package Day18_Methods;

import java.util.Scanner;

public class Topic1_GB_Example {
    public static void main(String[] args) {
        //ask user scanner
        //inform
        //assign to String variable (nextline)
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String MySentence = scan.nextLine();
        //check each word --means split into words--iterate each word
        //how many l,a,b
        String[] MyWords = MySentence.split(" ");
        for (String Words : MyWords) {

        }
    }

   // public static int Calculate_l(String MyWord) {
        // calculate how many'l'
      //  int Count = 0;
        //for (int i = 0; i < MyWord.length(); i++) {
          //  if (MyWord.charAt(i) == 'l') {
            //    Count = Count + 1;
            }

       // }
       // return Count;
   // }

     // public static int Calculate_l(String MyWord) {
        // calculate how many'l'
       // int Count = 0;
        //for (int i = 0; i < MyWord.length(); i++) {
          //  if (MyWord.charAt(i) == 'l') {
            //    Count = Count + 1;
       //     }

      //  }
        //return Count;


    //int HowMany_Calculate_l(Word);
