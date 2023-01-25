package Day15_ArraysandForEach;

import java.util.Arrays;

public class Topic2_HA_Example {
    public static void main(String[] args) {
// Given an array of ints length 3, return a new array with the elements in reverse order,
// so {1, 2, 3} becomes {3, 2, 1}.

        /*
        I will create an array {1, 2, 3}
        I need to create an empty array
        I need to iterate the first array - downwards
        I need to put each element into new array
         */

        //I will create an array {1, 2, 3}
        int [] Array1 = {1, 2, 3,4,99};

        //I need to create an empty array
        // Datatype [] VariableName = new Datatype[Length]
        int [] Array2 = new int[Array1.length];

        //I need to iterate the first array - downwards
        //      {1, 2, 3}          {7, 8, 9, 20, 55}
        //index  0  1  2            0  1  2   3   4
        for (int i = Array1.length-1; i >=0 ; i--) {
            Array2[Array1.length-1-i] = Array1[i]; // i=2
            //Array2[1] = Array1[1]; // i=1
            //Array2[2] = Array1[0]; // i=0
        }

        System.out.println(Arrays.toString(Array2));

    }
}
