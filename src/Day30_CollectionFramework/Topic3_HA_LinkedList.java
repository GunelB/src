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
        1- Implements List, Deque and Queue interfaces
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

        // Queue Interface methods
        /*
        addFirst()	adds the specified element at the beginning of the linked list
        addLast()	adds the specified element at the end of the linked list
        Same as above -> add(yourarraylist.size(), "MyValue");
        getFirst()	returns the first element
        getLast()	returns the last element
        removeFirst()	removes the first element
        removeLast()	removes the last element
        peek()	returns the first element (head) of the linked list
        poll()	returns and removes the first element from the linked list
        offer()	adds the specified element at the end of the linked list
         */

//        MyZoo.add(0, "Element");
//        MyZoo.addFirst("Element");
//
//        MyZoo.add(MyZoo.size(),  "Element");
//        MyZoo.addLast("Element");

        String HeadElement = MyZoo.peek();
        System.out.println("HeadElement = " + HeadElement);

        System.out.println("*************************");

        String PollElement = MyZoo.poll();
        System.out.println("PollElement = " + PollElement);
        System.out.println(MyZoo);

        MyZoo.offer("Monkey");
        System.out.println(MyZoo);



    }
}
