package Day15_ArraysandForEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Topic3_GB_StandardDeviation {
    public static void main(String[] args) {
        int[] Numbers={10,8,10,8,8,4};
        int n = Numbers.length;
        int Total = 0;
        for (int MyNumber : Numbers) {
            Total=Total+MyNumber;
        }
        System.out.println("Total = " + Total);
        int Mean= Total/n;



        //need empty array
        //will get element(each numberes)  and subtract mean put into new array

         int[] MyArrays= new int[n];
        // wiil get element and subtract mean and put it into new arry
        for (int i = 0; i <n ; i++) {
           MyArrays[i] = (Numbers[i] - Mean)*(Numbers[i]-Mean);

         //double MyDouble =  Math.pow(4,2);
           // System.out.println("MyDouble = " + MyDouble);

        }
        System.out.println(Arrays.toString(MyArrays));
        double Total2=0;
        for (int NumbInNewArray:MyArrays) {
            Total2=Total2+ NumbInNewArray;
        }
        System.out.println("Total2 = " + Total2);

        double Variance =Total2/(n-1);
        System.out.println("Variance = " + Variance);


        double StandardDeviation = Math.sqrt(Variance);

        System.out.println("StandardDeviation = " + StandardDeviation);
        System.out.println(Math.round(StandardDeviation));
        System.out.println(Math.round(StandardDeviation*100.0)/100.0);



        }


    }


