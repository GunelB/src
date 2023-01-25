package Day15_ArraysandForEach;

import java.lang.reflect.Array;

public class Topic1_GB_ForEach {
    public static void main(String[] args) {
        String Hi= "Hello";
        char [] HiArray =Hi.toCharArray();
        for (char Greetings:HiArray) {
            System.out.println("Greetings = " + Greetings);
            
        }
    }
}
