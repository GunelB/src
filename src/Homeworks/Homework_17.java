package Homeworks;

import java.util.Scanner;

public class Homework_17 {
    public static void main(String[] args) {

        //   Write a code where the user is asked to enter an integer number - sum of all the oddnumbers //between 1 to given number (included) but exclude the 9,11,23,35 from the total //sum if those //numbers happen to be in the range of 1 to the given number.

  //user to enter an int numb-
        // sum of all odd numbers
  // between 1 to given number exclude the 9,11,23,35 from the total

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number");
        int Number = scan.nextInt();
        int SumOddNumber =0;
        int SumEvenNumber =0;
        int Rem =Number %2;
        for (int i = 1; i <Number; i++) {
            if (i % 2 == 1) {
                if (i==9 || i==11 || i==23 || i==35){
                    continue;
                }
                     SumOddNumber =SumOddNumber + i;
                System.out.print("Sum of Odd number="  +SumOddNumber);

                } else {
                      SumEvenNumber= SumEvenNumber+i;
                System.out.println("Sum of even number="  +SumEvenNumber);
                }





            }


        }

    }

