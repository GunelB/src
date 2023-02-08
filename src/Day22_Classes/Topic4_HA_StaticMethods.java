package Day22_Classes;

public class Topic4_HA_StaticMethods {
    public static void main(String[] args) {
        CupCakeMold.GetStyle();

        //Instance of CupCake
        CupCakeMold MyCupCake = new CupCakeMold();
    }
}

class CupCakeMold {
    //Fields
    String Color;

    //Methods
    static void GetStyle (){
        System.out.println("Tornado");
    }
    /*
    static means that the field or method marked as such is available at the class level.
    In other words, you don't need to create an instance of the class to access it.

    So, instead of creating a copy of CupCakeMold then calling GetStyle() like this
    CupCakeMold MyCupCake = new CupCakeMold();
    MyCupCake.GetStyle();

    You can call the method directly against the class like this:
    CupCakeMold.GetStyle();

    The class is a cupcake mold.
    and the object is the copy made with cupcake mold.
    A static method belongs to cupcake mold and can be accessed directly without making any copies.
     */
}
