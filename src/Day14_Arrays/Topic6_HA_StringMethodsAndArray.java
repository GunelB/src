package Day14_Arrays;

import java.util.Arrays;

public class Topic6_HA_StringMethodsAndArray {
    public static void main(String[] args) {
        String s = "Canada is awesome";
        // {"Canada", "is", "awesome"}


        String [] MyArray = s.split(" ");

        System.out.println(Arrays.toString(MyArray));

        String MySentence = "Java is cool";
        String [] MySentenceArray = MySentence.split(" ");

        System.out.println(Arrays.toString(MySentenceArray));
    }
}
