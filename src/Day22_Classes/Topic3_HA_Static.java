package Day22_Classes;

public class Topic3_HA_Static {
    public static void main(String[] args) {
        RenastechStudentRegistrationForm MyForm = new RenastechStudentRegistrationForm();

        MyForm.Name = "Hayri";
        MyForm.Surname = "Aslan";

        System.out.println(MyForm.Name);
        System.out.println(MyForm.School);

        System.out.println("--------------------");
        RenastechStudentRegistrationForm MyNewForm = new RenastechStudentRegistrationForm();
        System.out.println(MyNewForm.School);
    }
}

class RenastechStudentRegistrationForm {

    /*
    The static keyword in Java mainly used for memory management.
    The static variable can be used to refer the common property of all instances (objects)
    (which is not unique for each object)

    In other words, a static field is shared by all copies(instances) of the class, thus all see the same.

    for example the company name same for everybody
    suppose we have 500 employee in the company, that's mean 500 employee binder.
    Now all fields will get memory each time when you create the object
    All employees will have it's unique name and surname. So copy of the fields are good in such case.
    Here "CompanyName" refers to common field of all instances.
    if we make it static, this field will get memory only once.
     */
    String Name;
    String Surname;

    static String School = "Renastech";
}