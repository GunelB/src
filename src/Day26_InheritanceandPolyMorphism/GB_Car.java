package Day26_InheritanceandPolyMorphism;

public class GB_Car {
    String Brand;
    public GB_Car (){
        System.out.println("This is printed constructor");
        System.out.println(Brand);
    }
    //Initializer
    {
        System.out.println("Initializer");
        Brand ="Ford";
    }

    public static void main(String[] args) {
        GB_Car MyCar = new GB_Car();
    }
}
