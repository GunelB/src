package Homeworks;

import java.util.Arrays;

public class Homework_26 {
    public static void main(String[] args) {
        //Write code where it shifts all the elements in array by one index and
        // put the first index at the end of the array
        //example array = {2,3,4,5,6,7,8,9} ===> shifted array = {3,4,5,6,7,8,9,2}


        int[] newElements = new int[]{2, 3, 4, 5, 6, 7, 8, 9};
        int n=newElements.length-1;
        System.out.println(Arrays.toString(newElements));
        for (int i = 0; i <n; i++) {
            System.out.println(newElements[i]+"");
        }
        for (int i = 0; i <=n ; i++) {
            int j,first;
            first=newElements[0];
            for (int k = 0; k <newElements.length-1 ; k++) {


            }

        }

    }

}
/*
    int[] array1 = {2, 3, 4, 5, 6, 7, 8, 9};
    int[] array2={2, 3, 4, 5, 6, 7, 8, 9};
    int X= array1.length-1;
for (int a = 0; a <= X; a++) {
        int b = a+1;

        if(a==X) {
        b=0;
        }
        array1 [a] = array2 [b];

        }
        System.out.println(Arrays.toString(array1)); */


