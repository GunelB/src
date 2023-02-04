package Day21_ArrayList;

import java.util.ArrayList;

public class Topic4_HA_PositiveDominant {
    public static void main(String[] args) {
/*
An array is positive dominant if it contains strictly more unique positive values than unique negative values. Write a method that returns true if an array is positive dominant, false, otherwise.

Examples
isPositiveDominant([1, 1, 1, 1, -3, -4]) ➞ false
// There is only 1 unique positive value (1).
// There are 2 unique negative values (-3, -4).

isPositiveDominant([5, 99, 832, -3, -4]) ➞ true

isPositiveDominant([5, 0]) ➞ true

isPositiveDominant([0, -4, -1]) ➞ false

Notes
0 counts as neither a positive nor a negative value.
 */

        //We need to create a method
        // parameters 1 - int []
        // returntype boolean
        int [] Numbers = {0, -4, -1};
        System.out.println(isPositiveDominant(Numbers));
    }

    public static boolean isPositiveDominant (int [] MyArray){
        /*
        I need to find how many unique positive number I have
        I need to find how many unique negative number I have
        Compare them
        If I have more unique positive number, I'll return true
        otherwise I'll return false
         */

        ArrayList<Integer> UniquePositiveNumbers = new ArrayList<>();
        ArrayList<Integer> UniqueNegativeNumbers = new ArrayList<>();

        //I need to find how many unique positive number I have
        for (int Number : MyArray ){
            if (Number > 0){
                if(UniquePositiveNumbers.contains(Number) == false){
                    UniquePositiveNumbers.add(Number);
                }
            } else if(Number < 0){  //I need to find how many unique negative number I have
                if (UniqueNegativeNumbers.contains(Number) == false){
                    UniqueNegativeNumbers.add(Number);
                }
            }
        }

        //Compare them
        //        If I have more unique positive number, I'll return true
        //        otherwise I'll return false

        boolean ReturnValue;

        if (UniquePositiveNumbers.size() > UniqueNegativeNumbers.size() ){
            ReturnValue = true;
        } else {
            ReturnValue = false;
        }

      return ReturnValue;
    }
}
