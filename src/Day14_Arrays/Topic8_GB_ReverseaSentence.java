package Day14_Arrays;

import java.util.Arrays;

public class Topic8_GB_ReverseaSentence {
    public static void main(String[] args) {
        String Sentence =" I love Java";
        //i(0) love(1) JAva(2)
        String[]MySentenceArray = Sentence.split(" ");
        for (int i = MySentenceArray.length-1; i>=0; i--) {  // int i-related number of array
            System.out.print(MySentenceArray[i]+" ");//index 2 means number of word in line

        }
    }
}
