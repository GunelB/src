package Day20_MethodOverloadAndWrapperClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Topic3_HA_ArrayList {
    public static void main(String[] args) {
        int [] MyOldArray = new int[3];

        MyOldArray[0] = 97;
        MyOldArray[1] = 11;
        MyOldArray[2] = 47;

        System.out.println(Arrays.toString(MyOldArray));

        int [] MyOldArrayExtra = new int[4];


        MyOldArrayExtra[0] = MyOldArray[0];
        MyOldArrayExtra[1] = MyOldArray[1];
        MyOldArrayExtra[2] = MyOldArray[2];
        MyOldArrayExtra[3] = 1;

        System.out.println(Arrays.toString(MyOldArrayExtra));

        /*
        In Java, we need to declare the size of an array before we can use it.
        Once size is declared, it is hard to change.

        To handle this issue,we can use ArrayList class.
         */

        // ArrayList<DataType(WrapperClass)> VariableName = new Arraylist<>();
        ArrayList<Integer> MyNewArray = new ArrayList<>();

        /*
        Basic Operations on ArrayList

        Add Elements
        Access (get) Element
        Change (set) Element
        Remove Element
         */

        MyNewArray.add(97);
        MyNewArray.add(11);
        MyNewArray.add(47);

        System.out.println("MyNewArray = " + MyNewArray);

        MyNewArray.add(1);
        System.out.println("MyNewArray, after adding 1 = " + MyNewArray);

        MyNewArray.add(45);
        System.out.println("MyNewArray = " + MyNewArray);

        int x = 11;

        MyNewArray.add(x);
        System.out.println("MyNewArray = " + MyNewArray);


        /*
        int     -   Integer
        double  -   Double
        boolean -   Boolean
        short   -   Short
        float   -   Float
        byte    -   Byte
        char    -   Character
        String
         */



    }
}
