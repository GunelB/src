package Day23_Classes_Encapsulation;

public class Employee {
    // Fields
    // default -> we can access it from same package
    // public, private, protected or default
    /*
    Access Modifiers
    a) private : private fields or methods or constructors are visible within the class in which they are defined.
    b) protected : Protected members of a class are visible within the package, but they can be inherited to subclasses outside the package.
    c) public : public members are visible everywhere.
    d) default or No-access modifiers : Members of a class which are defined with no access modifiers are visible within the package in which they are defined.
     */
    String Name;
    String Surname;
    String Department;

    // 9 digits
    private String SIN;

    // Getters and Setters
    void SetSIN(String p_SIN){
        if (p_SIN.length() == 9){
            SIN = p_SIN;
        }
    }

    String GetSIN(){
        // I would like to get last 3 digits of SIN
        //856458745   Length = 9
        //012345678
        return "******"+ SIN.substring(SIN.length()-3);
    }

    // Methods
    // Get Full Name
    // Create a method, which returns full name
    // publicorPrivateorProtectedorDefault staticornot returntype methodname
    public String GetFullName (){
        return Name+" "+Surname;
    }


    // Constructor
    // This is a specific method with no return
    // this method get called everytime you create an Employee
    public Employee(){
        System.out.println("You created an Employee");
    }

    public Employee(String p_Name, String p_Surname, String p_Department ){
        Name = p_Name;
        Surname = p_Surname;
        Department = p_Department;
    }
}

