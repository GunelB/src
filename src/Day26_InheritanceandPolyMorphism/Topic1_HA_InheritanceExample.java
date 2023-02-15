package Day26_InheritanceandPolyMorphism;

public class Topic1_HA_InheritanceExample {
    public static void main(String[] args) {
        // Let's calculate the area and perimeter of a Rectangle

        Rectangle MyRectangle = new Rectangle(4,5);
        MyRectangle.PrintArea();
        MyRectangle.PrintPerimeter();

        // is a square a rectangle?

        Square MySquare = new Square(5);
        MySquare.PrintArea();
        MySquare.PrintPerimeter();
    }
}
