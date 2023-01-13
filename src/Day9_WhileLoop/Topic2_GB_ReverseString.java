package Day9_WhileLoop;

import java.util.Scanner;

public class Topic2_GB_ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String Word = scan.next();
        char FirstChar = Word.charAt(0);
        System.out.println("The First character is" + FirstChar);
        char LastChar = Word.charAt(Word.length()-1);
        System.out.println("The Last Character is"+ LastChar);
        for (int i = Word.length()-1; i < 0; i--) {

        }


    }
}
