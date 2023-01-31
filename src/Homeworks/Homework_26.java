package Homeworks;

import java.util.Arrays;

public class Homework_26 {
    public static void main(String[] args) {
        //Write code where it shifts all the elements in array by one index and
        // put the first index at the end of the array
        //example array = {2,3,4,5,6,7,8,9} ===> shifted array = {3,4,5,6,7,8,9,2}
        // need new array in one index// new index is my new array
        //first index to the end//for loop

        int[] element = {2, 3, 4, 5, 6, 7, 8, 9};                          //existing array
        int[] NewIndex = new int[element.length];                          //new array
        for (int i = 0; i < element.length - 1; i++) {                    //i=0 start;i<length end
            NewIndex[i] = element[i + 1];                                 //starts with second index//from3
        }
            NewIndex[element.length - 1] = element[0];                   //0 index goes  back

            System.out.println(Arrays.toString(element));
            System.out.println(Arrays.toString(NewIndex));

    }
}


//int [ ] numbers = {2,3,4,5,6,7,8,9};
  //  int [] shiftednumbers=new int[numbers.length];
//for (int i = 0; i <numbers.length-1 ; i++) {
  //      shiftednumbers[i]=numbers[i+1];


 //       shiftednumbers[numbers.length-1]=numbers[0];
 //       System.out.println(Arrays.toString(numbers));
  //      System.out.println(Arrays.toString(shiftednumbers));