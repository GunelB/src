package Day22_Classes;

public class Topic3_GB_Static {
    public void main(String[] args) {
        GB_RenastechStudentRegistrationForm MyForm = new GB_RenastechStudentRegistrationForm();
        MyForm.Name = "Gunel";
        MyForm.Surname = "Bagh";
        MyForm.School
    }

    class GB_RenastechStudentRegistrationForm {
        String Name;
        String Surname;

        static String School = "Renastech";  //static is used for memory management
    }
}