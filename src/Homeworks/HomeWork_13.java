package Homeworks;

import java.awt.*;
import java.util.Scanner;

public class HomeWork_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sent = scan.nextLine();
        int count =0;
        char A= 'A';
        char a='a';

        for (int i = 0; i <sent.length(); i++){
            if(sent.charAt(i)=='A'){
                count++;
            }else if (sent.charAt(i)== 'a'){

        }
            System.out.println("There are " +count+ "'A' or 'a'");
        }

       /* for (int i = 1; i <=20 ; i++) {
            if(!(i%2==0 || i%3==0)){
                System.out.printf("%d",i);}
        } */
      /*  Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a number");
        int Num = scan.nextInt();
        int Square = 0;
        for (int i= 0; i <=10; i++) {
            Square =i*i;

            System.out.println(i+ " * "+i+ "=" +i*i); */
        }
    }

