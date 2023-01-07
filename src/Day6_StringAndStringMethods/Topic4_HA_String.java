package Day6_StringAndStringMethods;

public class Topic4_HA_String {
    public static void main(String[] args) {
        /*
        String is very important
        In Java, string is an object that represents a sequence of chars.
        'a'
        "abc"
        How to create a string object?
        there are 2 ways to create String object
        1- String literal
        String s = "something";
        String s2 = "another thing"; // string pool
        // String pool, heap memory

        2- new keyword
        Scanner scan = new Scanner(parameter);  <- how we are defining a scanner

        // ObjectType VariableName = new ObjectType(parameter);   <-this is how we are defining an object

        String s3 = new String("something");  <- Heap Memory
        String s3 = "something";              <- String pool
         */

        String s1 = "cat";
        String s2 = "cat";
        String s3 = new String("cat");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
