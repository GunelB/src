package Day22_Classes;

import java.util.Scanner;

public class Topic2_GB_IntroToClassesCont {
    public static void main(String[] args) {
        StudentRegistrationForm MyForm = new StudentRegistrationForm();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        MyForm.Name= scan.nextLine();
        System.out.println("Please enter your surname: ");
        MyForm.Surname= scan.nextLine();
        System.out.println("Please enter your gender: ");
        MyForm.Gender= scan.nextLine();
        System.out.println("Please enter your age: ");
        MyForm.Age= scan.nextInt();
    }
//}
 //class StudentRegistrationForm{
    String Name;
    String Surname;
    int Age;
    String Gender;

    void PrintRegistrationForm(){
        System.out.println("Name: " +Name);
    }
 }
