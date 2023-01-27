package Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your word ");
        String UserInput = scan.nextLine();
        String NewString = "";
        for (int i = 0; i < UserInput.length(); i++) {
            String NewSt = "";
            NewSt = NewSt + UserInput.charAt(i);
            if (!NewString.contains(NewSt)) {
                NewString = NewString + UserInput.charAt(i);
            }
        }
        System.out.println("Duplicating characters of an input : " + NewString + "\"");
    }

    }



      /*  Scanner scan= new Scanner(System.in);
        System.out.println("Enter word with double letters each");
        //AADDCC
        String word= scan.nextLine();
        int count;
        char string[]= word.toCharArray();
        for (int i = 0; i < string.length; i++) {
            count=1;
            for (int j =i+1; j < string.length; j++) {
                if (string[i] == string[j]) {
                    count++;
                    string[j]='0';
                }
            }
            if (count>1 && string[i] !='0'){
                System.out.println(string[i]);
            }
                    }




        }


    }









        //REVERSE STRING
     //   String Word = "Ali";
     //   String Reverse = ""; //Create a variable and leave it empty
      //  for (int u = Word.length()-1; u >= 0 ; u--) { // it will count from last index to 0.th index.
     //   Reverse = Reverse + Word.charAt(u);   // reattend your empty variable here.
     //   System.out.println("Reserve of the word is = " + Reverse);
        // if you wanna see all the result give print command in for curly brackets. for "ali" result will be
            /*
            i
            il
            ila
             */


      //  System.out.println("Reserve of the word is = " + Reverse);
        // if you want to see just result("ila" for "ali"), print this out of "for{}" brackets

        //STRING REVERSE FORMULA WITH DELETING A INDEX

   //    String Sentence = "alisan";
   //     String Revese = "";
  //      for (int L = Sentence.length()-1; L >=0; i--) {
      //  if (Sentence.charAt(L) == 'l' || Sentence.charAt(L)=='L'){
    //    continue; //continue napiyodu; girilen kosula esitlendiginnde onu atliyodu. eger burada continue koymaz isek
        // "l" harfini atlamayacak ve ismi tam yazdiracak.
      //  }
      //  Revese = Revese + Sentence.charAt(L);

    //    }
        //System.out.println(Revese);


        // CONTINUE how it works

      //  for (int r = 1; r <5 ; r++) {
        // System.out.println("this is before continue = " + i); //this will print all until 5
    //    if (i == 3) {
     //   continue; // it will not print 3 when the if  condition happens if(i==3), it will pass to 4 from 2.
       // }
     //   System.out.println("this AFTER continue = " + r);
   //     }

       // System.out.println("Please enetr a number");

        //HOW TO COUNT INT DIGITS FORMULA
     //   int Numbere = scan.nextInt();

      //  int Counte = 1;//if I enter here 0 result will be false
    //    while (Numbere / 10 > 0){
      //  Counte++; // or Count = Count + 1;
    //    Numbere = Numbere / 10;
     //   }
   //     System.out.println("Count = " + Counte);



    /*    System.out.println("Total = " + Totalee);

        //INTEGER REVERSE FORMULA
        int Input = scan.nextInt();
        int reverse= 0;
        int remainder=0;

        while(Input!=0){
        remainder = Input%10;
        reverse = reverse*10+remainder;
        System.out.print( remainder);// this sout command with print not println will print what exactly we want.
        Input = Input/10;
        }
        System.out.println("reverse = " + reverse);// if a number includes 0 at last index or indexes(like 100 or 150)
        // this sout command won't give 001 or 051. it will give 1 or 51.
        // but it will work for the numbers like 105,855,255


        // STRING REVERSE  WITH WHILE

   //     String url =  "www.google.com";
     //   int iStrLength=url.length();
   //     while(iStrLength >0)
    //    {
     //   System.out.print(url.charAt(iStrLength -1));
       // iStrLength--;

     //   }

        //TO.STRING METHOD
     //   int [] Numbers = {1,7,99,66};         //for int
    //    System.out.println(Arrays.toString(Numbers));

    //    String [] Cities = {"London", "Toronto"}; // for string
    //    System.out.println(Arrays.toString(Cities));


/// FINDING DUPLICATE CHARACTER FORMULA

   /*     System.out.println("please enter your word or sentence");
        String UserIn = scan.nextLine();
        String What_We_Want = "";
        for (int Z = 0; Z <UserIn.length() ; Z++) {
        String DontNeed = "";
        DontNeed = DontNeed + UserIn.charAt(Z);
        if (!What_We_Want.contains(DontNeed)){
        What_We_Want = What_We_Want + UserIn.charAt(Z);
        }
        }
        System.out.println("Duplicating characters of your sentence/s are/is \""+What_We_Want+"\"");

         INT ARRAY REVERSE FORMULA
       int [] Array1 = {1,2,3};
       int [] Array2 = new int[Array1.length];
        for (int B = Array1.length-1; B >=0 ; B--) {
      Array2[Array1.length-1-B] = Array1[B];
     System.out.println("Array2 = " +Arrays.toString( Array2));*/
