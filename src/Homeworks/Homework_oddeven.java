package Homeworks;

import java.util.Scanner;

public class Homework_oddeven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

          System.out.println("Please Enter the number");
          int  number = scan.nextInt();

          OddOrEven(number);

    }

        public static String OddOrEven(int number) {
            int n = 0;
            int sum = 0;
            String EvenOrOddNumber = "";
            while(number>0){
                n = n + number % 10;
                number = number / 10;
            }
            System.out.println("EvenOrOddNumber = " + EvenOrOddNumber);
            if(n%2==0){
                EvenOrOddNumber = "EvenNumber";
                System.out.println(EvenOrOddNumber);
            }else {
                EvenOrOddNumber = "OddNumber";
                System.out.println(EvenOrOddNumber);
            }
            return EvenOrOddNumber;
        }
    }



   /*     1 -
   A number is Oddish if the sum of all of its digits is odd, and a number is Evenish if the sum of all of its digits is even. If a number is Oddish, return "Oddish". Otherwise, return "Evenish".
      For example, oddishOrEvenish(121) should return
      "Evenish", since 1 + 2 + 1 = 4. oddishOrEvenish(41) should return "Oddish",
      since 4 + 1 = 5.
        Examples
        oddishOrEvenish(43) ➞ "Oddish"
// 4 + 3 = 7
// 7 % 2 = 1
     oddishOrEvenish(373) ➞ "Oddish"
// 3 + 7 + 3 = 13
// 13 % 2 = 1
        oddishOrEvenish(4433) ➞ "Evenish"
// 4 + 4 + 3 + 3 = 14
// 14 % 2 = 0

    */






