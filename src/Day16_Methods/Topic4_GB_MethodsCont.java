package Day16_Methods;

import java.util.Scanner;

public class Topic4_GB_MethodsCont {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for (int i =1; i <=5 ; i++) {
            System.out.println("Enter your birthyear");
        }
        int BirthYear=scan.nextInt();

      int MyAge= CalculateAge(BirthYear);
       CheckAndPrint(MyAge);


    }


    public static int CalculateAge(int BirthYear){
    int Age= 2023-BirthYear;
     return Age;
    }
    public static void CheckAndPrint(int age){
      //    if (Age >=19) {
              System.out.println("You can buy l");
          }

    }

