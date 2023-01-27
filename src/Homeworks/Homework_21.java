package Homeworks;

import java.util.Scanner;

public class Homework_21 {
    public static void main(String[] args) {
        //Write a program to reverse individual words in a web url, where each word may be delimited by a //dot. Like www.google.com should become www.elgoog.moc
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter web url");
        //enter : url: www.education.com
        String url = scan.nextLine();
        String Reverse = "";
        String [] MySentenceArray =url.split("\\.");
        for (int i =MySentenceArray.length-1; i>=0 ; i--) {
                Reverse= Reverse+"."+MySentenceArray[i];
        }
               String Reverse2 = "";
        for (int i =Reverse.length()-1 ; i >=0; i--) {
                  Reverse2= Reverse2 + Reverse.charAt(i);
        }
        String Reverse3 ="";
        for (int i = 0; i <Reverse.length()-1; i++) {
            Reverse3= Reverse3 + Reverse2.charAt(i);
        }
                System.out.println(Reverse3);
            }




    /*    String rev1= "";
        String [] MySentenceArray = Sentence.split("\\.");
        for (int i = MySentenceArray.length-1; i >=0 ; i--) {
            rev1 = rev1+"."+MySentenceArray[i];
        }
        String rev2 = "";
        for (int i = rev1.length()-1; i >=0 ; i--) {
            rev2 = rev2 + rev1.charAt(i);
        }
        String rev3 = "";
        for (int i = 0; i < rev2.length()-1; i++) {
            rev3 = rev3 + rev2.charAt(i);
        }
        System.out.println(rev3);
                                                                        */



     //reverse a words: www.noitacude.moc


    }

