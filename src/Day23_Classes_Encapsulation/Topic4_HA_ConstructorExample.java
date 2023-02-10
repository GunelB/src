package Day23_Classes_Encapsulation;

public class Topic4_HA_ConstructorExample {
    public static void main(String[] args) {
        Animal Horse = new Animal("Sahbatur", "Brown");
        Horse.FatherName = "HisFather";
        Horse.MotherName = "HisMother";



        Horse.Children.add("Gulbatur");
        System.out.println(Horse.Name);
    }
}
