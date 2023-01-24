package Day14_Arrays;

public class Topic8_HA_ReverseaSentence {
    public static void main(String[] args) {
        String Sentence = "I love Java";
        // Java love I

        String [] MySentenceArray = Sentence.split(" ");
        //{"I", "love", "Java"}
        //  0      1       2
        // go from 2 down to 0
        // MySentenceArray.length = 3

        for (int i = MySentenceArray.length - 1; i >=0 ; i--) {
            // i = 2
            System.out.print(MySentenceArray[i]+" ");
        }

    }
}
