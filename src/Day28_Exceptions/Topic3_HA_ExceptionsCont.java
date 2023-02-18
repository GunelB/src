package Day28_Exceptions;

import java.util.Scanner;

public class Topic3_HA_ExceptionsCont {
    public static void main(String[] args) {
        int[] MyArray = {11,22,33};

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an index");
        int index = scan.nextInt();

        try {
            System.out.println(MyArray[index]);
        } catch (Exception e){
            System.out.println("We don't have index "+index);
        }


        System.out.println("Rest of the code");
    }
}
