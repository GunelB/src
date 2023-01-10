package Day7_Loop;

import java.util.Scanner;

public class Topic3_GB_StringMethodExample3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a sentence");
        String Sentence = scan.nextLine();
        String NewSentence = Sentence.replace("bat","snow");
        System.out.println(NewSentence);


    }
}
