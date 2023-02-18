package Day28_Exceptions;

import java.util.Scanner;

public class Topic4_GB_MultipleExceptions {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter yr numb");
        int FirstNumber = scan.nextInt();
        System.out.println("second num");
        int secondNumber = scan.nextInt();
        try{

            int Value = FirstNumber/secondNumber;
            System.out.println(Value);
        }catch(ArithmeticException e){
            System.out.println("cant div 0");
        }
        int[] MyArray ={1,2,3,4,5,6};
        System.out.println("enter index");
        int index = scan.nextInt();
        try{
            System.out.println(MyArray[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error line30");
        }
    }
}
