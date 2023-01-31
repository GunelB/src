package Day18_Methods;

public class Topic3_HA_Example2 {
    public static void main(String[] args) {
/*
https://codingbat.com/java

Given 2 arrays of ints, a and b, return true if they have the same first element
or they have the same last element.
for ex.
([1, 2, 3], [7, 3]) → true
([1, 2, 3], [7, 3, 2]) → false
([1, 2, 3], [1, 5]) → true
 */

        /*
        Given 2 arrays of ints, a and b,

        I need to create 2 array of integers
         */

        int[] a = {1,2,3};
        int[] b = {7,3,2};

        boolean Result = Compare2Arrays(a,b);
        System.out.println("Result = " + Result);

        /*
        return true if they have the same first element
            or they have the same last element.

            Create a method to check given condition
            Parameters 2 parameters, They will be array of integers (int[])
            ReturnType boolean
         */

        //public static ReturnType MethodName (Param1Type Param1Name, Param2Type Param2Name)

    }

    public static boolean Compare2Arrays (int [] Array1, int[] Array2 ){
        /*
        return true if they have the same first element
            or they have the same last element.

            I need to get first element of each array
            I need to get last element of each array
         */

        //I need to get first element of each array
        int FirstElementofArray1 = Array1[0];
        int FirstElementofArray2 = Array2[0];

//        int[] a = {1,2,3,77,8}
//        int[] b = {7,3};
        //I need to get last element of each array


//        int[] a = {1,2,3,77,8}    <- a.length = 5
                 //  0 1 2 3  4     <- a[4] = 8    a.length-1

//        int[] a = {1,2,3}         <- a.length = 3
        //           0 1 2          <- a[2] = 3    a.length-1
        int LastElementofArray1 = Array1[Array1.length-1];
        int LastElementofArray2 = Array2[Array2.length-1];

        //return true if they have the same first element
        //            or they have the same last element.


        boolean ReturnValue;
        if( FirstElementofArray1 == FirstElementofArray2 || LastElementofArray1 == LastElementofArray2 ){
            ReturnValue = true;
        }
        else {
            ReturnValue = false;
        }

        return ReturnValue;
    }

}
