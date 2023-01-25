package Day15_ArraysandForEach;

import java.util.Arrays;

public class Topic3_HA_StandardDeviation {
    public static void main(String[] args) {
        // calculate standard deviation
        int [] Numbers = {10,8,10,8,8,4};
        int n = Numbers.length;

        // find the total
        // for ( Datatype VariableName : YourArray){}
        int Total = 0;
        for (int MyNumber : Numbers ){
            Total = Total + MyNumber;
        }
        System.out.println("Total = " + Total);

        int Mean = Total / n;

        // i need to create an empty array
        // DataType [] VariableName = new Datatype[Length]
        int [] NewArray = new int[n];

        // I will get the element and subtract mean and put it into new array
        for (int i = 0; i < n; i++) {  // i<=5  ->   i<6
            NewArray[i] = (Numbers[i] - Mean) * (Numbers[i] - Mean)  ; // i=0 -> NewArray[0] = Numbers[0] - 8;
        }

        //double MyDouble = Math.pow(4,2);
        //System.out.println("MyDouble = " + MyDouble);



        System.out.println(Arrays.toString(NewArray));
        int Total2 = 0;
        for (int CurrentNumberInNewArray : NewArray){
            Total2 = Total2 + CurrentNumberInNewArray;
        }
        System.out.println("Total2 = " + Total2);

    }
}
