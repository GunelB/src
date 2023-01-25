package Day15_ArraysandForEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Topic1_GB_ForEach {
    public static void main(String[] args) {
        String Hi= "Hello";
        char [] HiArray =Hi.toCharArray();
        System.out.println(Arrays.toString(HiArray));
        for (char Greetings:HiArray) {
            System.out.println("Greetings = " + Greetings);
            
        }
    }
}
