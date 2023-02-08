package Homeworks;

import java.util.Arrays;

public class Homework_30 {
    //Write a method where it takes array of integers and returns the sorted version of that array
    public static void main(String[] args) {
        int [] arr={7,8-78,9,3,2,4,5};
           MyArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void MyArray(int [] array){
        Arrays.sort(array);

    }
}
