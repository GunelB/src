package Day38_InterviewPractice;

import java.util.Scanner;

public class Topic4_HA_Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");

        String Word = scan.nextLine();


        StringBuilder SB = new StringBuilder(Word);
        SB.reverse();

        if (Word.equals(SB.toString())){
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is NOT palindrome");
        }
    }
}
