package Day14_Arrays;

import java.util.Arrays;

public class Topic7_HA_ToCharArray {
    public static void main(String[] args) {
        String MyString = "Convert"; // 'C'+'o'+'n'+'v'+'e'+'r'+'t'

        char [] MyCharArray = MyString.toCharArray();
        System.out.println(Arrays.toString(MyCharArray));

        String s = "Ice skating"; // I c e   s k a t i n g

        char [] MyIceSkatingArray = s.toCharArray();
        System.out.println(Arrays.toString(MyIceSkatingArray));

        // Anagram
        // Listen   - Silent
        // Meat     - Team
        // Triangle - Integral
        // cinema   - Iceman

        // "A" and 'A'
        // "A" and 65


    }
}
