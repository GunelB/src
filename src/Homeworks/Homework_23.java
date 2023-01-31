package Homeworks;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework_23 {
    public static void main(String[] args) {
      //  Write a code with following requirements:
       // - Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
       // - Find and print the minimum number in the given array
         int[] arr = {6,7,2,3,90,-2,-90,-122,96,35};
        System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Min number is = " +arr[0]);
         // ArrayList<Integer>numbers =new ArrayList<Integer>();
        //   numbers.add(6);
        //   numbers.add(7);
       //    numbers.add(2);
         //  numbers.add(3);
           //numbers.add(90);
          // numbers.add(-2);
         //  numbers.add(-90);
         //  numbers.add(-122);
          // numbers.add(35);

       // System.out.println("Minimum value " + Collections.min(numbers));
        

        

            }
        }



