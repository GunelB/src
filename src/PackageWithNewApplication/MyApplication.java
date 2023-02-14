package PackageWithNewApplication;

public class MyApplication {
    String name;
   // String surname;
     private int age ;

    //setter
    public static int SetNameAndLastNameAndReturnAge(String p_NameAndSurName,int p_age){
        System.out.println(p_NameAndSurName);
        return p_age;
    }

}
/*
    Write a code where it calls a method in the different Package and class where it prints your first name and the last name, and returns to your age to be printed.

     Please Create 2 packages. Your class will be in a package and your main application will be in another package. Your age variable will be private and has a default value of your age.
      Create a method called SetNameandLastNameandReturnAge with 2 parameters. Return the Age variable.
      After returning it, print age to screen. */