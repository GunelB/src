package Day26_InheritanceandPolyMorphism;

public class Rectangle {
    // Encapsulation
    // public, private, protected and default   <- Access Modifiers

    // Non-Access modifiers
    // final, static, abstract, synchronized

    // Fields
    // Attributes
    // Variables

    int Length;
    int Width;

    /**
     * This is a constructor for Rectangle.
     * <p>
     * This method takes 2 parameters.
     * @param p_Length this is the length of the rectangle
     * @param p_Width this is the width of the rectangle
     * @return Constructor will not return something.
     * @see Object
     */
    public Rectangle(int p_Length, int p_Width){
        Length = p_Length;
        Width = p_Width;
    }

    /**
     * PrintArea: This method will print the area. (Length * Width)
     * This method will not take any parameters.
     * @return void
     * @author Hayri Aslan
     */
    public void PrintArea(){
        System.out.println("Area : "+ (Length * Width));
    }

    /**
     * PrintPerimeter : This method will print the perimeter. 2 * (Length + Width)
     * This method will not take any parameters
     */
    public void PrintPerimeter(){
        System.out.println("Perimeter : "+ 2 * (Length + Width));
    }


}
