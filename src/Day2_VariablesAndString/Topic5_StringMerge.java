package Day2_VariablesAndString;

public class Topic5_StringMerge {
    public static void main(String[] args) {
        // create 2 String variables
        // Name = "YourName"
        // Surname = "YourSurname"

        // Type VariableName = Value;
        String Name = "Hayri";
        String Surname = "Aslan";

        String FullName = Name +" "+Surname;
        System.out.println(FullName);

        System.out.println("*****************");

        System.out.println(Name+" "+Surname);

        System.out.println("My name is = "+Name);
        System.out.println("My surname is = "+Surname);


        System.out.println("Hello, My name is "+Name+" and my surname is "+Surname+". I'm learning Java today.");

        String Something = "12345";  // this is a text. this is not a number

        int Year = 2022; // this is a number

        System.out.println("We are in "+Year);

        int a = 5;
        int b = 6;
        System.out.println(a+b);

        char ch = 'R';
        String ACharacter = "R";
        // Toys-R Us
        String Company = "Toys"+"-"+ch+" "+"Us";
//        String Company = "Toys-"+ch+" Us";  <- this code is same with above.

        System.out.println(Company);

        // PascalCase
        // camelCase

        char Char_1 = 'A'; //A = 65  ASCII TABLE
        char Char_2 = '1';

        System.out.println("My Chars : "+Char_1+Char_2);

        //String MergeChars = Char_1 +"-"+ Char_2; //A1


    }
}
