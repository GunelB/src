package Day28_Exceptions;

import java.util.Scanner;

public class Topic6_HA_CatchOrder {
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

            String s = null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("We don't have index 7");
        }
        catch (NullPointerException e){
            System.out.println(e.toString());
        } catch (Exception e){
            System.out.println("Something happened");
        }

    }
}
