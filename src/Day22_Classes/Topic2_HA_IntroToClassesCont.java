package Day22_Classes;

import java.util.Scanner;

public class Topic2_HA_IntroToClassesCont {
    public static void main(String[] args) {
        // DataType VariableName = new DataType();
        StudentRegistrationForm MyForm = new StudentRegistrationForm();

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name : ");
        MyForm.Name = scan.nextLine();

        System.out.println("Please enter your surname : ");
        MyForm.Surname = scan.nextLine();

        System.out.println("Please enter your gender : ");
        MyForm.Gender = scan.nextLine();

        System.out.println("Please enter you age : ");
        MyForm.Age = scan.nextInt();

        MyForm.PrintRegistrationForm();
    }

}

class StudentRegistrationForm{

    //Fields
    String Name;
    String Surname;
    int Age;
    String Gender;

    //Methods
    void PrintRegistrationForm(){
        System.out.println("Name : "+Name);
        System.out.println("Surname : "+Surname);
        System.out.println("Gender : "+this.Gender);
        System.out.println("Age : "+Age);
    }
}