package Day21_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Topic3_HA_Example {
    public static void main(String[] args) {
/*
create 3 different arraylist : Double , Integer , String .
use add method to add 5 data for each of arraylist(use add(data) also use add(index,data))
use remove method to remove 2 of them (use index number to remove or object name to remove)
print size of list
use indexof method to print last index of arraylists
use contains method to check if your arraylist are contain the data that you passed
use Collections.sort method to sort your arrray list and use get method to print them
use clear method to clear all your list
check if they are empty by isEmpty method
use bulk operations to add multiple data(10) to your arraylist
use containsAll method to check if they are contain those data that you passed
use retainAll to retain ony 5 data in your lists
use removeall method to remove 3 data in your list
while you working on this make sure to use print line each time so you can see what differences has been made to your lists
 */

        //create 3 different arraylist : Double , Integer , String.
        ArrayList<Double> MyDoubleArray = new ArrayList<>();
        ArrayList<Integer> MyIntegerArray = new ArrayList<>();
        ArrayList<String> MyStringArray = new ArrayList<>();

        //use add method to add 5 data for each of arraylist(use add(data) also use add(index,data))

        MyDoubleArray.add(3.5);
        MyDoubleArray.add(1.2);
        MyDoubleArray.add(7.7);
        MyDoubleArray.add(1, 1.0);
        MyDoubleArray.add(3, 6.7);

        MyIntegerArray.addAll(Arrays.asList(5,99,-3,-4,11));

        MyStringArray.add("Florida");
        MyStringArray.add(0, "Toronto");
        MyStringArray.addAll(Arrays.asList("New York", "Winnipeg", "Erie"));


        //use remove method to remove 2 of them (use index number to remove or object name to remove)
        MyDoubleArray.remove(4);//<- this will remove the last element
        MyDoubleArray.remove(0);//<- this will remove the first element

        MyIntegerArray.remove(1);
        MyIntegerArray.remove(3);

        MyStringArray.remove("Winnipeg");
        MyStringArray.remove(0);

        //print size of list
        //oldarray.length
        System.out.println("MyDoubleArray.size() = " + MyDoubleArray.size());
        System.out.println("MyIntegerArray.size() = " + MyIntegerArray.size());
        System.out.println("MyStringArray.size() = " + MyStringArray.size());
        System.out.println("MyStringArray = " + MyDoubleArray);
        System.out.println("MyIntegerArray = " + MyIntegerArray);
        System.out.println("MyStringArray = " + MyStringArray);

        //use indexof method to print last index of arraylists
        int IndexOfDouble = MyDoubleArray.indexOf(6.7);
        int IndexOfInteger = MyIntegerArray.indexOf(-4);
        int IndexOfString = MyStringArray.indexOf("Erie");

        //use contains method to check if your arraylist are contain the data that you passed
        MyStringArray.contains("Florida");

//        MyStringArray.containsAll(Arrays.asList())




    }
}
