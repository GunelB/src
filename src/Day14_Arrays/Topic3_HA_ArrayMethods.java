package Day14_Arrays;

import java.util.Arrays;

public class Topic3_HA_ArrayMethods {
    public static void main(String[] args) {
        // DataType [] VariableName = {values will be here}
        // DataType [] VariableName = new DataType[length]

        int [] Numbers = {1, 7, 99, 66};

        System.out.println(Numbers);
        // To print an array we need to convert it to string
        // Arrays.toString ( yourArrayVariableName );
        System.out.println(Arrays.toString(Numbers) );

        String [] Cities = {"London", "Toronto"};

        System.out.println( Arrays.toString( Cities ) );

        for (int i = 0; i < Cities.length; i++) {
            System.out.println(Cities[i]);
        }

        int [] Values = {99,35,86,-9,11};
        // sort this array
        // Bubble Sort Algorithm <- Interview Question
        // selection sort algorithm
        // insertion sort algorithm
        // {-9, 11, 35, 86, 99}

        System.out.println(Arrays.toString(Values));
        Arrays.sort(Values);
        System.out.println("After sort : "+ Arrays.toString(Values));

        System.out.println("************************");
        int [] MyNumber = {78,34,5,-230,67};
        System.out.println("Before Sort : "+ Arrays.toString(MyNumber));
        Arrays.sort(MyNumber);
        System.out.println("After Sort : "+ Arrays.toString(MyNumber));



    }
}
