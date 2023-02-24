package Day30_CollectionFramework;

import java.util.LinkedList;

public class Topic3_HA_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> MyZoo = new LinkedList<>();
        MyZoo.add("Dog");
        MyZoo.add("Penguin");
        MyZoo.add("Cow");
        MyZoo.add("Cheetah");
        MyZoo.add("Tiger");
        MyZoo.add("Lion");

        System.out.println(MyZoo);

        /*
        What is the difference between LinkedList and ArrayList;

        LinkedList
        1- Implements List, DeQueue and Queue interfaces
        2- Stores 3 values (Previous Address, data, next address) in a single position
        3- Provides the doubly-linked list implementation.
        4- Whenever an element is added, prev and next address are changed.
        5- To access an element, we need to iterate from the beginning to the element.

        ArrayList
        1- Implements List interface.
        2- Stores a single values in a single position
        3- Provides a resizable array implementation
        4- Whenever an element is added, all elements after that position are shifted.
        5- Can randomly access elements using indexes.

        Use Arraylist for storing and accessing data, Linkedlist to manipulate data.
         */

    }
}
