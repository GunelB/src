package Day30_CollectionFramework;

import java.util.Vector;

public class Topic4_HA_Vector {
    public static void main(String[] args) {
        //Datatype Variablename = new datatype();

        Vector<Integer> MyVector = new Vector<>();

        MyVector.add(8476);
        MyVector.add(2);
        MyVector.add(8476);
        MyVector.add(4);
        MyVector.add(1);
        MyVector.add(1);
        MyVector.add(999);
        MyVector.add(null);
        MyVector.add(1794);

        System.out.println(MyVector);

        // If someone else tries to set index 2 at the same time, He/She will get an exception.
        // ConcurrentModificationException
        MyVector.set(2, 111);

        /*
        In Java, Arraylist and Vector are almost the same.
        Vector is thread-safe, Arraylist is not.
        This means whenever we want to perform some operations on vectors, the Vector class automatically applies a lock to that operation.
        So at the time, someone else can not change the value too.
        It is because when one thread is accessing a vector, and at the same time another thread tries to access it, an exception called "ConcurrentModificationException" is generated.

        Note: If thread safety is not important it is recommended to use ArrayList instead of Vector because vectors are less efficient.
         */
    }
}
