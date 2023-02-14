package Day25_ClassesandInheritance;

public class Topic2_GB_Example2 {
    public static void main(String[] args) {
        Address_GB MyHomeAddress = new Address_GB();
        MyHomeAddress.StreetNumber = 234;
        MyHomeAddress.StreetName = "Warden";
        MyHomeAddress.City ="Toronto";
        MyHomeAddress.PostalCode = "L0V 1j6";

        Tester_GB ATester = new Tester_GB();
        ATester.Name = "Rebecca";
        ATester.HomeAddress.StreetNumber = 98;
        ATester.HomeAddress.City = "Hurricane";

    }
}
