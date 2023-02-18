package Day28_Exceptions;

import java.util.Scanner;

public class Topic5_GB_MultipleExceptionsContinue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int value = scan.nextInt();
        try {
            int a = 10 / value;
            System.out.println(a);
            int[] MyArray = {23, 45, 45};
            System.out.println("Enter index");
            int index = scan.nextInt();
            System.out.println(MyArray[index]);

        } catch (ArithmeticException MyException) {
            System.out.println("Can t div zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("We do not have 7");
        }

    }
}