package Day23_Classes_Encapsulation;

public class Topic1_HA_Classes {
    public static void main(String[] args) {
        // DataType VariableName = new Datatype()
        Employee MyEmployee = new Employee();
        MyEmployee.Name = "Henry";
        MyEmployee.Surname = "Aslan";
        MyEmployee.Department = "R&D";

        MyEmployee.SetSIN("123456789");

        System.out.println(MyEmployee.GetFullName());

        System.out.println(MyEmployee.GetSIN());

    }
}


/*
Encapsulation

- public
- private
- protected
- default
 */