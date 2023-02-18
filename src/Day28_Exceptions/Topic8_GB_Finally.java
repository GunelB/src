package Day28_Exceptions;

import java.util.Scanner;

public class Topic8_GB_Finally {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
              int a = scan.nextInt();
        try {
            int value = 10/a;
            System.out.println("value");
            //code
        } catch (ArithmeticException e) {
            System.out.println("exception");
        } finally {
            System.out.println("it will get executed");
        }
    }
}

//package Day28_Exceptions;

  //      import java.util.Scanner;

//public class Topic8_HA_Finally {
  //  public static void main(String[] args) {
  //      Scanner scan = new Scanner(System.in);
   //     int a = scan.nextInt();
    //    try {
            //your code will go here
          //  int value = 10 / a;
   ////         System.out.println("value = " + value);
    //    } catch (ArithmeticException e){
    //        System.out.println("There is an exception!");
      //  } finally {
        //    System.out.println("This code will get executed no matter what");
      //  }


   //     try {
    //        System.out.println("Imagine you are opening a file here");

            /*
            do something with file
             */
      //  } finally {
        //    System.out.println("Imagine you are closing the file");
       // }




/*
try {}
catch(){}
catch(){}
finally{}
try {}
catch(){}
catch(){}
try{}
finally{}
Below combinations are wrong
try{
}
sout()
catch(){
}
catch(){}
finally{}
catch(){}
try{}
try{}
finally{}
finally{}
try{}
 */