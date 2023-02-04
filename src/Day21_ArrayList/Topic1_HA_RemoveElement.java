package Day21_ArrayList;

import java.util.ArrayList;

public class Topic1_HA_RemoveElement {
    public static void main(String[] args) {
        // Create arraylist of double
        // ArrayList<DataType> VariableName = new ArrayList<>();

        ArrayList<Double> MyDoubleArray = new ArrayList<>();

        MyDoubleArray.add(1.7);
        MyDoubleArray.add(2.2);

        System.out.println(MyDoubleArray);

        //[1.7, 2.2]
        //[1.7, 3.5, 2.2]

        MyDoubleArray.add(1, 3.5);
        System.out.println(MyDoubleArray);

        MyDoubleArray.add(0, 4.7);
        System.out.println(MyDoubleArray);

        MyDoubleArray.remove(3);
        System.out.println(MyDoubleArray);

        MyDoubleArray.remove(1.7);
        System.out.println(MyDoubleArray);

        MyDoubleArray.clear();
        System.out.println(MyDoubleArray);

        System.out.println("MyDoubleArray.isEmpty() = " + MyDoubleArray.isEmpty());


    }
}
