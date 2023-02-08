package Homeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        char c[];
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();
        char[] ch = sentence.toCharArray();
        //lowerCase to upperCase
        for (int j = 0; j < sentence.length(); j++) {

            //   reverseCase("Happy Birthday") ➞ "hAPPY bIRTHDAY"
            if (ch[i] >= 95&& ch[i] <=122) {
              //  System.out.println(ch);
                ch[i]-= 32;
            }
        }
        System.out.println(ch);
    }
}
//2- Given a string, create a function to reverse the case. All lower-cased letters should be upper-cased, and vice versa.
//     Examples


// reverseCase("MANY THANKS") ➞ "many thanks"

//     reverseCase("sPoNtAnEoUs") ➞ "SpOnTaNeOuS"


 /*   int i;
    char c[];
    Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the string");
                String s1=sc.nextLine();

                char[] ch = s1.toCharArray();
                System.out.print("Uppercase("+s1+")--------->");
                for(i=0;i<s1.length();i++)
        {


        {
        ch[i]-=32;
        }

        }

        System.out.println(ch);

        }*/