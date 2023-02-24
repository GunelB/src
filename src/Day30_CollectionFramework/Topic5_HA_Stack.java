package Day30_CollectionFramework;

import java.util.Stack;

public class Topic5_HA_Stack {
    public static void main(String[] args) {
        Stack<String> MyStack = new Stack<>();

        MyStack.add("Dog");
        MyStack.add("Penguin");
        MyStack.add("Cow");
        MyStack.add("Cheetah");
        MyStack.add("Tiger");
        MyStack.add("Lion");
        System.out.println(MyStack);

        MyStack.push("Monkey");
        System.out.println(MyStack);

        System.out.println(MyStack.peek());

        System.out.println("***************************");
        System.out.println(MyStack.pop());

        System.out.println(MyStack.peek()); // <----

        int position = MyStack.search("Tiger");
        System.out.println("position = " + position);

        System.out.println(MyStack);
        System.out.println(MyStack.search("Cow"));

    }
}
