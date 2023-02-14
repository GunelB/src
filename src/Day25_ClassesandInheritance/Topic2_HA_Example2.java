package Day25_ClassesandInheritance;

public class Topic2_HA_Example2 {
    public static void main(String[] args) {

        Integer i = 5;

        Address MyHomeAddress = new Address();
        MyHomeAddress.StreetNumber = 102;
        MyHomeAddress.StreetName = "Yonge Street";
        MyHomeAddress.City = "Toronto";
        MyHomeAddress.PostalCode = "L6H 0T7";

        // 102 Yonge Street, Toronto, L6H 0T7

        Tester ATester = new Tester();
        ATester.Name = "Rebecca";
        ATester.HomeAddress.StreetNumber = 97;
        ATester.HomeAddress.StreetName = "Alligator Street";
        ATester.HomeAddress.City = "Hurricane";
        ATester.HomeAddress.PostalCode = "L0L 0L0";

        Tester SecondTester = new Tester();
        SecondTester.Name = "Derya Bali";
        SecondTester.HomeAddress.StreetName = "Church Street";
        SecondTester.HomeAddress.StreetNumber = 1;
        SecondTester.HomeAddress.City = "Homeless";




    }
}
