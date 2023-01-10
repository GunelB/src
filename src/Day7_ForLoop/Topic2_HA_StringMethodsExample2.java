package Day7_ForLoop;

import java.util.Scanner;

public class Topic2_HA_StringMethodsExample2 {
    public static void main(String[] args) {
        // get a sentence from user
        // replace "bat" with "snow" from given sentence
        // A batman with bat   <- Input
        // A snowman with snow <- Output

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String Sentence = scan.nextLine();

        String NewSentence = Sentence.replace("bat", "snow");
        System.out.println(NewSentence);
//        System.out.println(Sentence.replace("bat", "snow"));
    }
}
