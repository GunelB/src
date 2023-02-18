package Day28_Exception;

import java.util.Scanner;

public class Topic3_GB_ExceptionsCont {

    public static void main(String[] args) {
        int[] MyArray = {11, 22, 33};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter index");
        int index = scan.nextInt();
        try {
            System.out.println(MyArray[index]);
        } catch (Exception e) {
            System.out.println("we do not have index");
        }
    }
}