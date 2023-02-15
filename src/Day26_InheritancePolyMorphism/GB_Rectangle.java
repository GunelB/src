package Day26_InheritancePolyMorphism;

public class GB_Rectangle {
    // Encapsulation - public private protected default
    //non-access modifiers  = final static abstract synchronized
    // Field attribute variable
    int length;
    int width;
    /**
     * *This is a construtor for Rectangle
     * @param p_length this is the length of the rectangle
     * @param p_width this is width
     */

    public GB_Rectangle(int p_length, int p_width){
        length = p_length;
        width =p_width;
        /**
         * PrintArea: This method will calculate (length*width)
         * This method will not take any paremeters.
         * @return void
         * @authorGB
         */
    //    public void PrintArea(){
            System.out.println("Area: " + (length*width));
        }
        /**
         * PrintPerimeter : lenght + width
         */
   //     public void PrintPerimeter(){
        //    System.out.println();
//
        }




