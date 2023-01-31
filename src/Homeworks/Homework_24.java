package Homeworks;

import java.util.Arrays;

public class Homework_24 {
    public static void main(String[] args) {
        //  write a code with following requirements
        //- define an array with following values {90,34,23,87,45,36,98}
        //- Print the values that can be divided by 2 or 3

        int[] Value = {90, 34, 23, 87, 45, 36, 98};
        //define an array with following values {90,34,23,87,45,36,98}
        for (int i = 0; i <= Value.length; i++) {
            if (Value[i] % 2 == 0 || Value[i] % 3 == 0) {
                System.out.println(+Value[i]);
            }
        }
    }
}
