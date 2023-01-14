package Day10_NestedLoops;

public class Topic3_HA_doWhileLoop {
    public static void main(String[] args) {
        /*

        do while loop is another loop type
        we had for loop, while loop and now we have do while loop

        do {
            // code block
        }while ( condition);

        so no matter what is the condition, we will run the code block at least 1 time

         */

        int i = 1;
        do {
            System.out.println("i = " + i);
            i++;
        }while (i<=5);
    }
}
