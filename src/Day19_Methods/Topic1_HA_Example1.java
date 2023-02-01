package Day19_Methods;

import java.util.Arrays;

public class Topic1_HA_Example1 {
    public static void main(String[] args) {
/*
Write a program to shift every element of an array to circularly right. E.g.-
INPUT : 1 2 3 4 5
        0 1 2 3 4

OUTPUT : 5 1 2 3 4
         0 1 2 3 4
Output[1] = Input[0]
Output[2] = Input[1]
Output[3] = Input[2]
Output[4] = Input[3]

Output[0] = Input[4]

 */

        /*
        I need to create an array 1 2 3 4 5
        I need to create another empty array to put my result in it
        iterate each element and put it in the correct position
         */

        //I need to create an array 1 2 3 4 5
        int [] MyNumbers = {1,2,3,4,5};
                        //  0 1 2 3 4
        //I need to create another empty array to put my result in it
        int [] MyNewNumber = new int[MyNumbers.length];

        //iterate each element and put it in the correct position

//        Output[0] = Input[4]
        MyNewNumber[0] = MyNumbers[MyNumbers.length-1];

        for (int i = 1; i <=MyNumbers.length-1 ; i++) {
            //Output[1] = Input[0]
            MyNewNumber[i] = MyNumbers[i-1];  // i = 1
            //Output[2] = Input[1]    i=2
        }

        System.out.println(Arrays.toString(MyNewNumber));

    }
}
