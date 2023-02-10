package Day23_Classes_Encapsulation;

public class Employee {
    // Fields
    // default -> we can access it from same package
    // public, private, protected or default
    String Name;
    String Surname;
    String Department;

    // Methods
    // Get Full Name
    // Create a method, which returns full name
    // publicorPrivateorProtectedorDefault staticornot returntype methodname
    public String GetFullName (){
        return Name+" "+Surname;
    }
}

