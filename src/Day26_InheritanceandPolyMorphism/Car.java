package Day26_InheritanceandPolyMorphism;

public class Car {
    String Brand;
    public Car(){
        System.out.println("This is printed from constructor.");
        System.out.println("Brand = " + Brand);
    }

    // Initializer
    {
        System.out.println("This is printed from initializer");
        Brand = "Ford";
    }

    static {
        System.out.println("This is printed from static initializer");
    }

    public static void main(String[] args) {
        Car MyCar = new Car();

        Car MyCar2 = new Car();

        Car MyCar3 = new Car();
    }
}
