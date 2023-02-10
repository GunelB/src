package Day23_Classes_Encapsulation;

import java.util.ArrayList;

public class Animal {
    String Name;
    String Color;

    String FatherName;
    String MotherName;

    int Age;

    ArrayList<String> Children;

    // create a constructor to be able to set Name and Color
    public Animal (String p_Name, String p_Color){

        Children = new ArrayList<>();
        Age = 4;

        Name = p_Name;
        Color = p_Color;
    }

    public Animal (String p_Name, String p_Color, String p_fatherName, String p_MotherName){

    }
}
