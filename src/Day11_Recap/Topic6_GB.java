package Day11_Recap;

import java.util.Scanner;

public class Topic6_GB {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word= scan.next();
        System.out.printf("The last char is %c for %s",word.charAt(word.length()-1),word);

    }

}
