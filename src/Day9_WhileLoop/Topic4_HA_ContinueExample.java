package Day9_WhileLoop;

import java.util.Scanner;

public class Topic4_HA_ContinueExample {
    public static void main(String[] args) {
        // get a sentence from user
        // reverse it but do not include "l" or "L"
        /*
        Elizabeth   ->  thebaziE
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence"); // Hello, my name is elizabeth
        String Sentence = scan.nextLine();

        String Reverse = "";
        for (int i = Sentence.length()-1; i >= 0 ; i--) {
            //Elizabeth
            if (Sentence.charAt(i) == 'l' || Sentence.charAt(i) == 'L' ){
                continue;
            }
            
            Reverse = Reverse + Sentence.charAt(i);
        }
        System.out.println("Reverse = " + Reverse);
    }
}
