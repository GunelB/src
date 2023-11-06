package Day36_InterviewPracticeNumbers;

import java.util.Arrays;

public class Topic5_HA_BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] data = {-2,45,0,11,-9};

//        Arrays.sort(data);  <-- you can't use this in this interview

        for (int j = 0; j < data.length; j++) {

            for (int i = 0; i < data.length - 1; i++) {
                // -2  <- data[i]
                // 45  <- data[i+1]
                // i=0

                //when i = 1
                // if(45 > 0)
                if ( data[i] > data[i+1]){
                    // Swap the values with using the third variable
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;

                /*
                int temp = a;
                a = b;
                b = temp;
                 */

                }
            }
        }


        System.out.println(Arrays.toString(data));
    }
}

/*
Bubble Sort Algorithm
Selection Sort Algorithm
Insertion Sort Algorithm
 */

/*
for (int j = 0; j < data.length; j++) {
            for (int i = 0; i < data.length - 1; i++) {
                if ( data[i] > data[i+1]){
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                }
         }
}
 */