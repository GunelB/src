package Day14_Arrays;

import java.util.Arrays;

public class Topic4_HA_ArrayMethodsCont {
    public static void main(String[] args) {
        String [] Animals = {"Dog", "cat", "horse", "Lion"};

        System.out.println(Arrays.toString(Animals));
        Arrays.sort(Animals); // case sensitive
        System.out.println(Arrays.toString(Animals));

        /*
        Ascii table
        A = 65    a = 97
        B = 66    b = 98
        D = 68    d = 100
         */

        int [] Array1 = {1, 2 , 3};
        int [] Array2 = {1, 2 , 3};

        //Arrays.equals(Array1, Array2); //to compare 2 arrays, we will use Arrays.equals

        //Arrays.toString <- to convert an array to String, so we can print it
        //Arrays.sort     <- to sort an array, so we don't have to write sorting algorithms from scratch
        //Array.equals    <- to compare 2 arrays

        System.out.println(Arrays.equals(Array1, Array2));
        System.out.println("*******************");
        String [] Cars1 = {"Toyota", "Jeep", "Subaru"};
        String [] Cars2 = {"Jeep", "Toyota", "Subaru"};

        System.out.println(Arrays.equals(Cars1, Cars2));
        // even though I have same values in the arrays
        // they are not in the same order. That's why they are equals

        Arrays.sort(Cars1);
        Arrays.sort(Cars2);
        System.out.println("After Sort : "+Arrays.equals(Cars1, Cars2));





    }
}
