package Day28_Exceptions;

import java.util.Scanner;

public class Topic5_HA_MultipleExceptionsCont {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int Value = scan.nextInt();

        try {
            int a = 10 / Value;
            System.out.println(a);

            int[] MyArray = {7, 99, 35, 88};

            System.out.println("Please enter an index");
            int index = scan.nextInt();

            System.out.println(MyArray[index]);
        } catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("We don't have index 7");
        }


        /*
        try {
        }
        catch(){
        }
        catch(){
        }
        catch(){
        }
         */

    }
}
