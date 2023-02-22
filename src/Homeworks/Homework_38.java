package Homeworks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Homework_38 {
    public static void main(String[] args) {
         String[] arrays1={"A","B","C","D","E"};
         String[] arrays2={"F","G","H","I","J","K"};
        System.out.println(MergeArrays(arrays1,arrays2));
    }
    public static ArrayList<String>MergeArrays(String[]array1,String[]array2){
        ArrayList<String> array = new ArrayList<>();
        Collections.addAll(array,array1);
        Collections.addAll(array,array2);
        return array;
    }
}
 /*   Write a method where it takes 2 String arrays and returns to an ArrayList where it contains all of the elements of the Arrays
     arr1   =   {"A",   "B",   "C"};
       arr2   =   {"D",   "E",   "F",   "G"};
        result   ==>   {"A",   "B",   "C",   "D",   "E",   "F",   "G"}

        Please create a method with 2 String array parameters.
        Return an ArrayList of String.
        Method name is MergeArrays  */