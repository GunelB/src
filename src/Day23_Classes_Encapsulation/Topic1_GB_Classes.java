package Day23_Classes_Encapsulation;

public class Topic1_GB_Classes {
    public static void main(String[] args) {
        //DataType VariableName =new DataType()
        Employees MyEmployee = new Employees();
        MyEmployee.Name= "Gunel";
        MyEmployee.Surname="Bagh";
        MyEmployee.Department= "AAA";
    }
}
//Encapsulation
//public
//private
//protected
//default - we can access from same package

/*
a) private : private fields or methods or constructors are visible within the class in which they are defined.
b) protected : Protected members of a class are visible within the package, but they can be inherited to subclasses outside the package.
c) public : public members are visible everywhere.
d) default or No-access modifiers : Members of a class which are defined with no access modifiers are visible within the package in which they are defined. */