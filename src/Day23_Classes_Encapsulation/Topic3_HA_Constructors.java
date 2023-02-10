package Day23_Classes_Encapsulation;

public class Topic3_HA_Constructors {
    public static void main(String[] args) {
        // Datatype VariableName = new Constructor
        Employee Employee1 = new Employee();
        Employee1.Name = "Hayri";
        Employee1.Surname = "Aslan";
        Employee1.Department = "Dev";

        Employee Employee2 = new Employee();
        Employee2.Name = "Rebecca";
        Employee2.Surname = "Smith";
        Employee2.Department = "QA";

        Employee Employee3 = new Employee();
        Employee3.Name = "Elizabeth";
        Employee3.Surname = "Queen";
        Employee3.Department = "QA";

        Employee Employee4 = new Employee();
        Employee4.Name = "Elizabeth";
        Employee4.Surname = "Queen";
        Employee4.Department = "QA";

        Employee Employee5 = new Employee("Eren", "Dilli", "QA");
        System.out.println(Employee5.Name);


    }
}
