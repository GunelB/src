package Day16_Methods;

import java.util.Scanner;

public class Topic4_HA_MethodsCont {
    public static void main(String[] args) {
        //write a program that get birth year from user 5 times
        // we will calculate the age
        // we will print you can buy liquor if user is over 19

        Scanner scan=new Scanner(System.in);

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Please enter your birth year");
            int BirthYear = scan.nextInt();

            int MyAge = CalculateAge(BirthYear);

            CheckAndPrint(MyAge);
        }



    }


    /// Create a method to calculate Age
    /// it will take an int as parameter (Birth Year)
    /// it will return the age based on the birth year (int)
    /// MethodName = CalculateAge
    //public static ReturnType MethodName (Param1Type Param1Name, Param2Type Param2Name........)

    public static int CalculateAge(int BirthYear){
        int Age = 2023 - BirthYear;
        return Age;
    }

    /// create a method
    /// this method will take an int as parameter
    /// MethodName CheckAndPrint
    /// no return
    //public static ReturnType MethodName (Param1Type Param1Name, Param2Type Param2Name........)

    public static void CheckAndPrint (int Age){
        if (Age >= 19){
            System.out.println("You can buy liquor!");
        }
    }

}
