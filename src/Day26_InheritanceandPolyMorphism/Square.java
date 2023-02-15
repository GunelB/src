package Day26_InheritanceandPolyMorphism;

public class Square extends Rectangle{
    /**
     * This is constructor for Square
     * @param p_Length this is the length and width of square
     */


    public Square (int p_Length){
        super(p_Length, p_Length);

        //super  <- refers to super class
        //super() <- refers to super's constructor
    }

}
