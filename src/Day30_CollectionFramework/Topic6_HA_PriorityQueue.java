package Day30_CollectionFramework;

import java.util.PriorityQueue;

public class Topic6_HA_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> MyQueue = new PriorityQueue<>();

        MyQueue.offer("Welcome");
        MyQueue.offer("to");
        MyQueue.offer("Java");
        MyQueue.offer("4");
        MyQueue.offer("Testers");

        System.out.println(MyQueue);


        //4
        //Java
        //Testers
        //To
        //Welcome

        // Numbers
        // A-Z    65-96
        // a-z    97-
        System.out.println("******************");
        // poll
        while(!MyQueue.isEmpty()){
            String Value = MyQueue.poll();
            System.out.println(Value);
        }

        System.out.println(MyQueue);
    }
}
