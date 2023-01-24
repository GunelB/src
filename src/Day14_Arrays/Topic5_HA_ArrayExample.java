package Day14_Arrays;

import java.util.Arrays;

public class Topic5_HA_ArrayExample {
    public static void main(String[] args) {
        int [] Array1 = {1,8,9};
        int [] Array2 = {55,21,97,-9};

//        int [] Array3 = Array1 + Array2; you can't use this. Java will throw an error.

        // I want to add 2 arrays into 1
        // {1,8,9,55,21,97,-9}
        /*
        i need to create another array
        this array will empty
        DataType [] VariableName = new Datatype[length];
        I need to find total length
        I need to put the values of Array1 into Array3 first
        I'll put the values of Array2 into Array3
         */
        int TotalLength = Array1.length + Array2.length;
        int [] Array3 = new int[TotalLength];

        for (int i = 0; i < Array1.length; i++) {
            //I need to put the values of Array1 into Array3 first
            //i = 0
            Array3[i] = Array1[i];
            /*
            Array1 = {1,8,9}
            Array3 = {0,0,0,0,0,0,0}
            in the first iteration  Array3[i] = Array1[i] <- i =0
            Array1 = {1,8,9}
            Array3 = {1,0,0,0,0,0,0}
            in the second iteration  Array3[i] = Array1[i] <- i = 1
            Array1 = {1,8,9}
            Array3 = {1,8,0,0,0,0,0,0}
             */
        }

        System.out.println(Arrays.toString(Array3));

        // Array3 = {1,8,9,0,0,0,0}
        // Array2 = {55,21,97,-9}
        for (int i = 0; i < Array2.length; i++) {
            // i = 0
            Array3[i+Array1.length] = Array2[i];
            //Array3[4] = Array2[1]; // in the second iteration i=1
        }

        System.out.println(Arrays.toString(Array3));

    }
}
