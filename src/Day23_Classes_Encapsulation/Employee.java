package Day23_Classes_Encapsulation;

public class Employee {
    // Fields
    // default -> we can access it from same package
    // public, private, protected or default
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
}

