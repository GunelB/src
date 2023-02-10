package Day23_Classes_Encapsulation;

public class Topic1_HA_Classes {
    public static void main(String[] args) {
        // DataType VariableName = new Datatype()
        Employee MyEmployee = new Employee();
        MyEmployee.Name = "Hayri";
        MyEmployee.Surname = "Aslan";
        MyEmployee.Department = "R&D";

        System.out.println(MyEmployee.GetFullName());

    }
}


/*
Encapsulation

- public
- private
- protected
- default
 */