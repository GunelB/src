package Day6_StringAndStringMethods;
import java.util.Scanner;
public class Topic1_GB_ScannerNext {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 vegies and separate them with space");
        String Veg1 = scan.next();
        String Veg2 = scan.next();
        System.out.println("Veg1 = " + Veg1);
        System.out.println("Veg2 = " + Veg2);
        System.out.println("Please enter your name,surname and age and separate with space");
        String Name = scan.next();
        String Surname = scan.next();
        int Age = scan.nextInt();
        System.out.println("Name = " + Name);
        System.out.println("Surname = " + Surname);
        System.out.printf("Name=%s,Surname =%s,Age= %d");

    }
}


